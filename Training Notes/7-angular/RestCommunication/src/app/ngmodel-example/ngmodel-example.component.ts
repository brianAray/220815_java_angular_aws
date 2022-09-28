import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-ngmodel-example',
  templateUrl: './ngmodel-example.component.html',
  styleUrls: ['./ngmodel-example.component.css']
})
export class NgmodelExampleComponent implements OnInit {

  value: string = '';

  constructor() { }

  ngOnInit(): void {
  }

  setValue(){
    this.value = "Something Predefined";
  }

  onSubmit(formId : NgForm){
    console.log(formId.value);
    console.log(formId.valid);
  }
}
