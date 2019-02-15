import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { StudentRoutingModule } from './student-routing.module';
import { HomeComponent } from './home/home.component';
import { DocsComponent } from './docs/docs.component';
import { GroupsComponent } from './groups/groups.component';
import { HangoutComponent } from './hangout/hangout.component';
import { NotesComponent } from './notes/notes.component';
import { ProfileComponent } from './profile/profile.component';
import { QPaperComponent } from './q-paper/q-paper.component';
import { SidebarComponent } from './sidebar/sidebar.component';
import { ClassesComponent } from './classes/classes.component';
import { UserComponent } from './user/user.component';
import { NavbarComponent } from './navbar/navbar.component';
import { FooterComponent } from './footer/footer.component';
import { MenuService } from './services/menu.service';
import { ChatComponent } from './chat/chat.component';
import { AddNoteComponent } from './add-note/add-note.component';
import { AddQpaperComponent } from './add-qpaper/add-qpaper.component';
import { CreateGroupComponent } from './create-group/create-group.component';

@NgModule({
  imports: [
    CommonModule,
    StudentRoutingModule
  ],
  declarations: [HomeComponent, DocsComponent, GroupsComponent, HangoutComponent, NotesComponent, ProfileComponent, QPaperComponent, SidebarComponent, ClassesComponent, UserComponent, NavbarComponent, FooterComponent, ChatComponent, AddNoteComponent, AddQpaperComponent, CreateGroupComponent],
  providers:[MenuService]
})
export class StudentModule { }
