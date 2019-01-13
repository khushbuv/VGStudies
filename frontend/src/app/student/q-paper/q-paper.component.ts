import { Component, OnInit } from '@angular/core';
import * as $ from 'jquery';

@Component({
  selector: 'app-q-paper',
  templateUrl: './q-paper.component.html',
  styleUrls: ['./q-paper.component.css']
})
export class QPaperComponent implements OnInit {

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
