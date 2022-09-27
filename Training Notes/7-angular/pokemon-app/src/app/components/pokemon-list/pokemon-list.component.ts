import { Component } from '@angular/core';
import { Pokemon } from '../../models/pokemon.model';

@Component({
    selector: 'app-pokemon-list',
    templateUrl: './pokemon-list.component.html',
    styleUrls: ['./pokemon-list.component.css']
})

export class PokemonListComponent {
    
    title: string = "List of Pokemon";
    src1: string = "https://upload.wikimedia.org/wikipedia/commons/6/6a/Door_Tree_1898.png";

    isImageVisible: boolean = true;

    listOfPokemon: Pokemon[] = [];

    constructor(){
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

    changeImageVisible(){
        this.isImageVisible = !this.isImageVisible;
    }


}