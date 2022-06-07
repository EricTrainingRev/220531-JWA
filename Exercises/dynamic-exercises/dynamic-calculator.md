# Dynamic Calculator
For this excercise you need to create a dynamic calculator (takes in user input, continues working until user input tells it to shut dow) using the following tools:
- variables
- if
- else if
- else
- console.log();
- for
- while
- do while
- prompt-sync

don't forget to make variables, and aim to have your calculator, at a minimum, able to do addition, subtraction, multiplication, and division.

### Calculator file template
```JavaScript
const prompt = require("prompt-sync")(); // make sure to add second set of open and close parenthesis

/*
    make sure to define your variable that controls the loop
*/

calculatorOn = true;

/*
    create your loop and write your calculator code inside of it
*/

while(calculatorOn){

    let operation = prompt("message to get input goes here");
    let numOne = prompt("message to get input goes here");
    let numTwo = prompt("message to get input goes here");

    if(operator === "+"){
    // code to execute
    }
    // make use of else if and else to make your calculator capable of handling the other operations

    /*
        make sure to add some code inside the loop that allows for ending the loop
    */
    let continue = prompt("ask user if they want to continue or not");
    if(continue != "desired input"){
        calculatorOn = false;
    }
}
console.log("Thanks for using my calculator App!");
```

### Stretch Goals
Try adding these to your calculator if you finish with the base requirements:
- find the remainder of a division operation
- raise a number to a given power
- make sure the denomenator of a division operation is not zero
    - print a message to the console reminding the user not to divide by zero if they try
- add logic to let the calculator handle more than two numbers at a time