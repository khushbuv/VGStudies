import { Component, OnInit } from '@angular/core';
import {NotesService} from '../notes.service';
import { ActivatedRoute, Router } from '@angular/router';
import { getNumberOfCurrencyDigits } from '@angular/common';



@Component({
  selector: 'app-notes',
  templateUrl: './notes.component.html',
  styleUrls: ['./notes.component.scss']
})
export class NotesComponent implements OnInit {
  
  Notes: any = [];

  constructor(public notesService: NotesService,private route: ActivatedRoute, private router: Router) { }


 
  ngOnInit() {
    this.getNotes(123);
  }

  getNotes(id){
    this.Notes = [];
    this.notesService.getNotes(id).subscribe((data: {})=>{
      console.log(data);
      this.Notes = data;
    });
  }

}
