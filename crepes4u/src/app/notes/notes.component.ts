import { Component, OnInit } from '@angular/core';
import {NotesService} from '../notes.service';
import {Observable} from 'rxjs';

@Component({
  selector: 'app-notes',
  templateUrl: './notes.component.html',
  styleUrls: ['./notes.component.scss']
})
export class NotesComponent implements OnInit {
  testvar: string;

  constructor(private nService: NotesService) {
    this.testvar = "test";
   }

  ngOnInit() {
  
  }

}
