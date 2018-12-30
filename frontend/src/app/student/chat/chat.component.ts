import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-chat',
  templateUrl: './chat.component.html',
  styleUrls: ['./chat.component.css']
})
export class ChatComponent implements OnInit {

  hideChatBox:boolean = false
  constructor() { }

  ngOnInit() {
  }

  toggleChatBox(){
    this.hideChatBox = !this.hideChatBox
  }
}
