/*
    So far we have been writting our code directly in the module and having it run line by line, but this is actually not
    the common practice. The common practice for large scale applications is to wrap your code in a function and
    use the function when necessary to run your code.
*/

/*
    function is the keyword used to declare that we are making a function
    myFunction is the name of the function we are creating
*/
function myFunction(){
    console.log("place the code you want to run inside the curly brackets");
}

// to actually print the message I created above I have to call the function
myFunction();

/*
    One of the most common things you are going to do with a function is provide it with some kind of data and then
    perform some sort of operation upon it. To do this, you must first declare one or more parameters that the function
    will accept, and then you can perform your operations upon the argument you provide without affecting the intital
    data.
*/

// remember: these variables are just placeholders for actual data, in this case, two strings
let nameOne = "Eric";
let nameTwo = "Viet";

// personName is a variable that exists inside of my function, any data I pass into my function will be represented by it
function greeting(personName){
    console.log("Hello " + personName);
}

greeting(nameOne); // this is the same as writting out greeting("Eric");
greeting(nameTwo); // this is the same as writting out greeting("Viet");

/*
    the function greeting as defined above takes in one argument(data you provide the function) and will 
    reference that argument within the function. The first time we call greeting with nameOne, inside of the function
    the data nameOne is a placeholder for ("Eric") is referenced within the function by the variable personName
*/

/*
    functions don't need to have just one parameter: you can declare multiple parameters for a function, but you need
    to be careful. The position of your arguments does matter, because the parameter variables you declared will represent
    the data in the order you enter it
*/

function addition(numOne, numTwo){
    console.log(numOne + numTwo);
}

addition(10,12); // our function will behave as expected here and perform normal addition
addition("10","12"); // our function will still work here, but it will do string concatenation instead of addition

function nameDeclarer(firstName, lastName){
    console.log(firstName + " " + lastName);
}

nameDeclarer("Eric","Suminski"); // this will print my full name correctly
nameDeclarer("Suminski","Eric"); // this will print my full name backwards

/*
    You REALLY have to be careful with the data you provide your functions because JavaScript will try its hardest 
    to make your code work, even if you provide bad data
*/

function subtraction(numOne, numTwo){
    console.log(numOne - numTwo);
}

subtraction(12,10); // this will work as expected because you can subtract 10 from 12
subtraction("twelve","ten"); // our code will still run this, but the result will be NaN
/*
    if you ever get the NaN result (Not a Number) there is a good chance that your function is working
    with mis-matched data types and you need to double check the arguments you provided for your function
*/

/*
    So far we have only been using our functions to print messages to the console, but you will oftentimes need
    to actually take the result of your function and use it somewhere else in your code. To do this you will need
    to end your function by returning the final result of your function's operations
*/

function subtractionWithoutAReturn(numOne, numTwo){
    let result = numOne - numTwo;
}

let functionResult = subtractionWithoutAReturn(12,10);
console.log(functionResult); // this will print undefined to the console because we are not getting the result variable out


// in order to get the result variable out we need to use the return keyword
function subtractionWithAReturn(numOne, numTwo){
    let result = numOne - numTwo;
    return result; // side note: return will end your function, so only use it at the end of the function
}

let newFunctionResult = subtractionWithAReturn(20,100); // this assigns the result of the function to my new variable
console.log(newFunctionResult); // this will print the numeric value we get from the subtractionWithAReturn function