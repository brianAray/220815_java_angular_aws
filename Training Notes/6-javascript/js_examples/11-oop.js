let names = {
    fname: "Mike",
    lname: "Jones"
}
console.log(names.fname);

console.log(names.hasOwnProperty("mname"));

/**
 * The object variable has only two properties
 * fname and lname
 * no methods at all
 * 
 * SO where does hasOwnProperty come from?
 * 
 * This is the Object prototype
 * 
 * Try logging the contents of the variable to the console
 */

console.log(names);

/**
 * The property __proto__ has a set of properties 
 * 
 * Under the object constructor, all these properties are ocming from the global
 * Object prototype.
 * If you look closely, you'll see the hasOwnProperty
 * 
 * In other words, all objects have access to the Object's prototype. 
 * They do not possess these properties, but are instead granted access to them in the
 * prototype
 */

/**
 * Modifying the __proto__ propert
 * This property can be modified explicitly stating that it should refer to another prototype.
 * The following methods to achieve this are
 * 
 * Object.create()
 */

function DogObject(name, age){
    let dog = Object.create(constructorObject);
    dog.name = name;
    dog.age = age;
    return dog;
}

let constructorObject = {
    speak: function(){
        return "I am a dog";
    }
}


let bingo = DogObject("Bingo", 53);
console.log(bingo);


// new Keyword

function DogObject(name, age){
    this.name = name;
    this.age = age;
}

DogObject.prototype.speak = function(){
    return "I am a dog";
}

let John = new DogObject("John", 45);

console.log(John);

/**
 * John's __proto__ property is directed to DogObject's prototype
 * Remember, DogObject's prototype is an object (key and value pair), hence it
 * also has a __proto__ property which refers to the global Object property
 * 
 * This technique is called
 * PROTOTYPE CHAINING
 */

class Animals {
    constructor(name, species){
        this.name = name;
        this.species = species;
    }
    sing() {
        return `${this.name} can sing`;
    }
    dance(){
        return `${this.name} can dance`;
    }
}

let jim = new Animals("Jim", "Person");
console.log(jim);