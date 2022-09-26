// Parameter type annotation
function greet(name: string){
    console.log("Hello there " + name.toUpperCase());
}

// Runtime error
//greet(23);

// Return type annotations
function getFavouriteNumber(): number{
    return 42;
}

// Like variable type annotations, you don't need a return type annotation as TS will infer the return type based
// On the return statement.
// Its good to include for documentation

