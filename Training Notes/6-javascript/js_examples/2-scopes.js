/**
 * 4 Main Scopes
 * 
 * Global Scope - Variables declared here are accesible from Anywhere
 * 
 * Functional / Local Scope - Variables accessible within a function and not outside of it
 * 
 * Block Scope - Variables restricted to a block scope like a for looop or a while loop
 * 
 * Lexical Scope - When there are functions within another function and we create an environment of variables accessible
 * to the funcitons nested within the outer functions (closures)
 */

let name = "charles"; // I can access this within any function or method belonging to an object

function funScope(){
    let x = 100;
    console.log(x);
}

// This funciton is immediately invoked because we're invoking it on the global object
funScope();

// We can't reach x declared in the function
let x; // If you declare a variable without initializing its value, it's primitive type automatically becomes undefined
console.log(x);

const d = "dolphin"; // Globally Scoped

function blockScope(){
    const c = "cat";
    var m = "mary";

    if(true){
        // I've opened up a block scope here
        console.log(c);
        console.log(m);

        // Let & const restricted to block scope
        let d = "dog";

        //var d = "dog" this will make it accessible outside of the block scope

        if (true){
            console.log(d);
        }
    }

    console.log(d); // This will return dolphin
}

blockScope();