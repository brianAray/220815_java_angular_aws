let searchContainer = document.querySelector("#search_container");
let pokemonContainer = document.querySelector("#pokemon_container");

let pokemonId = document.querySelector("#id");
let pokemonName = document.querySelector("#name");
let pokemonSprite = document.querySelector("#sprite");

let searchBox = document.querySelector("#search_box");
let submitButton = document.querySelector("#submit");


submitButton.addEventListener("click", fetchCall);

function fetchCall(){
    let pokeId = searchBox.value;

    fetch(`https://pokeapi.co/api/v2/pokemon/${pokeId}`)
        .then((response) => response.json())
        .then((data) => {
            renderHtml(data);
        }, (error) => {
            console.error(`Error is ${error}`)
        })
}


function renderHtml(receivedPokemon){
    pokemonId.innerText = receivedPokemon.id;
    pokemonName.innerText = receivedPokemon.name;
    pokemonSprite.src = receivedPokemon.sprites.front_default;
}