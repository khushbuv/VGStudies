import { Component, OnInit } from '@angular/core';
import { AuthService } from '../../auth/services/auth.service';
import { MenuService } from '../services/menu.service';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {

  userClicked:boolean = false;
  constructor(private authService:AuthService, private menuService:MenuService) { }

  ngOnInit() {
  }

  userClick(){
    this.userClicked = !this.userClicked
  }

  logout(){
this.authService.signOut()
  }

  toggledSideBar(){
    this.menuService.toggledSideBar()
  }
}
