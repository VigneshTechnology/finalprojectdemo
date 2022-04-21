import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutComponent } from './about/about.component';
import { AddComponent } from './add/add.component';
import { ContactComponent } from './contact/contact.component';
import { DeleteComponent } from './delete/delete.component';
import { FetchComponent } from './fetch/fetch.component';
import { UpdateComponent } from './update/update.component';

const routes: Routes = [
  {path :'add-component', component:AddComponent},
  {path : 'delete-component', component:DeleteComponent},
  {path : 'fetch-component', component:FetchComponent},
  {path : 'update-component', component:UpdateComponent},
  {path : 'about-component', component:AboutComponent},
  {path : 'contact-component', component:ContactComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingComponents = [AddComponent,DeleteComponent,FetchComponent,UpdateComponent,AboutComponent]