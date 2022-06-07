/*
    Another way of creating functions in JavaScript is to make arrow functions. These work basically the same
    as regular functions, but the syntax for creating them is a little bit different
*/

/*
    This is a regular function, like we have seen before, we can call it before or after we define it because
    the function is hoisted, allowing us to use it before we actually define it

    reminder: hoisting is where a function is declared and initialized before the code is executed
    declared = a reference is made
    initialized = content is assigned to the reference
*/

myFunction() // this works because of function hoisting
function myFunction(){
    console.log("this function prints this message to the console");
}
myFunction();

/*
    let myArrowFunction defines the name of my function
    the () is where I would put any parameters if I needed to declare them
    => is an alternative way of indicating that the code to follow is part of the function
*/

let myArrowFunction = () => console.log("This should print to the terminal when called");
myArrowFunction();

/*
    if I wanted to have multiple lines of code for my arrow function then I would need to use {} after the
    arrow sign. Also, if I want to get the result of the function out of it, then I need to use the return key word
    just like a regular function.

    Keep in mind that arrow functions are not hoisted like regular functions, so you can't call them until
    after you have defined and initialized them in your code
*/

// notice that I declared two parameters inside the (), and because the function covers multiple lines I used {}
let addition = (numOne, numTwo) => {
    let result = numOne + numTwo;
    return result;
}

let resultOfAdditionFunction = addition(5,6);
console.log(resultOfAdditionFunction);