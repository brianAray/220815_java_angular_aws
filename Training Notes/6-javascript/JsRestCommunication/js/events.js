let searchContainer = document.querySelector("#search_container");


let searchBox = document.querySelector("#search_box");

let submitButton = document.querySelector("#submit");



function printText(){
    alert(searchBox.value);
}

submitButton.addEventListener("click", printText);



let outerDiv = document.querySelector("#outer_div");
let innerDiv = document.querySelector("#inner_div");
let innerParagraph = document.querySelector("#inner_p");

/*
Event capturing & bubbling

By default, most events are bubbling meaning they propogate from the inner most element to the outer most element

Event Capturing is the inverse, it propogates from the outer most element to the inner most
*/

outerDiv.addEventListener("click", function(){
    alert("outer_div");
}, true)
innerDiv.addEventListener("click", function(){
    alert("inner_div");
}, true)
innerParagraph.addEventListener("click", function(){
    alert("inner_paragraph");
}, true)