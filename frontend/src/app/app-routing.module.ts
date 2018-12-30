import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { NotesComponent} from  './notes/notes.component';
import {DocsComponent} from './docs/docs.component';
import {ClassesComponent} from './classes/classes.component';
import {ProfileComponent} from './profile/profile.component';
import {QPaperComponent} from './q-paper/q-paper.component';
import { GroupsComponent } from './groups/groups.component';
import { HangoutComponent } from './hangout/hangout.component';
import { HomeComponent } from './home/home.component';

const routes: Routes = [
  {
    path: 'notes',
    component: NotesComponent,
    data: {title: 'Notes'}
  },
  {
    path: 'docs',
    component: DocsComponent
  },
  {
    path: 'classes',
    component: ClassesComponent
  },
  {
    path: 'profile',
    component: ProfileComponent
  },
  {
    path: 'q-paper',
    component: QPaperComponent
  },
  {
    path: 'groups',
    component: GroupsComponent
  },
  {
    path: 'hangout',
    component: HangoutComponent
  },
  {
    path: 'home',
    component: HomeComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
