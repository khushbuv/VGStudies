import { Component, OnInit } from '@angular/core';
import * as $ from 'jquery';

@Component({
  selector: 'app-groups',
  templateUrl: './groups.component.html',
  styleUrls: ['./groups.component.css']
})
export class GroupsComponent implements OnInit {

  constructor() { }

  ngOnInit() {
    $(document).ready(function () {
      $('#all_my_btn').click(function () {
        if ($(this).text() === "All") {
          $(this).text("My");
        } else {
          $(this).text("All")
        }
      });

    });

  }

}
