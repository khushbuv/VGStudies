import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AuthGuardService } from './auth/guards/auth-guard.service';

const appRoutes: Routes = [
{
   path:'student', 
   canActivate: [AuthGuardService],
   loadChildren: './student/student.module#StudentModule' 
}];

@NgModule({
  imports: [RouterModule.forRoot(appRoutes,{enableTracing : false})],
  exports: [RouterModule]
})

export class AppRoutingModule { }