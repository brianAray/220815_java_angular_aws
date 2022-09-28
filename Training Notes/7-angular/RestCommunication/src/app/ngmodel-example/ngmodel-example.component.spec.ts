import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NgmodelExampleComponent } from './ngmodel-example.component';

describe('NgmodelExampleComponent', () => {
  let component: NgmodelExampleComponent;
  let fixture: ComponentFixture<NgmodelExampleComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NgmodelExampleComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(NgmodelExampleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
