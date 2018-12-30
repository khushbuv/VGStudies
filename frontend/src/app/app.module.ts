import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SidebarComponent } from './sidebar/sidebar.component';
import { NotesComponent } from './notes/notes.component';
import { DocsComponent } from './docs/docs.component';
import { ClassesComponent } from './classes/classes.component';
import { ProfileComponent } from './profile/profile.component';
import { QPaperComponent } from './q-paper/q-paper.component';
import { GroupsComponent } from './groups/groups.component';
import { HangoutComponent } from './hangout/hangout.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import {HttpClientModule} from '@angular/common/http';
import {RouterModule, Routes} from '@angular/router';
import {FormsModule} from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    SidebarComponent,
    NotesComponent,
    DocsComponent,
    ClassesComponent,
    ProfileComponent,
    QPaperComponent,
    GroupsComponent,
    HangoutComponent,
    HomeComponent,
    LoginComponent
  ],
  imports: [
    FormsModule,
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
