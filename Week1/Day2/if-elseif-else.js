/*
    Getting good at control-flow is one of the best ways to improve yourself as a programmer. One of the
    fundamental ways of controlling the flow of your application is using if statements. If statements check a
    logical statement and return either a true or false boolean value. If a true boolean is returned by the statement
    then any code associated with the if will execute. If a boolean false is returned the code will not execute
*/


// because this if statement is a hard-coded true value it will always execute
if(true){
    console.log("because the boolean value is true this message will print to the console");
}

// because this if statement is a hard-coded false value it will never execute
if(false){
    console.log("because the boolean value is false this message will not print to the console");
}

/*
    if we could only hardcode our true and false statements for our if blocks it would be very annoying to
    write code. We can avoid hard coding a true or false by putting logical statements in the () of the if key words
*/

// 5>4 results in a true boolean, so the block of code associated with this if statement is executed
if(5>4){
    console.log("because 5 is greater than 4 this message will show in the console.");
}

// 4>5 results in a false boolean, so the block of code associated with this if statement is not executed
if(4>5){
    console.log("because 4 is not greater than 5 this message will not show in the console");
}

/*
    in the two examples above we are still ultimately hard-coding our values: 5 will always be greater than 4
    and 4 will always not be greater than 5. To make our code more dynamic we need to start using variables
*/

// these are both valid ways of assigning a value to a variable
numberOne=50;
numberTwo = 50;

if(numberOne > numberTwo){
    console.log("numberOne is greater than numberTwo");
}

if(numberTwo > numberOne){
    console.log("numberTwo is greater than numberOne");
}

/*
    If statements by themselves provide a lot of power for controlling your code, but they do have some shortdalls.
    For instance, in the above example if numberOne and numberTwo are equal to eachother then nothing happens.
    We could add a third if statement to our code to handle this situation, but there is an easier way to handle this:
    using an else statement;
*/

if(true){
    console.log("because we hard-coded true this will always show in the console");
} else {
    console.log("if the boolean above was a false then this block of code would execute");
}

if(false){
    console.log("because the boolean above is false this will never show in the console");
} else {
    console.log("because the block of code associated with the if statement did not execute we will see this instead");
}

/*
    with this in mind we can make our number comparisons a little less complicated
*/

if(numberOne > numberTwo){
    console.log("numberOne is greater than numberTwo");
} else {
    console.log("numberTwo is greater than numberOne");
}

/*
    our logical check is getting better, but now we are getting a message saying that numberTwo is greater than numberOne
    even if they equal the same value! To add more complexity to our if/else chain we can make use of an else if statement.
    an else if statement works the same as an if statement: you provide it with a logical statement, and if it gets a 
    true boolean value it will execute, if the value is false it will not execute the block of code associated with it
*/

// if you want to declare/reassign multiple variables on the same line you can do so like this
[numberOne, numberTwo] = [50, 10];

if(numberOne > numberTwo){
    console.log("numberOne is greater than numberTwo");
} else if(numberTwo > numberOne){
    console.log("numberTwo is greater than numberOne");
} else {
    console.log("numberOne and numberTwo are the same!");
}
 