import { Injectable } from '@angular/core';
import { Login } from '../model/login';

@Injectable({
  providedIn: 'root'
})
export class DummyRestService {

  constructor() { }

  login(data: Login){
    if(data.username === "user" && data.password === "pass"){
      return true;
    }else{
      return false;
    }
  }
}
