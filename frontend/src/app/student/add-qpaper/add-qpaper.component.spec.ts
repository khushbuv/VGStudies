import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AddQpaperComponent } from './add-qpaper.component';

describe('AddQpaperComponent', () => {
  let component: AddQpaperComponent;
  let fixture: ComponentFixture<AddQpaperComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddQpaperComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddQpaperComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
