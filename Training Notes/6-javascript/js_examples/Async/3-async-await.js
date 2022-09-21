/**
 * in 2017 EcmaScript 8 was released and with it came the async await keywords
 * We use the aync keyword to define functions that handle asynchronous keywords
 */

async function sayHi(){
    return 'Hi'; // Implicitly returning a promise
}

//Asynchronous functions always return a promise
sayHi().then(console.log);


// Asynchronous functions ececuting asynchronously via the event loop

async function sayHi2(){
    // Explicitly state that we are returning a promise
    return Promise.resolve("Hi");
}

let sayHi3 = async function(){
    return "Hi";
}

let sayHi4 = async () => "Hi";


async function display(){
    // The await keyword can only be used within an asynchronous function

    try{
        let result = await sayHi();
        console.log(result);
    }catch(error){
        console.error(error);
    }
}

display();