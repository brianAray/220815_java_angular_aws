import { Component, DoCheck, OnDestroy, OnInit } from '@angular/core';
import { Pokemon } from '../../models/pokemon.model';

/**
 * Decorators are functions that we use to attach metadata to a class declaration
 * method, accessor, property or parameter
 * 
 */

@Component({
    selector: 'app-pokemon-list',
    templateUrl: './pokemon-list.component.html',
    styleUrls: ['./pokemon-list.component.css']
})

// Export the class in order to import it in other files
export class PokemonListComponent implements OnInit, DoCheck, OnDestroy{
    
    title: string = "List of Pokemon";
    src1: string = "https://upload.wikimedia.org/wikipedia/commons/6/6a/Door_Tree_1898.png";

    isImageVisible: boolean = true;

    listOfPokemon: Pokemon[] = [];

    clickedPokemonName: string = "";

    constructor(){ }



    /**
     * Called once, after the first ngOnChanges(), typically holds the intialization of the component instead of the constructor
     */
    ngOnInit(){
        this.listOfPokemon = [
            {
                id: 132,
                base_experience: 101,
                name: "Ditto",
                rating: 5,
                sprites: {
                    front_default: 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/132.png'
                }
            },
            {
               id: 25,
               base_experience: 202,
               name: "Pikachu",
               rating: 8,
               sprites: {
                front_default: 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/25.png'
               } 
            }
        ];
    }

    /**
     * Detect and act upon changes that Angular can't or won't detect on its own
     * 
     * 
     */
    ngDoCheck(): void {
        console.log("Here!");
    }

    /**
     * Used for cleanup, called immediately before Angular destroys the component
     */
    ngOnDestroy(): void {
        console.log("Component Destroyed");
    }

    changeImageVisible(){
        this.isImageVisible = !this.isImageVisible;
    }

    displayPokemonName($event: string) {
        this.clickedPokemonName = $event;
    }

}