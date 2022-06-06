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
/*
    make sure to define your variables
*/

numOne = 0; // replace this number with the actual number you want
numTwo = 0; // replace this number with the actual number you want
operator = ""; // assing the operator as a string

/*
    write your code to make the calculator work after defining your variables
*/

if(operator === "+"){
    // code to execute
}
// make use of else if and else to make your calculator capable of handling the other operations
```

### Stretch Goals
Try adding these to your calculator if you finish with the base requirements:
- find the remainder of a division operation
- raise a number to a given power
- make sure the denomenator of a division operation is not zero
    - print a message to the console reminding the user not to divide by zero if they try
- add logic to let the calculator handle more than two numbers at a time