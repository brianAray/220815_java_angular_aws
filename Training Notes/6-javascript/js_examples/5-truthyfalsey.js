/**
 * JS has a special way of coercing all different types to a boolean value of either true or false
 * 
 * There are only 6 falsey values and everything else is Truthy
 * 
 * - 0
 * - Null
 * - Empty String
 * - false
 * - NaN
 * - Undefined
 * 
 * !! double bang operato to check for a variables truthy or falsey value
 */

function checkTruthy(input){
    console.log(`
        input is ${input} and is of type ${typeof(input)}
        It has a truthy value of ${!!input}
    `)
}

let username = "";
let age = 0;

// Is username Truthy or Falsy?
checkTruthy(username);
checkTruthy(age);

checkTruthy('apple' * 15);

checkTruthy([])
checkTruthy({})