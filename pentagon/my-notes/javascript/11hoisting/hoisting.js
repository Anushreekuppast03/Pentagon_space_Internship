//hoisting:IS THE DEFAULT behaviour of moving all the 
//declaration at the top of the scope  before code execution
demo()
function demo(){
    var a = 20;
    var b = 50;
    console.log(a + b);
}

// Correct function call

//normal function>3

function demos(){
    var m= 20;
    var n = 10;
    console.log(m + n);
}
demos()


//closures
// a clouser is created when a fun remember its outer fun enen after executing>

function outer(){
    const message = "outer"
    function inner(){
        console.log(message)
    }
    return inner;

}
const closureFunction=outer()
closureFunction()
// Closures in Javascript

// It is a technique to access outer function variable
// or
// It is function to define function inside another function

// A closure is an inner (child) function that has access to the outer (parent) function's variables.
// The closure has three scope chains:
// 1: access to its own scope (variables defined between its curly braces)
// 2: access to the outer function's variables
// 3: access to the global variables

// syntax:
// function outer(){
//     .......
//     function inner(){
//         .......
//     }
//     return inner;
// }

function outer(){
    let a = 100;
    function inner(){
        console.log("inside inner function");
        console.log(a); // Accessing outer function's variable
    }
    return inner;
}

let innerFunc = outer();
innerFunc(); // Output: inside inner function, 100
