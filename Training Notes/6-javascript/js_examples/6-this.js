/**
 * What is THIS?
 * 
 * In JS, the "this" keyword refers to the Object that it belongs to
 * 
 * - alone, this refers to the global object
 * - in a funciton, this still refers to the global object
 * - In a Method (a function inside an object) refers to the owner object
 * - in Strict mode, this in a function returns undefined
 */
//'use strict'

console.log(this); // WHen we call the global object in browser, we get the window itself
// If you called this within Node, you would get an empty object instead

function foo(){
    console.log(this); // In strict mode, this returns undefined
}

foo();

x = "hi"; // Declaring a variable like this is equivalent to declaring it with var in not strict mode
console.log(x);

// Obj literal

const person = {
    // JSON is similar but not the exact same
    firstName: "Greg",
    lastName: "James",
    id: 1234,
    fullName: function(){// This is a method (a function as a property of an object)
        return this.firstName + this.lastName;
    }
}

console.log(person.fullName());


this.cat = "Tom"; // This is setting a property of the global object
console.log(this.cat);