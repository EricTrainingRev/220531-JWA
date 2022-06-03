/*
    In order to make this dynamic calculator take in user input I am going to use the prompt-sync package from the
    npm repo (see the how to use npm markdown file for instructions on how to get the package). So the first thing I
    am going to do for this application is set up the prompt function
*/

const prompt = require("prompt-sync")(); // make sure to add second set of open and close parenthesis

/*
    Now that we have a way of easily getting user input I can start thinking about how to keep my application running
    until the user tells it to stop. In this case, I am going to use a while loop because I don't know how long
    the user is going to want the application to keep running, and so the ease of creating a while loop will
    suit me better than a for loop would.

    so to start my psuedo-code, my application is going to start by looking somewhat like this:

    let booleanControllingLoop = true;
    while(booleanControllingLoop){
        calculator stuff will go in here
    }

    by creating a boolean variable that represents true, I can now controll when I want my application to stop looping.
    All I need to do is provide some code that will change the value of the control variable to false. This is something
    I will include after I set up the first action/operation of the calculator

    Speaking of which, lets start by simply providing a way of doing addition. I am going to let the user
    add two numbers together, so I will need to prompt the user for these numbers. Also, because I need to potentially
    reuse these numbers in my loop, I am going to declare them in the block of the loop

    let booleanControllingLoop = true;
    while(booleanControllingLoop){
        let numberOne = prompt("please enter the first number: ");
        let numberTwo = prompt("please enter the second number: ");
        console.log(numberOne + numberTwo);
        let again = prompt("Thanks for using the calculator! If you would like to go again please enter y and press enter: ");
        if(again !=== "y"){
            booleanControllingLoop = false;
        }
    }
    console.log("Goodbye!");

*/

// let running = true;
// while(running){
//     let numberOne = prompt("please enter the first number: "); // don't forget to parse the number from this STRING input
//     let numberTwo = prompt("please enter the second number: "); // don't forget to parse the number from this STRING input
//     console.log(parseInt(numberOne) + parseInt(numberTwo));// parseInt converts a string number into a numeric number
//     let again = prompt("Thanks for using the calculator! If you would like to go again please enter y and press enter: ");
//     if( again !== "y"){
//         running = false;
//     }
// }
// console.log("Goodbye!");

/*
    So now we have a calculator that can do addition on two numbers, let's add in the ability to do subtraction! In order to switch between
    addition and subtraction we will need to have a third variable that represents the operation we want to perform

    let running = true;
    while(running){
        let operator = prompt("please enter a + for addition or anything else for subtraction");
        let numberOne = prompt("please enter the first number: "); // don't forget to parse the number from this STRING input
        let numberTwo = prompt("please enter the second number: "); // don't forget to parse the number from this STRING input
        if(operator === "+"){
            console.log(parseInt(numberOne) + parseInt(numberTwo));// parseInt converts a string number into a numeric number
        } else {
            console.log(parseInt(numberOne) - parseInt(numberTwo));
        }
        let again = prompt("Thanks for using the calculator! If you would like to go again please enter y and press enter: ");
        if( again !== "y"){
            running = false;
        }
    }
    console.log("Goodbye!");

*/

let running = true;
while(running){
    let operator = prompt("please enter a + for addition or anything else for subtraction: ");
    let numberOne = prompt("please enter the first number: "); // don't forget to parse the number from this STRING input
    let numberTwo = prompt("please enter the second number: "); // don't forget to parse the number from this STRING input
    if(operator === "+"){
        console.log(parseInt(numberOne) + parseInt(numberTwo));// parseInt converts a string number into a numeric number
    } else {
        console.log(parseInt(numberOne) - parseInt(numberTwo));
    }
    let again = prompt("Thanks for using the calculator! If you would like to go again please enter y and press enter: ");
    if( again !== "y"){
        running = false;
    }
}
console.log("Goodbye!");