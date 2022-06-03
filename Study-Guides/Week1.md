# Week 1 Study Guide

### Integrated Development Environment
an IDE is a tool we use to write and test our code. Most IDEs will have the following:
- intelisense
    - informs you about syntax errors, gives helpful hints for what functions you can call, etc.
- project explorer
    - an overview of what folder you have open and all the sub directories and files contained within
- workspace
    - a window where you write your code. Intelisense help happens here
- a way to execute your code
    - in Visual Studio Code we have been using the command line in a terminal

### Terminal
a terminal is a way of interacting with your computer via written commands. So far we have used the node command to execute our JavaScript files and the cd command to change our working directory to make it easier to execute our files
- working directory is where the terminal is operating in your file system. Any command you run (like node fileName.js) will automatically look for the file located in the working directory of the terminal. If you want to execute a command on a file located somewhere else you have to provide the path to that file (node folder1\folder2\file.js)

### Runtime Environment
A Runtime Environment is software that provides the means of executing your code. For JavaScript we are using the Node.js runtime environment. Node provides us with a way of executing JavaScript files from the command line by using the command "node". Node will then read, compile, and execute our file.
- compiling is the process of turning code from its human readable format into a machine-friendly format that your computer understands

### JavaScript Data types
1. string
2. number
3. bigInt
4. boolean
5. null
6. undefined
7. symbol

### Variable
creating variables is a way to easily reference data within your code dynamically. You can redefine variables whenever you want to have them reference new data.
```Javascript
myVariable = 10

myVariable + 5 // this is the same as 10 + 5

myVariable - 4 // this is the same as 10 - 4

myVariable = 12

myVariable + 5 // this is the same as 12 + 5

myVariable - 4 // this is the same as 12 - 4
```
### Various JavaScript Operators
An operator is a character that provides some kind of functionality in a programming language. For instance, the "=" character is the assignment operator: you use it to assign a value to a variable
#### Arithmetic Operators
```javascript
/*
    + addition
    - subtraction
    / division
    * multiplication
    % modulous (get the remainder of a division result)
    ** exponent (raise a number to a given power: 5**2 would raise 5 to the second power)
*/
```
#### Logic Operators
```JavaScript
/*
    > greater than
    < less than
    == loose equality (doesn't check data type, allows type coercion)
    === strict equality (checks type, does not allow type coercion)
    >= greater than equal to
    <= less than equal to
    || or
    && and
    ! not
*/
```
### Control Flow
#### If, Else If, Else
if, else if, and else can be used to control the flow of your application. If an if or else if statement is given a true boolean value (directly or by using logic operators) then its associated code block will execute. If neither the if or any linked else if blocks execute then the associated else block will execute.
```JavaScript
// the code block below will execute
if(true){
    console.log("this will print to the console");
}

// the code below will not execute
if(false){
    console.log("this will not print to the console");
}

// the else if block of code will execute
if(false){
    console.log("this will not print to the console");
} else if(true){
    console.log("this will print to the console");
} else {
    console.log("this will not print to the console");
}

// the else block of code will execute
if(false){
    console.log("this will not print to the console");
} else if(false){
    console.log("this will not print to the console");
} else {
    console.log("this will print to the console");
}

// only the if block of code will execute
if(true){
    console.log("this will print to the console");
} else if(true){
    console.log("this will not print to the console");
} else {
    console.log("this will not print to the console");
}
```
#### While, Do While, For
If you need your code to loop you can use the while or for key words to create a code loop. While loops will continue to run as long as its associated logical statement (or hard coded boolean) is true
```JavaScript
while(true){
    console.log("This is an infinite loop that will run forever. Don't create infinite loops");
}

// the code below will print the numbers 0-10 to the console before the loop ends 
count = 0;
while(count <= 10){
    console.log(count);
    count++;
}
```
A do while loop will always run at least once because the code is executed first and then the logical statement is checked
```JavaScript

// the code below will print the values 0-10 to the console before the loop finishes
count = 0;
do{
    console.log(count);
    count++;
} while (count <= 10)

// the code below will print the value 11 only, since 11 is greater than 10
count = 11;
do{
    console.log(count);
    count++;
} while(count <= 10)
```
For loops provide more built in tools for controlling your loop
```JavaScript
// the code below will print the values 0-10 before the loop finishes
for(let x = 0; x <= 10; x++){
    console.log(x);
}

/*
    in the statement above let x = 0 creates the variable that we will use to control the loop
    x <= 10 is the logical statement that produces the boolean for the for statement
    x++ is how the x variable will increment each iteration of the loop
*/
```
You can also use for loops to iterate through a collection of data, like a string, array, or object
```JavaScript
myString = "Hello World!";
for(let character of myString){
    console.log(character); // this will print out each character of the string one by one
}
```
### Functions
Functions provide a way of reusing your code without the need to rewrite everything each time you want to use it. You first use the function key word to declare that you are creating a function, give the function a name, declare any parameters, then write the associated code
```JavaScript
function myFunctionName(parameterOne, parameterTwo){
    // code you want to execute will go in here
}
```
then, to actually execute your function you need to call it by referencing the function name and providing arguments for the parameters you declared
```JavaScript
function addTwoNumbersTogether(numOne, numTwo){
    console.log(numOne + numTwo);
}

addTwoNumbersTogether(10,5); // this will print 15 to the console, since 10 + 5 is 15
```
You can also use the return key word if you want to get the results of your function out of the function and into the rest of your code
```JavaScript
function createFullName(firstName, lastName){
    let fullName = firstName + " " + lastName;
    return fullName;
}

result = createFullName("Bill","Gates");
console.log(result); // will print Bill Gates to the console
```
You need to be careful with the arguments you provide: mixing and matching data types or accidentally providing the wrong data type can produce weird results
```JavaScript
function subtraction(parameterOne, parameterTwo){
    return parameterOne - parameterTwo;
}

console.log(subtraction(2,1)) // will print 1
console.log(subtraction("2","1")); // will print 1 due to implicit type conversoin
console.log(subtraction("two","one")); // will print NaN(Not a Number) due to JavaScript being unable to coerce these strings into numbers
```
Functions provide a quick and easy way of dynamically creating variables
```JavaScript
function createFullName(firstName, lastName){
    return firstName + " " + lastName;
    // make sure to include the return key word
}

personOne = createFullName("Bill","Gates"); // personOne = "Bill Gates"
personTwo = createFullName("Harry","Potter"); // personTwo = "Harry Potter"
personThree = createFullName("Ben","Kenobi"); // personThree = "Ben Kenobi"
```