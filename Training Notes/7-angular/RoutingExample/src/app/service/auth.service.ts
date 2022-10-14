import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  hasLoggedIn: boolean = false;

  constructor() { }

  login(){
    this.hasLoggedIn = true;
  }

  logout(){
    this.hasLoggedIn = false;
  }

}
