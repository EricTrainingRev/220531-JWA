/* 
    first I need to create some variables that will represent the following:
        - the numbers I am working with
        - the operation I am going to perform
*/

numberOne = 10;
numberTwo = 5;
operation = "";

/*
    now that I have my variables I need to think about how the flow of code is going to work. I know that I want
    to perform an operation on the numbers based upon the value of the operation variable, and since the instructions
    say that I should aim to allow for addition, subtraction, nultiplication, and division at a minimum, I know I need to
    make at least 3 logical checks on the operation variable

    so my code will look something like this:

    if(operation is +){
        add numbers together and print to console
    } else if (operation is -){
        subtract numbers and print to console
    } else if (operation is *){
        multiply numbers and print to console
    } else {
        divide numbers and print to console
    }
*/

if(operation === "+"){
    console.log(numberOne + numberTwo);
} else if (operation === "-"){
    console.log(numberOne - numberTwo);
} else if (operation === "*"){
    console.log(numberOne * numberTwo);
} else {
    console.log(numberOne / numberTwo);
}
