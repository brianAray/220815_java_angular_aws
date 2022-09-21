/** 
 * Why do we use closures?
 * 
 * We use it so that functions can have "private" global variables
 * 
 * The counter variable is protected by the scope of a normal function
 * But if you place it as a function is called as soon as you run it, 
 * is effectively private
 * 
 * This means that the counter variable is protected by the scope of the
 * anonymous function and can only be changed by using the add function
 *  
 */



// Function to increment the counter

function add1(){

    // Initialize a counter
    let counter = 0;

    function plus(){
        counter += 1;
    }

    plus();

    return counter;
}

add1();
add1();
console.log(add1());

const add = (function(){
    
    let counter = 0;

    return function(){
        counter += 1;
        return counter;
    }
})();

add();
add();
console.log(add()) // return 3