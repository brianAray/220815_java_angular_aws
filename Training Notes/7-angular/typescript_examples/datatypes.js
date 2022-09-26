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
var x = 10; // Implicitly assigning it a number type
//x = 'ten'; // Same thing!
var a; // Initializing the variable a and its type
a = 100;
a = 1000;
//a = 'apples'; // You can't do this
var b = true; // Full initialization
var c = 'Kiwi';
var d;
d = 'dog';
d = 1555; // The any type in TS allows you to redeclare the value to any type
var e = ['one', 2, false, 'apple'];
var f = [10, 20, 30, 40];
console.log(e[2]); // Will return false as its the 3rd element
// Enums allow you to define a named constant like in Java
// old way
var ColourRed = 0;
var ColourBlue = 1;
var ColourGreen = 2;
var Colour;
(function (Colour) {
    Colour[Colour["Red"] = 0] = "Red";
    Colour[Colour["Blue"] = 1] = "Blue";
    Colour[Colour["Green"] = 2] = "Green";
})(Colour || (Colour = {}));
; // This will look weird in JS
var backgroundColour = Colour.Blue;
