import { Component, OnInit } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { AuthService } from '../../auth/services/auth.service';
import { environment } from '../../../environments/environment';
import * as Stomp from 'stompjs';
import * as SockJS from 'sockjs-client';
@Component({
  selector: 'app-chat',
  templateUrl: './chat.component.html',
  styleUrls: ['./chat.component.css']
})
export class ChatComponent implements OnInit {
  stompClient:any
  onlineUser:any[] = []
  openChatBoxUser:any[] = []
  hideChatBox:boolean = false
  hideChatRoom:boolean = false
  closeChatBox:boolean = false
  hideChatBox1:boolean = false
  closeChatBox1:boolean = false
  constructor(private httpClient: HttpClient, private authService:AuthService) { }

  ngOnInit() {
    this.loadOnlineUser()
    this.loadOnlineGroup()
    
  }

  toggleChatBox(){
    this.hideChatBox = !this.hideChatBox
  }

  toggleChatBox1(){
    this.hideChatBox1 = !this.hideChatBox1
  }

  toggleChatRoom(){
    this.hideChatRoom = !this.hideChatRoom
  }
  closeChat1(){
    this.closeChatBox1 = !this.closeChatBox1
  }
  closeChat(){
    this.closeChatBox = !this.closeChatBox
  }

  loadOnlineUser(){
    this.httpClient.get(environment.apiBaseUrl+"/chat/onlineUser",{
      params:new HttpParams()
      .set('userName',`${this.authService.loggedInUserName}`)
    }).subscribe((data:any[])=>{
      console.log(JSON.stringify(data))
      data.forEach(user =>{
        this.onlineUser.push({name : user.userName , photo : user.photo, active: false, type: 1, roomId : user.key})
      })
    })
  }

  loadOnlineGroup(){
    this.httpClient.get(environment.apiBaseUrl+"/chat/groups",{
      params:new HttpParams()
      .set('userName',`${this.authService.loggedInUserName}`)
    }).subscribe((data:any[])=>{
      console.log(JSON.stringify(data))
      data.forEach(user =>{
        this.onlineUser.push({name : user.userName , photo : user.photo, active: false, type: 2, roomId : user.key})
      })
    })
  }


  openChatBox(user){
    this.onlineUser.forEach(filterUser =>{
      if(filterUser.name == user.name){
        filterUser.active = true
      }else {
        filterUser.active = false
      }
      
    })
    
    this.openChatBoxUser.forEach(chatUser =>{
      if(chatUser.name == user.name){
        chatUser.hideChatBox = false
      }else{
        chatUser.hideChatBox = true
      }
     
    })
    const isPresent = this.openChatBoxUser.find(chatUser => chatUser.name == user.name)
    if(isPresent){

    }else{
      
      if(this.openChatBoxUser.length == 2){
        this.openChatBoxUser[0] = this.openChatBoxUser[1]
        this.openChatBoxUser[1] = {roomId: user.roomId,name :user.name , photo : user.photo, type:user.type, closeChatBox: true, hideChatBox: false, message : []}
      }else{
        this.openChatBoxUser.push({roomId: user.roomId,name :user.name , photo : user.photo, closeChatBox: true, hideChatBox: false, message : []})
      }

      this.connectToUser(user.roomId,user.name)
    }
    
   
  }

  toggleUserChatBox(user){
    this.openChatBoxUser.filter(chatUser => chatUser.name == user.name).forEach(chatUser =>{
      chatUser.hideChatBox = !chatUser.hideChatBox
    })
  }

  closeUserChat(index:number){
    this.openChatBoxUser.splice(index,1)
  }


  sendMessage(chatMsg,user){
    this.openChatBoxUser.filter(chatUser => chatUser.name == user.name).forEach(chatUser =>{
      chatUser.message.push({msgLine: chatMsg.value, type : 1})
    })

    var chatMessage = {
      sender: this.authService.loggedInUserName,
      content: chatMsg.value,
      type: 'CHAT'
    };
  //  this.authService.getConnection().send(`http://localhost:8080/app/chat/${user.roomId}/sendMessage`, {}, JSON.stringify(chatMessage));
  this.authService.getConnection().send(
    `/app/chat/${user.roomId}/sendMessage`,
    {},
    JSON.stringify(chatMessage)
  );  
  chatMsg.value = ''
  }

  connectToUser(roomId,userName){
  /*  this.authService.getConnection().subscribe(`http://localhost:8080/channel/${roomId}`, this.onMessageReceived);
    
    this.authService.getConnection().send(`http://localhost:8080/app/chat/${roomId}/addUser`,
        {},
        JSON.stringify({sender: this.authService.loggedInUserName, type: 'JOIN'})
      );; */
   /*   const connection = this.authService.getConnection();
      connection.connect({}, function (frame) {
        connection.subscribe(`http://localhost:8080/channel/${roomId}`, function (hello) {
          this.onMessageReceived(JSON.parse(hello.body).greeting);
        });
      }); */

   //   const socket = new SockJS('http://localhost:8080/ws');
  //this.stompClient = Stomp.over(socket);
 
  const _this = this;
 const connection = this.authService.getConnection()
 connection.connect({}, function (frame) {
  connection.subscribe(`/channel/${roomId}`, function (hello) {
    _this.onMessageReceived(JSON.parse(hello.body),userName);
    });
  });
  }

  onMessageReceived(msg,userName){
console.log('Message1', msg)
if(msg.sender != this.authService.loggedInUserName){
  this.openChatBoxUser.filter(chatUser => chatUser.name == userName).forEach(chatUser =>{
    chatUser.message.push({msgLine: msg.content, type : 2})
  })
}

  }
}
