
// Selecting an element using CSS selectors and querySelector

 let body = document.querySelector("body");

console.log(body);

// Selecting all the children of a parent element
let bodyChildren = body.children;

console.log(bodyChildren);

for(let element of bodyChildren){
    console.log(element);
}

// // Selecting a specific child
// let paragraph = bodyChildren[2];

// console.log(paragraph);

// // Changing the inner text updates only the text
// paragraph.innerText = "Hello World";

// // Changing the innerHtml changes how the tag is displayed
// paragraph.innerHTML = "<p>Hello There</p>";




// Creating an element

let header = document.createElement("h1");

header.innerText = "New Header";

console.log(header);

// Adding the child to a element that is on the document allows it to be rendered
body.appendChild(header);



// Generating a page dynamically
let header1 = document.createElement("h1");

header1.innerText = "This is a header";

document.querySelector("body").appendChild(header1);


let emptyDiv = document.createElement("div");

//emptyDiv.setAttribute("id", "empty");

emptyDiv.id = "empty";

body.appendChild(emptyDiv);


let containerDiv = document.createElement("div");

containerDiv.id = "container";

let paragraphItem = document.createElement("p");
paragraphItem.innerText = "asdfasdgasgdasdgasgd";

containerDiv.appendChild(paragraphItem);

body.appendChild(containerDiv);




// Dynamic generation of elements using DOM manipulation and JS functionalities

let nameArray = ["Greg", "Mike", "Jim"];

let divContain = document.createElement("div");

divContain.id = "name_container";

headerPrinter(nameArray, divContain);

window.addEventListener("load", function(){
    this.alert("I ahve loaded");
})


function headerPrinter(nameArray, divContainer){
    for(let name of nameArray){
        let header = document.createElement("h4");
        header.innerText = name;
        divContainer.appendChild(header);
    }
    body.appendChild(divContainer);
}







