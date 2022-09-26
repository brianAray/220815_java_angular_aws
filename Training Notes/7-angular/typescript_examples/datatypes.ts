/**
 * Primitives: string, number, and boolean
 * 
 * JS has three very common primites: stirng, number and boolean
 * There is an equivalent in TS
 * 
 * 
 */

var count = 5;

//count = 'apple';// You can't reassign a number variable to a string

// TS is statically types, you can't reassign a variable of a different type to another one

let x = 10; // Implicitly assigning it a number type

//x = 'ten'; // Same thing!

let a: number; // Initializing the variable a and its type
a = 100;
a = 1000;
//a = 'apples'; // You can't do this

let b: boolean = true; // Full initialization
let c: string = 'Kiwi';
let d: any; // There is no implicit any, you have to declare it as any in order for it to be dynamic
d = 'dog';
d = 1555; // The any type in TS allows you to redeclare the value to any type

let e: any[] = ['one', 2, false, 'apple'];
let f: number[] = [10, 20, 30, 40];

console.log(e[2]); // Will return false as its the 3rd element

// Enums allow you to define a named constant like in Java

// old way
const ColourRed = 0;
const ColourBlue = 1;
const ColourGreen = 2;

enum Colour {Red, Blue, Green}; // This will look weird in JS

let backgroundColour = Colour.Blue;