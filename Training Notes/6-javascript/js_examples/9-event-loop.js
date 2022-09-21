// JS is single threaded, it can only do one thing at a time

/**
 * JS Engine executes a script from the top of a file
 * 
 * It creates the execution context and pushes and pops functions onto and off the call stack in the execution process
 * 
 * If a function takes too long to complete, you can't interact with the web browser and it becomes a blocking funciton.
 * A blocking function could be downloading a file from a server
 */

function task(message){
    // emulate a time consuming task
    let n = 1000000000;
    while(n>0){
        n--;
    };
    // when it finishes print the message
    console.log(message);
}

// console.log("Start Script...");
// task("Download Complete!")
// console.log("Done!");

// Callbacks to the rescue!
console.log("Start Script...");

setTimeout(() => {
    // A callback function 
    task("Download Complete!")
}, 100);

console.log("Done!");

console.log('Hi');

setTimeout(() => {
    console.log('Execute Immediately');
    // This will only execute after all other funcitons have been removed from the stack
    // It hangs out in the callback queue until the call stack is free and its timer has expiered
}, 500)

console.log("Bye!");