const unchangeableWord = "Never"; // You can declare the String data type with "" or ''
let changeableWord = "Maybe"

console.log(unchangeableWord + " " + changeableWord);

// ES6 introduced a new way of declaring strings (Template Literals)

let templateLiteral = ``; // Defined with 2 `` (under esc key)

templateLiteral = `

This is a multi-line

Comment , and I expect this
format
to
persist

When I print this out`;

console.log(templateLiteral);

// Instead of using String Concatenation
// i.e. using + operator with strings
// We can use String interpolation with Template Literals

let birthYear = 1960;

templateLiteral = `I am ${2022 - birthYear} years old`;

console.log(templateLiteral);
