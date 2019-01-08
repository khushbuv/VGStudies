import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { environment } from '../../../environments/environment';
import * as Stomp from 'stompjs';
import * as SockJS from 'sockjs-client';
@Injectable()
export class AuthService {
  loggedInUserName:string =""
  loggedInUserPhoto:string = ""
  authenticated: boolean = false
  socket:any
  stompClient:any
  constructor(private router:Router, private httpClient: HttpClient) { }


  checkLogin(){
    return this.authenticated
    
  }

  getConnection(){
    if(!this.socket){
      this.socket = new SockJS(environment.apiBaseUrl+'/ws');
      this.stompClient = Stomp.over(this.socket);
    //  this.stompClient.connect();
    }
   
    return this.stompClient
  }

   onConnected() {
   console.log("Connect ok")
  }

  onError(){
    console.log("Connect not ok")
  }
  authSuccess(userName){
    console.log('authSuccess ' +userName);
    this.httpClient.get(environment.apiBaseUrl+'/auth/login',{
      params:new HttpParams()
      .set('userName',`${userName}`)
    }).subscribe((data:any) =>{

      this.loggedInUserName = data.userName
      this.loggedInUserPhoto = data.photo
      this.authenticated = true
      this.router.navigate(['/student'])
    })

    this.authenticated = true
    this.router.navigate(['/student'])
  }

  signOut(){
    this.authenticated = false
    this.router.navigate(['/login'])
    
  }
}
