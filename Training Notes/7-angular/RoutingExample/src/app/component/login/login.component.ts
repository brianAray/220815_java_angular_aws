import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { DummyRestService } from 'src/app/service/dummy-rest.service';
import { Router } from '@angular/router';
import { AuthService } from 'src/app/service/auth.service';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(
    private dummyRest: DummyRestService,
    private router: Router,
    private auth: AuthService) { }

  ngOnInit(): void {
  }

  onSubmit(loginData: NgForm){
    let check = this.dummyRest.login(loginData.value);
    if(check){
      this.auth.login();
      this.router.navigateByUrl('/account');
    }else{
      alert("Invalid Login!");
    }
  }
}
