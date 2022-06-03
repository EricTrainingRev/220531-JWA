/*
    In the previous files you may have notted that I was off and on adding the let key word in front of my varables.
    This was intentional: let is a keyword that can be used to determine the "scope" of a variable. Scope is the way
    we describe the accessability of a variable (where can it be accessed?)
*/

/*
    The easiest scope to access is the global scope: any variable declared directly in the module is considered part
    of the global scope. No keywords are needed, and the variable can be accessed ANYWHERE in the file
*/

myGlobalVariable = "Eric";

/*
    Notice that I do not need to declare a parameter to access the global variable I created: I just reference the variable
*/
function myFunction(){
    console.log(myGlobalVariable);
}

// notice I do not need to provide the global variable as an argument
myFunction();

myGlobalNumber = 0;

function increaseNumber(){
    myGlobalNumber++;
}

console.log(myGlobalNumber); // this will print 0
increaseNumber(); // this will increase the value of my global variable by 1
console.log(myGlobalNumber); // this will print 1;

/*
    Even if you declare the variable deep inside some function, or deep inside some chain if if statements, if you don't provide a 
    keyword to make the variable part of the block scope then it will be considered part of the global scope
*/
if(true){
    if(true){
        if(true){
            if(true){
                myNum = 4;
            }
        }
    }
}
console.log(myNum);


/*
    The other main scope you will need to be familiar with is the block scope. To declare a variable as part of the block scope you may
    use either the let or the const keywords. The difference between the two is that any variable declared with the const keyword can not have
    its value reassigned: so for instance, if I make a variable called myName, use the const keyword to declare it, and assign it the value of
    "Eric", that variable will always have the value associated with it until my program ends
*/

const myName = "Eric";
// myName = "Bill"; // trying to change a variable with the const keyword used to create it will cause a TypeError when you run your code

/*
    the other keyword associated with the block scope is the let keyword: this keyword indicates that a variable is part of the block scope but it
    can also have its associated value changed
*/

let myLastName = "Suminski";
myLastName = "Gates"; // changing the data the variable is referencing is fine because I used the let keyword, not const

/*
    What makes the block scope different from the global scope is that you can not reference a block scope variable outside of its scope
*/

for(let x = 0; x <=5; x++){
    console.log(x);
}
// console.log(x);// this will cause a ReferenceError: x only existed in the for loop I created earlier

if(true){
    if(true){
        if(true){
            if(true){
                let myLocalNum = 4;
            }
        }
    }
}
// console.log(myLocalNum); // This will cause a ReferenceError because myLocalNum was declared in the block scope above, not global



/*
    Quick note: remember how I wrote above that any variable declared directly in the file is considered global scope? This is true even
    if you use the let or const keywords
*/


globalVariable = "This is a global variable."
let thisIsGlobal = "This is also, technically, part of the global scope";
const alsoGlobal = "This is also global";

function showingOffGlobalVariable(){
    console.log(thisIsGlobal);
    console.log(alsoGlobal);
}

showingOffGlobalVariable();

/*
    There are two other scopes you should be aware of, but they will not be as common: the function and 
    lexical scope. You can make something part of the function scope by using the var keyword, but this
    is a practice that has been deprecated (out-of-date) due to the addition of the block scope with 
    let and const. This is due to the fact that by declaring a variable part of the function scope you
    make it so that JavaScript "hoists" the variable. This means that, just like JavaScript will read through
    your code and define all your functions before executing your code, any variables in the function scope are
    declared but not initialized (given a value to be a placeholder for). This can lead to unforseen errors in
    your code
*/

console.log(functionScope); // this will print undefined because functionScope was hoisted: initialized but not assigned a value
var functionScope = "This variable exists within the function scope"; // here the variable finally gets its value
console.log(functionScope); // this prints our string like we would expect

/*
    another rare scope you will need to be familiar with is the lexical scope: this scope comes into play when you have a function defined
    within another function: the inner function will have access to the block of the outer function, which would actually be cclassified as
    the lexical scope, not block scope
*/

function outterFunction(){
    let outterVariable = "this is in the lexical scope";
    
    function innerFunction(){
        console.log(outterVariable); // this is fine, because the lexical scope is outside of this block of code
        let innerVariable = "this is in the block scope of the innerFunction";
    }

    innerFunction();
    // console.log(innerVariable); // this is not fine, because I am trying to reference a variable that does not exist in this block

}

outterFunction();

/*
    You can think of variable scopes like a river: you can ride down the river, but you can't go back up the river. So, any variable that is
    "up river" of a block of code can be accessed farther down the "river", but you can't take a variable that is "down river" and send it
    back up in scope.
*/

if(true){
    let myLocalVariable = "this is in the block scope";
    if(true){
        // this block scope is technically part of the outter block scope because it is nested inside of it
        console.log(myLocalVariable); // this is fine: because this block of code is technically part of the outter block we can access its variables
        let myInnerBlockVariable = "this is also technically in the block scope";
    }
    // console.log(myInnerBlockVariable); // this will break our program, because the inner block is not available to the outter block
}
