import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { QPaperComponent } from './q-paper.component';

describe('QPaperComponent', () => {
  let component: QPaperComponent;
  let fixture: ComponentFixture<QPaperComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ QPaperComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(QPaperComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
