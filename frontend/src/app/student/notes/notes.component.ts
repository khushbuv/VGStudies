import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';
import * as $ from 'jquery';

@Component({
  selector: 'app-notes',
  templateUrl: './notes.component.html',
  styleUrls: ['./notes.component.css']
})
export class NotesComponent implements OnInit {

  addNoteClicked:boolean =  false
  constructor(private router: Router) { }

  ngOnInit() {
    $(document).ready(function () {
      $('#privacy_select').change(function () {
        var selected = $('#privacy_select option:selected').text();
        if (selected === 'groups') {
          $('#groups_multi_select').show();
        } else {
          $('#groups_multi_select').hide();
        }
      });
    });
  }

  navigateToAddNote(){
     this.addNoteClicked = true
     this.router.navigate(['/student/add-note'])
  }

}
