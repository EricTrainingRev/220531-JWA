/*
    In this module we are going to be taking a look at loops: loops are a tool we can use to make our code run 
    continuously. Something to be aware of though is that you must provide a means of exiting or stopping your
    loop or you will run into a problem known as the infinite loop: your code will continue to run for as long as
    your computer has electricity.
*/

// while(true){
//     console.log("This will run forever! Don't hardcode a true boolean into your loops");
// }

/*
    Anytime you create a loop you need to provide a way of exiting the loop. There are many different ways you
    can accomplish this, but the key thing to remember is that you must provide the means of achieving this exit
    condition within the loop itself
*/

// this is the correct way to achieve the exit condition: the increment operator is INSIDE the loop
count = 0;
while(count <= 10){
    console.log(count);
    count++;
}

// this is the incorrect way to achieve the exit condition: the increment operator is OUTSIDE the loop
// countTwo = 0;
// while(countTwo <= 10){
//     console.log(countTwo);
// }
// countTwo++;

/*
    There are two different ways of making while loops: there is the regular while loop and there is the do-while
    loops. The main difference between the two is that a regular loop has the possibility of never executing, but
    a do-while loop will always execute at least one time
*/

myNumber = 10;

// this loop will never run because 10 is less than 5
// while(myNumber < 5){
//     console.log("This will never execute");
// }

// this loop will execute once because the code executes first and then the logic is checked
do{
    console.log("will this work?");
} while(myNumber < 5) 

/*
    So far we have looked at while and do-while loops, but there is another option for looping your code: the for
    loop.
*/
// x++ is the same as x = x + 1
for(let x = 0; x <= 10; x = x + 1){
    console.log(x);
}
/*
    The anatomy of the for loop above:
        let x = 0 is how we set the variable that we are using to control the loop
        x <= 10 is our condition: as long as x is less or equal to 10 our loop will run
        x++ is what we want to happen at the end of each loop. This will allow us to reach our exit condition
*/

/*
    We can have more fine-tune control over our loops by manipulating the third part of the for statement: the 
    increment section. so far we have only been incrementing the control variable by one, but we don't have to do
    just one. We could increment by 2, 3, -1, -2, etc. 
*/

// += is a shorthand way of saying x should equal itself + whatever we put on the right
for(let x = 0; x <= 10; x+=2){
    console.log(x);
}

// this increases the value of x by 3 each iteration of the loop
for(let x = 0; x <= 10; x += 3){
    console.log(x);
}

// this decreases the value of x by one each iteration of the loop
for(let x = 10; x >= 0; x--){
    console.log(x);
}

// this decreases the value of x by two for each iteration of the loop
for(let x = 10; x >= 0; x -= 2){
    console.log(x);
}

// this decreases the value of x by three for each iteration of the loop
for(let x = 10; x >= 0; x -= 3){
    console.log(x);
}

/*
    So far we have just been using loops without any if else if or else statements, but we can mix and match them together
    to have more control over our application
*/

// myNum = 1;
// while(myNum <=  10){
//     if(myNum % 2 === 0){
//         console.log(myNum + " is an even number"); // I am doing string concatenation here
//     } else {
//         console.log(myNum + " is an odd number");
//     }
//     myNum++;
// }

for(let x = 1; x <= 10; x++){
    if (x % 2 === 0){
        console.log(x + " is an even number");
    } else {
        console.log(x + " is an odd number");
    }
}

/*
    There is another useful feature of the for loop: you can loop through a collection of data and have the loop
    automatically end when there is no data left to loop through
*/

firstName = "Eric";
// let letter is creating a variable called letter that exists in the block of code associated with this for loop
// each iteration of the loop letter will reference the value of a character in the firstName string. Each iteration
// letter will reference a new character in the string: the next one in line, so to speak
for(let letter of firstName){
    console.log(letter);
}