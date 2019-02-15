import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { QPaperComponent } from './q-paper/q-paper.component';
import { ProfileComponent } from './profile/profile.component';
import { GroupsComponent } from './groups/groups.component';
import { HangoutComponent } from './hangout/hangout.component';
import { DocsComponent } from './docs/docs.component';
import { NotesComponent } from './notes/notes.component';
import { ClassesComponent } from './classes/classes.component';
import { UserComponent } from './user/user.component';
import { AddNoteComponent } from './add-note/add-note.component';
import { AddQpaperComponent } from './add-qpaper/add-qpaper.component';

const routes: Routes = [{
  path: '',
  // redirectTo: 'home',
  //pathMatch: 'full'
  component: UserComponent,
  children: [{
    path: '',
    redirectTo: 'home',
    pathMatch: 'full'
  }, {
    path: 'notes',
    component: NotesComponent
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
  },
  {
    path: 'add-note',
    component: AddNoteComponent
  },
  {
    path: 'add-qpaper',
    component: AddQpaperComponent
  }
  ]

}

];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class StudentRoutingModule { }
