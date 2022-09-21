/**
 * Equality and equals operator
 * 
 * = is an assignment operator
 * 
 * == compares an object on either sides value, but performs something called type coercion
 * 2 == '2' // true
 * 
 * === is a struct equls operator which compares type
 * 2 === '2' // false
 */

console.log(2 == '2');
console.log(2 === '2');

function compare(first, second){

    console.log(
        `
            first param = ${first}, and is of type ${typeof(first)}
            second param = ${second}, and is of type ${typeof(second)}

            Is first == second? : ${first == second}
            Is first === second? : ${first === second}

        `
    )
}

compare(2, '2')
compare("two", 2)
compare({}, {})
compare([], null)

let coolString = `Hello there!"`;
console.log(coolString);