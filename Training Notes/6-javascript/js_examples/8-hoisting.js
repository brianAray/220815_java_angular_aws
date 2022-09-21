/**
 * JavaScript Execution Context
 * Every time a JS engine executes a scirpt, an execution context is built
 * This execution context has 2 phase: creation and execution
 */

let x = 10; // Declared (initialized and assigned a value)

function timesTen(a){
    return a*10;
}

let y = timesTen(x);

console.log(y);

/**
 * Creation Phase (Step 1)
 * 
 * 1 . Create the Global Object - Web Browser (window) -> Node = Global Object
 * 
 * 2. Bind "this" to the Global Object
 * 
 * 3. Setup a memory heap for storing variables and function references
 * 
 * 4. Store the function declarations in the memory heap and store variables within the global
 * execution context as undefined (initialized but not declared)
 */

/**
 * Execution Phase
 * 
 * JS Engine executes the code line by line. In this phase, it assigns values to variables and
 * executes the function calls
 */

/**
 * Variable Hoisting occurs during the execution phase of the script
 * This is when declared variables are "moved to the top" of the script as INITIALIZED
 * But not declared
 * This is as if you have just declared a variable like so at the top
 * var a;
 */

console.log(a); // This will return undefined
var a = 1;

console.log(b);
let b = 1;

/**
 * Are variables declared with Let & Const hoisted?
 * All declarations are hoited in JS
 * 
 * While VAR variables are initialized, they remain undefined
 * let & const remian initialized -> they throw an error
 */