/**
 * What is TS?
 * 
 * TS was developed for larger applications, its syntax is closer to Java or C
 * 
 * TS is strongly typed and therefore easier to debug
 * 
 * We can install TS using :
 * npm install -g typescript
 * 
 * NPM comes with Nodejs installation
 * 
 * We can transpile TS into JS using:
 * 
 * tsc 'nameoffile.ts'
 * 
 * A unique feature of TSC is the ability to transpile into older versions of JS
 * 
 * tsc -t <version> 'filename'.ts
 * 
 * tsc -t es2015 TS-Overview.ts
 * 
 * As more and more features are added JS, this becomes the star of the show and why TS will continue to be used
 * The ability to transpile your TS code into any version of JS for older browsers is a fantastic feature
 * 
 * Why Transpile instead of compile?
 * Compiling is when you go from a higher level language into a lower level code
 * More abstractions -> bytecode
 * 
 * Transpiling is converting a similar language into another language, TS -> JS
 */

/**
 * Datatypes from JS
 * boolean, number, array, object, undefined, string, null, symbol
 */

let s: number | boolean | string = 1;

s = "a String";

// Null, void, undefined

let v1: null | string = null;
// let v2: void = null; You cannot assign void / null / undefined to each other as they are different in TS
// let v3: null = undefined;
// let v4: undefined = null;
//let v5: null = void; // Because void is not an actual value

// Objects
let o1: object | Object | {}; // Examples of Objets that we can have
let o2: {};

o2 = {
    "key": "value",
    key2: "another Value"
};
//o2 = undefined; // Cannot do this


// Arrays 
// They work similarly to arrays in JS
// In JS
// We can different data types, nested arrays, and arrays are resizable

let a1: Array<number>; // An array of numbers
let a2: number[]; // Also an array of numbers, just different syntax
let a3: any[] | string; // Using an array of any datatypes

a1 = [1,2,3,4,5];
a1[3] = 7;


// Tuples
// Like an array, except immutable
// Fixed size an the datatypes have to be in a specific order
let tuple1: [string, boolean, number];
tuple1 = ['Hello', true, 11];


/**
 * Enum
 * 
 * Speciifc values, can only be those specific values
 * God for when you want to declare a specific set of vlaues
 * 
 * A Enumeration is a collection of constants, representational values
 */

// JS way

const OFF = 0;
const IDLE = 1;
const ACCEL = 2;


let myCarState = ACCEL;

if(myCarState == OFF){
    // do something
}else if(myCarState == IDLE){
    // do something else
}else if(myCarState == ACCEL){
    // DO another thing
}

// TS Way
enum carState {OFF = 0, IDLE = 1, STOPLIGHT = 72, ACCEL = 2, CRUISING = 3}

if(myCarState == carState.ACCEL){
    // Do something
}




/**
 * Functions
 */

function myJSFunction(x, y,z){
    // Bare bones JS
}

function myOtherFunction(a: number, b:string, c){
    // Adding in datatype restrictions
}

function emptyFunction(): void{
    // Void is not a datatype
    // Used to specify the lack of a return value
}




/**
 * OOP Aspects of TS
 * 
 * Abstraction
 * Hiding away the details of what's going on to the developer
 * Interfaces, abstract classes
 */


// ABSTRACTION INHERITANCE POLYMORPHISM

interface Moon{ // We define a moon interface, so any object of type moon has to have a name
    name: string
}

interface Planet{
    name: string, // Planet has to have a String type name
    hasRings: boolean, // Has to have a boolean value for this attribute
    moons: Array<Moon>, // Has to have an array of moon
    orbit(): void, // A method, with no arguments, no return value
}

let nix: Moon;
nix = {name: "Nix"};

let earth: Planet = {
    name: "Earth",
    hasRings: false,
    moons: [nix],
    orbit: () => {console.log("I am orbitting")}
}

class Star implements Moon, Planet{

    name: string;
    nickname: string | undefined;
    planets: number | undefined;
    moons: Moon[];
    hasRings: boolean;

    // In TS we can't have multiple constructors, instead we get optional parameters
    // Optional parameters means we don't need to have them in our arguments
    // Optional parameters HAVE to be on the right side of the non-optional parameters
    constructor(moons: Moon[], hasRings: boolean, name: string, nickname?: string, planets?: number){
        this.name = name;
        this.nickname = nickname;
        this.planets = planets;
        this.moons = moons;
        this.hasRings = hasRings;
    }

    toString(): string{
        return `Star: [name = ${this.name}, nickname = ${this.nickname}, numberOfPlanets = ${this.planets}]`;
    }

    fusion(): void{
        console.log(`${this.nickname} is getting brigter`);
    }
    
    orbit(): void{
        console.log(`I am orbitting ${this.nickname}`);
    }


}

let sun: Star = new Star([nix], false, "Sol", "The Sun", 8);
console.log(sun.toString());

sun.fusion();




class NeutronStar extends Star {
    hasExploded: boolean;

    constructor(hasExploded: boolean, moons: Moon[], hasRings: boolean, name: string, nickname: string, planets: number){
        super(moons, hasRings, name, nickname, planets);
        this.hasExploded = hasExploded;
    }

    spinAbout(): void{
        console.log("Spinning a lot!");
    }

    toString(): string{
        let stringRepresentation = `Neutron Star: [name = ${this.name}, nickname = ${this.nickname}, numberOfPlanets = ${this.planets}]`;
        return stringRepresentation;
    }
}

let moon : Moon =  {name : "Moonie"};
let neutron: NeutronStar = new NeutronStar(false, [moon], false, "A Neutron Star", "Neutron", 3);

console.log(neutron.toString());


/**
 * ENCAPSULATION
 * 
 * To allow Encapsulation in TS, we need to compoile to a version of JS beyond ES5
 * Getters and setters are funciton the same as Java OOP, but with new syntax
 * 
 * Getters and Setters are defined with the keyword "get" and "set"
 * 
 * Both methods must have the same name, and te data types must match (return type of getter and argument type of setter)
 * Invoking both functions are also different
 * we don't do animal.get(), instead animal.Age
 * we don't do animal.set(value), instead animal.Age = value
 */

class Animal {
    // All the attributes by default are public
    // There are 3 access modifiers
    // Public, Protected, private

    name: string; // By default implicitly public
    private _age: number; // The attribute is only available internally
    protected breed: string; // Accessible internally to the class or any child class
    public weight: number; // Explicitly writing it is public

    constructor(name: string, age: number, breed: string, weight: number){
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.weight = weight;
    }
    
    public get age(): number {
        console.log("I am in getter");
        return this._age;
    }
    public set age(value: number) {
        console.log("I am in setter");
        this._age = value;
    }

}

let dog: Animal = new Animal("Bob", 2, "Labrador", 20);

console.log(dog.age); // using getter
dog.age = 10; // Using setter
console.log(dog.age);


/**
 * Some unique aspects of TS
 * 
 * To cut down on coding syntax, we can decalre the varibale access modifier inside the constructor arguments
 * This will associate the argument as an attribute of the instantiated object
 * 
 */

class Cat{

    // I am going to deifne explicitly the attributes
    // This will reduce the amount of code!
    constructor(
        private name: string,
        public nickname: string
    ){

    }
}

let cat: Cat = new Cat("bob", "Bobby");

console.log(cat.nickname);