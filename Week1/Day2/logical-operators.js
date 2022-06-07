/*
    in the if-elseif-else file we already took a look at some of the logical operators available to you in JavaScript.
    Here we are going to take a deeper look at how you can craft your logical statements.
*/

// the comparison operators are greater than (>) and less than (<)

numberOne = 5;
numberTwo = 10;

if(numberOne <= numberTwo){
    console.log("5 is less than 10 so the logical statement returns a true boolean");
}

if (numberTwo > numberOne){
    console.log("10 is greater than 5 so the logical statement returns a true boolean");
}

/*
    Sometimes we will want our code to execute if a value is greater/less than OR equal to
    <= is the less than or equal to operation
    >= is the greater than or equal to operation
*/

if(numberOne <= numberTwo){
    console.log("This block of code will execute because 5 is less than OR equal to 10");
}

if(numberTwo >= numberOne){
    console.log("This block of code will execute because 10 is greater than OR equal to 5");
}

/*
    you are not limited to making a single logical statement in your if/else if statements. You can chain these
    statements for a single if block by using the or/and operators
    || are the or operator
    && are the and operator
*/

// both these logical statements return a true boolean, so the code block executes
// if(5 <= 10 and if 5 >= 0)
if(numberOne <= numberTwo && numberOne >= 0){
    console.log("Both logical statements for this if block must be true for the code here to execute");
}

// only the right side statement returned a true boolean, but because we used the or operator we still see the cdoe execute
// if(5 >= 10 or if 5 <=7)
if(numberOne >= numberTwo || numberOne <= 7){
    console.log("Only one of the logical statements for this if block needs to be true for this to show");
}

/*
    While it is not good practice, you can make your logical statements VERY complicated if you want...
*/

// if(5 > 4 && 5 > 3 && 7 > -2 && 8 > 5 && numberOne < numberTwo...)

/*
    When making logic statements you will sometimes need to check if one value is the same as another. In JavaScript
    you have to decide whether to use the loose equality operator or the strict equality operator.
    == is the loose equality operator
    === is the strict equality operator
*/

// the loose equality operator will try and convert the type of your data to match before comparing them
seven = "7"
if(7 == seven){
    console.log("you can actually compare strings and numbers using the loose equality operator");
}

// the strict equality operator will not implicitly convert the types of the data, so making a comparison 
// between two different data types will automatically return false
if(7 === seven){
    console.log("will this work?");
}

/*
    Every now and then you will want your code to execute when a situation is NOT true. So far we have been
    looking at positive examples: 5 is greater than 3, so when we make that comparison we get a true boolean back.
    But what if we wanted a true boolean back for a negative statement?
    ! is the not operator
*/

// this statement returns a false boolean, so the code block does not execute
if(5 < 3){
    console.log("this is not going to the console");
}

// this statement returns a true boolean due to the not operator
// if(5 is not less than 3)
if(! 5 < 3){
    console.log("The statement for this block returns a true boolean: 5 is not less than 3");
}

let valueOne = 4;
let valueTwo = 5;

if(valueOne != valueTwo){
    console.log("this is how you check if one value does not equal another")
}