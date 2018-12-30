import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { MenuService } from '../services/menu.service';

@Component({
  selector: 'app-sidebar',
  templateUrl: './sidebar.component.html',
  styleUrls: ['./sidebar.component.css']
})
export class SidebarComponent implements OnInit {

  homeClicked:boolean = true
  profileClicked:boolean = false
  docClicked:boolean = false
  notesClicked:boolean=false
  qPaperClicked:boolean=false
  classesClicked:boolean=false
  groupClicked:boolean=false
  hangoutClicked:boolean=false

  constructor(private router:Router,private menuService:MenuService) { }

  ngOnInit() {
   
  }
  navigate(type:string){
  this.homeClicked = false
  this.profileClicked = false
  this.docClicked = false
  this.notesClicked=false
  this.qPaperClicked=false
  this.classesClicked=false
  this.groupClicked=false
  this.hangoutClicked=false
  if(type == 'home'){
    this.homeClicked = true
    this.router.navigate(['/student/home'])
  }else if(type == 'profile'){
    this.profileClicked = true
    this.router.navigate(['/student/profile'])
  }else if(type == 'docs'){
    this.docClicked = true
    this.router.navigate(['/student/docs'])
  }else if(type == 'notes'){
    this.notesClicked=true
    this.router.navigate(['/student/notes'])
  }else if(type == 'q-paper'){
    this.qPaperClicked=true
    this.router.navigate(['/student/q-paper'])
  }else if(type == 'classes'){
    this.classesClicked=true
    this.router.navigate(['/student/classes'])
  }else if(type == 'groups'){
    this.groupClicked=true
    this.router.navigate(['/student/groups'])
  }else if(type == 'hangout'){
    this.hangoutClicked=true
    this.router.navigate(['/student/hangout'])
  }
  }
}
