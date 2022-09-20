let searchContainer = document.querySelector("#search_container");
let pokemonContainer = document.querySelector("#pokemon_container");

let pokemonId = document.querySelector("#id");
let pokemonName = document.querySelector("#name");
let pokemonSprite = document.querySelector("#sprite");

let searchBox = document.querySelector("#search_box");
let submitButton = document.querySelector("#submit");


submitButton.addEventListener("click", asyncCall);

async function asyncCall(){
    let pokeId = searchBox.value;
    let url = `https://pokeapi.co/api/v2/pokemon/${pokeId}`;

    try{

        let response = await fetch(url,{method: "GET"});
        
        let data = await response.json();
        renderHtml(data);

    }catch(error){
        console.error(`Error is ${error}`);
    }
}


function renderHtml(receivedPokemon){
    pokemonId.innerText = receivedPokemon.id;
    pokemonName.innerText = receivedPokemon.name;
    pokemonSprite.src = receivedPokemon.sprites.front_default;
}