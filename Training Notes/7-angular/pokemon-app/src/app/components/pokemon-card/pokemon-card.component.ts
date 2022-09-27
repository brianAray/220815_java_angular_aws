import { Component, OnInit, Input , Output, EventEmitter} from '@angular/core';
import { Pokemon } from 'src/app/models/pokemon.model';

@Component({
  selector: 'app-pokemon-card',
  templateUrl: './pokemon-card.component.html',
  styleUrls: ['./pokemon-card.component.css']
})
export class PokemonCardComponent implements OnInit {

  /**
   * Input() decorator in a child component class indicates that the parent component will be passing in data
   */
  @Input() pokemon!: Pokemon;

  @Input() isImageVisible: boolean = true;

  /**
   * Output is a decorator function that marks a property as a way for data to go from child to parent
   * 
   * clickPokemonEvent is the name of the Output
   * 
   * EventEmitter<string> is te Outputs type
   * 
   * new EventEmitter<string() tells Angualr to create a new event emitter and its data type to be string
   */
  @Output() clickPokemonEvent = new EventEmitter<string>();

  constructor() { }

  ngOnInit(): void {
  }

  printPokemonName(pokemonName: string) {
    this.clickPokemonEvent.emit(pokemonName);
  }

  getColor(pokemonExperience: number): string{
    if (pokemonExperience > 200){
      return 'blue';
    }else if(pokemonExperience > 100){
      return 'yellow';
    }else{
      return 'orange';
    }
  }

}
