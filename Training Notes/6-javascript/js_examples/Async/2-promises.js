/**
 * To avoid the callback hell issue, ES6 introduced Promises
 * to allow you to write asynchronous code in a more manageable sense
 * 
 * A Promise is an object that MAY produce a single value at some point in the future,
 * either resolved or rejected (rejected due to some kind of network error)
 * 
 * A Promise may be in 1 of 3 possible states:
 * 1 - Fulfilled
 * 2 - Rejected
 * 3 - Pending
 */


function getUser(userId){

    return new Promise((resolve, reject) => {
        console.log("Get user from the database");

        setTimeout(() => {
            resolve({
                userId: userId,
                username: "Greg"
            })
        }, 1000) 

    });
}

// Get Service

function getServices(user){
    return new Promise((resolve, reject) => {
        console.log(`Get services of ${user.username} from the API`);

        setTimeout(() => {
            reject(['Email', 'VPN', 'AWS'])
        }, 2 * 1000)
    });
}


// Get Service Cost

function getServiceCost(services){
    return new Promise((resolve, reject) => {
        console.log(`Calculate service cost of ${services}`);

        setTimeout(() => {
            resolve(services.length * 100);
        }, 3 * 1000);
    });
}

// Chain
getUser(103)
    .then(getServices)
    .then(getServiceCost)
    .then(console.log);