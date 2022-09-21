let scores = new Array(10) // Array Constructor
// JS arrays are dynamic, so you can expands them and contract as needed

console.log(scores); // You can store any type of data inside this array, mix and match

let colors = ['red', 'blue', 'green'];

console.log(colors);

// Accessing elements inside an array
console.log(colors[1]); // return blue
colors[1] = 'yellow'; // reassign an element
console.log(colors[1]);

// Capture the size
let size = colors.length;

// Add elements to the array
colors.push('purple');
console.log(colors);

// Remove last element
console.log(colors.pop());

// If you want to remove the first element instead, you call shift()
console.log(colors.shift()); // Removes the first element (red)

console.log(colors.indexOf('yellow'));
console.log(colors.indexOf('red')); // Returns -1


/**
 * In JS an arrya is an ordered list of values and each value is called an element specified by an index
 * an Array cna hold values o fmixed types
 * JS arrays are dynamic (can change size)
 */

let myArr = [1, 2, 3];
myArr.push(4);

// Array Functions in JS filter(), map(), reduce()

// Use map to return a new array representing all squared values

let squaredValues = myArr.map(val => {
    return Math.pow(val, 2);
}); // A callback function is a function that is passed as a parameter to another function

console.log(myArr);
console.log(squaredValues);

let i = function(){}; // A function in JS is a first class object, which means we can assign it to a variable
// and we can pass it as a parameter to another function



// 3 types of for loops in JS

// 1 - basic type, using for

const list = [1, 2, 3, 4, "Greg", {}];

for (let j = 0; j < list.length; j++){
    console.log(list[j]);
}

// 2 - for of, this returns the value of the array
for (let value of list){
    console.log(value);
}

// 3 - for in, returns the key of the array

for(let key of list){
    console.log(list[key]);
}



list.forEach(el => {
    console.log(el);
})

list.forEach(
    function(value){
        console.log(value);
    }
)