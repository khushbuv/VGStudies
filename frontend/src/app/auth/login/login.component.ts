import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from '../services/auth.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {


  constructor(private router:Router, private authService:AuthService) { }

  ngOnInit() {
  }

  login(userName){
    this.authService.authSuccess(userName);
  }

  register(){
    this.router.navigate(['/register'])
  }

  forgotPassword(){
    this.router.navigate(['/forgotPassword'])
  }
}
