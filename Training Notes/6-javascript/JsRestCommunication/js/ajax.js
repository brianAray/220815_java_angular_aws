let searchContainer = document.querySelector("#search_container");
let pokemonContainer = document.querySelector("#pokemon_container");

let pokemonId = document.querySelector("#id");
let pokemonName = document.querySelector("#name");
let pokemonSprite = document.querySelector("#sprite");

let searchBox = document.querySelector("#search_box");
let submitButton = document.querySelector("#submit");


submitButton.addEventListener("click", ajaxCall);


function ajaxCall(){
    let pokeId = searchBox.value;

    // First attain the XMLHttpRequest Object to send the request
    let xhr = new XMLHttpRequest();

    /**
     * 0 . UNSENT: open() method has not been called
     * 1 . OPENED: open() method has been called
     * 2 . HEADERS_REQUEST: send() method has been called and the headers + status code of the HTTP response is available
     * 3 . LOADING: downloading the full response from the server
     * 4 . DONE: entire operation is complete and now we have a server response
     */

    xhr.onreadystatechange = function(){

        // Check that the ready is 4 and the status code is 200
        if(this.readyState == 4 && this.status == 200){
            // If it is successfull then grab the data and PARSE from JSON String to an Object

            let receivedPokemon = JSON.parse(xhr.responseText);

            console.log(receivedPokemon);

            renderHtml(receivedPokemon);
        }
    }

    xhr.open("GET", `https://pokeapi.co/api/v2/pokemon/${pokeId}`);

    xhr.send();
}


function renderHtml(receivedPokemon){
    pokemonId.innerText = receivedPokemon.id;
    pokemonName.innerText = receivedPokemon.name;
    pokemonSprite.src = receivedPokemon.sprites.front_default;
}