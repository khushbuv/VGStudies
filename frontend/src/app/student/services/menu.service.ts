import { Injectable } from '@angular/core';

@Injectable()
export class MenuService {

  sidebarToggled:boolean =false
  constructor() { }

  toggledSideBar(){
    this.sidebarToggled = !this.sidebarToggled
  }
}
