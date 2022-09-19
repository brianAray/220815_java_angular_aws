console.log("Hello World");

// Variable Declaration

// Datatypes
// Strings
var name = "Brian";
var surname = 'Arayathel';

// Number
let number = 123;
let float = 123.5;

// BigInt
const x = BigInt(Number.MAX_SAFE_INTEGER);

// Boolean
let bool = true;
let falseBool = false;

// Symbol
// Symbols are unique and immutable primitive values and may be used as the key of an object
// property
// This is instantiating a symbol with the description "id"
let id = Symbol("id");
let id2 = Symbol("id");

console.log(id == id2);


// Undefined
// Indicate that a variable has not been assigned a value
console.log(undefined);

// Null
// The type has exactly one value, null
// Indicates a deliberate non-value
console.log(typeof null);


// Operators
// Very similar to what Java uses, all the same
// The only unique one is the comparison operator

console.log("1" == 1);
console.log("1" === 1);

// NaN
// Doing usually a mathematical operation on something you should not have
console.log(typeof (1 + "1" + 1) / 5);



/*
Truthy and Falsy
Effectively every value in JS has a truthy or falsy value added to it
This just means that within boolean evaluation statements, you can just use the variable itself
to check if it is true or false
*/

let bool1 = false;
let bool2 = undefined;
let bool3 = null;
let bool4 = NaN;

if(bool1 || bool2 | bool3 | bool4){
    console.log("this should not print out");
}else{
    console.log("all those values are falsy");
}

let emptyString = new String('');
console.log(typeof emptyString);

if(emptyString){
    console.log("Will this print?");
}

if([]){
    console.log("This was an empty array");
}

if(0){
    console.log("0");
}



/*
Variable Scopes

Decides the visibility of a variable

functions
Code that exists on the page outside of a function
Code that exists inside a function within a function
*/

let aString = "outside function"

function printer(){
    let functionString = "this string is inside this function";
    console.log(functionString);
    console.log(aString);

    function printer2(){
        console.log(aString);
        console.log(functionString);
    }

    printer2();

}

//console.log(functionString);
printer();


// Scope is defined using the {}

{
    let y = 2;
}

var z = 10;

{
    let z = 2;
    const mike = "asfd";
    //var z = 5;
}

console.log(z);


/*
Objects

Objects are basically maps in JavaScript (or dictionaries)
There is a key-value relationship between all properties of a Object
*/

let genericObject = {
    name : "Greg",
    age : 124
};

console.log(genericObject);
genericObject.name = "Mike";
genericObject.check = true;

console.log(genericObject);


/*
Arrays

Arrays in JavaScript are also objects
They come with certain methods that allow easy Array manipulation
Under the hood though, they are all objects
*/

let cars = [
    "Audi",
    "BMW",
    "Toyota"
];

console.log(cars);

//add elements

cars.push("Honda");
console.log(cars);

cars.push(124);
console.log(cars);


cars[cars.length] = "Mitsubishi"
console.log(cars);

for(let i = 0; i < cars.length ; i++){
    console.log(cars[i]);
}

for(let element of cars){
    console.log(element);
}

for(let key in cars){
    console.log(cars[key]);
}



// Arrow functions

let hello = () => console.log("Hello World");
hello();

let sum = (a, b) => {
    let result = a + b;
    return "sum is: " + result;
}

console.log(sum(5, 6));

// Anonymous functions

let anon_func = function(){
    console.log("this is anonymous");
}

anon_func();

// Callback Functions

function functionRunner(functionToRun){
    functionToRun();
}

functionRunner(anon_func);

functionRunner(
    function(){
        console.log("Hello There!");
    }
)