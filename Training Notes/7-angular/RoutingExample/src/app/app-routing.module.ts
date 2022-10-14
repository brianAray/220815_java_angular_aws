import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './component/home/home.component';
import { AccountComponent } from './component/account/account.component';
import { ErrorComponent } from './component/error/error.component';
import { FoodComponent } from './component/food/food.component';
import { AdminGuard } from './guard/admin.guard';


const routes: Routes = [
  {path: '', component: HomeComponent},
  {
    path: 'account', 
    component: AccountComponent,
    canActivate: [AdminGuard]
  },
  {path: 'food', component: FoodComponent},
  {path: 'fod', redirectTo:'food', pathMatch:'full'},
  {path: '**', component: ErrorComponent},
]


@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    RouterModule.forRoot(routes)
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
