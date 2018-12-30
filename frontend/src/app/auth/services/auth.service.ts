import { Injectable } from '@angular/core';
import { Router } from '@angular/router';

@Injectable()
export class AuthService {

  authenticated: boolean = false
  constructor(private router:Router) { }


  checkLogin(){
    return this.authenticated
    
  }

  authSuccess(){
    console.log('authSuccess');
    this.authenticated = true
    this.router.navigate(['/student'])
  }

  signOut(){
    this.authenticated = false
    this.router.navigate(['/login'])
    
  }
}
