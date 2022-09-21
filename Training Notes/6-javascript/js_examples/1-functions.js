// 4 Main ways to declare a function

//1 classic
function divide1(x, y){
    return x/y;
}

console.log(divide1(10,5));

// 2 Function expression - assigning an anonymous function to a variable

const divide2 = function(x, y){
    return x/y;
}

console.log(divide2(100, 5))

// 3 Arrow functions (introduced in ES6 ecmaScript 6 2015)
const divide3 = (a, b) => {
    return a/b;
}

console.log(divide3(50, 25));

// 5 concise arrow function expression

const divide4 = (a,b) => a/b;

console.log(divide4(10, 2));