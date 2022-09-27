import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { PokemonListComponent } from './components/pokemon-list/pokemon-list.component';
import { PokemonCardComponent } from './components/pokemon-card/pokemon-card.component';
import { ShoppingListComponent } from './components/shopping-list/shopping-list.component';

/**
 * Angular Apps are modular and it has its own modularity system in the form of NgModules
 * NgModules are containers for a cohesive block of code dedicated to the apps domain, a workflow
 * or a closely related set of capabilities
 * 
 * They can contain components, service providers, and other code files whose scope is deifned by
 * the NgModule. They can import funcitonaltiy from other NgModules, and export them out to others
 * 
 * There is always one NgModule, the root module, conveniently named the AppModule
 * You launch your application by bootstrapping the root NgModule
 */
@NgModule({
  declarations: [
    AppComponent,
    PokemonListComponent,
    PokemonCardComponent,
    ShoppingListComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
