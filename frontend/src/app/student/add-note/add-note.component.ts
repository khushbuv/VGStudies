import { Component, OnInit } from '@angular/core';
import * as $ from 'jquery';

@Component({
  selector: 'app-add-note',
  templateUrl: './add-note.component.html',
  styleUrls: ['./add-note.component.css']
})
export class AddNoteComponent implements OnInit {

  constructor() { }

  ngOnInit() {
    $(document).ready(function () {
      var newEntry = [];
      var i = 0;
      $('#note_upload_file_btn').click(function () {
        newEntry[i++] = $('#noteFile').clone().appendTo($('#upload_file_column'));
      });

      $('#note_remove_file_btn').click(function () {
        newEntry[--i].remove();
      });
      $('#noteCategory_select').change(function () {
        var selected = $('#noteCategory_select option:selected').text();
        if (selected === 'other') {
          $('#new_category_form').show();
        }
        else {
          $('#new_category_form').hide();
        }
      });
      $('#privacy_select').change(function () {
        var selected = $('#privacy_select option:selected').text();
        if (selected === 'Assign to group/s') {
          $('#select_groups_form').show();
        } else {
          $('#select_groups_form').hide();
        }
      });
    });

  }

}
