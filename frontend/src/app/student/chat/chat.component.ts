import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-chat',
  templateUrl: './chat.component.html',
  styleUrls: ['./chat.component.css']
})
export class ChatComponent implements OnInit {

  hideChatBox:boolean = false
  hideChatRoom:boolean = false
  closeChatBox:boolean = false
  hideChatBox1:boolean = false
  closeChatBox1:boolean = false
  constructor() { }

  ngOnInit() {
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
}
