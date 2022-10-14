import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-sizer',
  templateUrl: './sizer.component.html',
  styleUrls: ['./sizer.component.css']
})
export class SizerComponent implements OnInit {

  @Input() size!: number;

  @Output() sizeChange = new EventEmitter<number>();

  constructor() { }

  ngOnInit(): void {
  }

  decrement(){
    this.resize(-1);
  }

  increment(){
    this.resize(1);
  }

  resize(amount: number){
    this.size += amount;
    this.sizeChange.emit(this.size);
  }

}
