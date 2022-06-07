/*
    JavaScript, like many languages, has objects. Unlike the other languages that use Objects, JavaScript objects
    are, fundamentally, key value pairs. These objects are mutable: you can add and remove key value pairs
    to your hearts content. 
*/

// the line of code below creates an empty object: it is ready to get key/value pairs
let myObject = {};

/*
    the code below creates an object with three key/value pairs
    keyOne, keyTwo, and keyThree are the keys in the object that can be used to access the content of the object
    the string, number, and boolean are the actual content of the object, accessed by their respective keys
*/
let myFullObject = {
    keyOne:"This is the first value",
    keyTwo:15,
    keyThree:false
};

/*
    There are two ways of accessing the contents of your objects: you can use the dot operator . or you can use
    square bracketes []. In both cases, you must provide the name of the key you are accessing, but the way these two
    options interact with the object will change your syntax

    we'll start with the easy way: the dot operator.
*/

myObject = {
    keyOne:"This is associated with key one"
};

console.log(myObject.keyOne);

/*
    The other way to acces your key is to use the [], but things can get a little tricky when you use them
*/

/*
    the first console log below will produce a reference error because node will look for a variable called
    keyOne and try to look for a key with the value assigned to that variable in the object. Because we have not
    defined a variable called keyOne in our file this will ultimately produce a reference error
*/
// console.log(myObject[keyOne]);
console.log(myObject["keyOne"]); // this will work, because now it is looking for a key that matches this string

/*
    As a general rule, any key that is a word or collection of words should be accessed via the dot operator, if
    you have a key that is not a word or collection of words than you should access it via the square brackets
*/

myObject = {
    keyOne:"first value",
    2:"second value",
}

// console.log(myObject.2); // this will cause a SyntaxError
console.log(myObject[2]);

// you can do this with a boolean as well: you can reference a boolean using either . or [] options

myObject = {
    true:"value one"
};
console.log(myObject.true);
console.log(myObject[true]);

/*
    You can make the value in a key/value pair a function. There are two ways you can do this: you can make
    the value the result of the function, or you can make it a reference to the function
*/

function myFunction(){
    console.log("function executed");
}

let myFunctionObject = {
    keyOne:myFunction(), // here I call the function (actually execute it) the function is actually exectued at this line
    keyTwo:myFunction // here I reference the function (the function is not executed)
}

myFunctionObject.keyOne; // this is the same as writing the code myFunction(), because keyOne is a reference to myFunction()
myFunctionObject.keyTwo; // to make the message print to the terminal I would need to add () to this code
myFunctionObject.keyTwo(); // you can think of keyTwo as the same as myFunction, so to actually exceute the code I need the ()

/*
    To summarize the craziness above: if you want to store a function inside of your objects make sure to NOT include the (), because if you
    add them then your runetime environment will execute the function when it assigns it to the key
*/

// follow this example:

myObject = {
    keyOne:myFunction // notice no ()
}

myObject.keyOne() // here I add the () to actually call the function

/*
    to add a new key/pair, or to reassign the value of a key pair, you follow the same syntax of using the dot operator or the suqare
    brackets
*/

myObject = {};

// this will add a key to the object called keyOne, its associated value will be the string below
myObject.keyOne = "I added this after I created my object";

console.log(myObject);