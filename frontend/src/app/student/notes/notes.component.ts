import { Component, OnInit } from '@angular/core';
import * as $ from 'jquery';

@Component({
  selector: 'app-notes',
  templateUrl: './notes.component.html',
  styleUrls: ['./notes.component.css']
})
export class NotesComponent implements OnInit {

  constructor() { }

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

}
