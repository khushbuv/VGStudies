import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders, HttpErrorResponse, HttpParams} from '@angular/common/http';
import {Observable, of} from 'rxjs';
import {map, catchError, tap} from 'rxjs/operators';

const endpoint = 'http://localhost:8080/notes/';
const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type': 'application/json',
    'Access-Control-Allow-Origin': '*'
  })
};

@Injectable({
  providedIn: 'root'
})
export class NotesService {

  constructor(private http: HttpClient) { }

  private extractData (res: Response) {
    let body = res;
    return body || {};
  }
  getNotes (id): Observable<any> {
    let params = new HttpParams();
    params = params.append('tdate','2018-12-27');
    params = params .append('duration','last_week');
    return this.http.get(endpoint+id+"?"+params).pipe(map(this.extractData));
  }

  private handleError<T> (operation = 'operation', result?:T){
    return(error: any): Observable<T> => {
      console.error(error);
      console.log(`${operation} failed: ${error.message}` );

      return of(result as T);
    };
  }
}
