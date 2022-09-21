/**
 * JavaScript Async/Await
 * Start from life before promises
 * 
 * 
 * In the past when you wanted to deal with asynchronous operations, you have to use callback functions.
 * When you nest multiple callback functions, the code becomes very difficult to maintian.
 * This is called callback hell
 * 
 * Suppose you want to perform 3 asynchronous operations:
 * 
 * 1 - Select a user from a database
 * 2 - Get services of the user (check the internet services the user has used)
 * 3 - Calculate the service cost based on the services that the user has used
 */

// Get User
function getUser(userId, callback){
    console.log("Get user from the database");

    setTimeout(() => {
        callback({
            userId: userId,
            username: "Greg"
        })
    }, 1000) // First line in the callback queue
}

// Get Service

function getServices(user, callback){
    console.log(`Get services of ${user.username} from the API`);

    setTimeout(() => {
        callback(['Email', 'VPN', 'AWS'])
    }, 2 * 1000)
}


// Get Service Cost

function getServiceCost(services, callback){
    console.log(`Calculate service cost of ${services}`);

    setTimeout(() => {
        callback(services.length * 100);
    }, 3 * 1000);
}


// NEsted services to get the final cost that the User owes for services borrowed

getUser(104, (user)=> {
    // The 2nd parameter is a function (callback function)
    getServices(user, (services) => { // Implementing callback as 2nd param for getServices()
        getServiceCost(services, (cost) => { // Implementing callback as 2nd param for getServiceCost()
            console.log(`The service cost is ${cost}`)
        })
    })
})