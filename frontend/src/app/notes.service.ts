import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class NotesService {

  constructor() { }
  getNotes(){
    var text = '{ "notes" : [' +
'{ "filename":"Electrostat" , "category":"physics" ,"Date":"12:12:2018"},' +
'{ "filename":"Thermodynamics" , "category":"physics" ,"Date":"12:12:2018"},' +
'{ "filename":"Radioactivity" , "category":"chemistry" ,"Date":"12:12:2018"} ]}';
var obj = JSON.parse(text);
    
   return obj;
  }
}
