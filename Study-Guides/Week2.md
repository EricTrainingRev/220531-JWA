# Week 2 Study Guide
### Arrays
Arrays are data structures in JavaScript that can store information inside of them for easy reference. They are mutable (can be resized) and maintain the order of the data inserted into them
```JavaScript
// to create a new, empty array
let myArray = [];
```
you can also create arrays with data starting inside of them
```JavaScript
let myArray = ["element one","element two"];
```
to access the contents of an array you use the index position of the element. Indexing starts at 0, so the first element added to an array is placed at index position 0, the next at index position 1, etc.
```JavaScript
let myArray = [];

// push is the built in method to append (add to the end of the array) elements into an array
myArray.push("element one");

// use square brackets and a number to indicate the index position of the element you want
console.log(myArray[0])
```
arrays also have built in ways of removing elements
```JavaScript
let myArray = ["element one","element two"];

// this will remove the last element of the array. You could assign this value to a variable by doing this if you wanted
myArray.pop();

// this will remove the first element of the array (index position 0). You could assign this value to a variable by doing this if you wanted
myArray.shift();
```
### Template Literals
Template Literals provide a convinient way of embedding JavaScript expressions (snippets of code) inside of a string. This process is called string interpolation.
```JavaScript
 let myTemplateLiteral = `use back-tics to create template literals`;

 let myMultilineString = 
 '
    You can use template literals to make multi-line strings. Any sort of formatting you create, tabbed spaces, new lines, all will be part of the string.
 '
```
to add an embeded expression you us the dollar sign and then curly brackets: ${}
```JavaScript
let myName = "Bill Gates";
let myTemplateLiteral = `Hello! My name is ${myName}`;

// this will print "Hello! My name is Bill Gates" to the console
console.log(myTemplateLiteral);
```
You don't just have to pass in variables
```JavaScript
let myMathEquation = `5 + 5 = ${5+5}`; // equates to "5 + 5 = 10

let myLogicalQuestion = `Is 5 greater than 4? ${5>4}`; // equates to "Is 5 greater than 4? true"
```
### Arrow Functions
Arrow functions are another way of writting functions in JavaScript: unlike regular functions, Arrow functions are not hoisted, so you can't call them until after you have declared and initialized them. They can also be redefined to execute new code later in your file
```JavaScript
// single line arrow function, no parameters
let myArrowFunction = () => console.log("Hello world!");
myArrowFunction(); // will print Hello world! to the console

// multi-line arrow function, two parameters
myArrowFunction = (numOne, numTwo) =>{
    let result = numOne + numTwo;
    return result;
}
let number = myArrowFunction(5,5);
console.log(number) // will print 10 to the console
```
### Object Literals
Object literals are collections of key/value pairs, and they provide another way of storing and referencing information in your code. The syntax for creating them is to put key:value inside of {}, seperated by commas
```JavaScript
// an empty object
let myObject = {};

// notice I could use a word, number, or boolean as a key
let myFullObject = {
    keyOne:"value one",
    2:"value two",
    true: 12
};
```
to access the values stored in the object you can either use the dot operator . or square brackets []
```JavaScript
let myFullObject = {
    keyOne:"value one",
    2:"value two",
    true: 12
};

console.log(myFullObject.keyOne); // use the dot operator on keys that are words

console.log(myFullObject[2]); // use the square brackets to reference keys that are not words

// either of the above options would work for the boolean key
```
to add a new key value pair you can use either the dot operator or square brackets, designate the key, and the assignment operator with the new value to be added to the object
```JavaScript
let myObject = {};

myObject.keyOne = "element one"; // creates the key value pair of keyOne:"element one"

myObject[2] = "second element"; // creates the key value pair of 2:"element two"
```
you can also make function references the value of keys in objects
```JavaScript
function myFunction(){
    console.log("Hello world!");
}

let myObject = {
    keyOne:myFunction // notice no ()
};

myObject.keyOne(); // () are added here when I reference the key, will print Hello world to the console
```
### HTML/CSS
HTML is used to create web pages: browsers read the content of an HTML file and render the content in the viewport. The different pieces of a web page are called elements, and they are created by using tags in the HTML file. These tags can be organized/adjusted by adding attributes to the tag, such as giving an ID assignment, assigning classes to the element, or adding instructions for what should happen when the element is clicked on.

CSS is what is used to provide styling for web elements. This can affect the positioning, color, alignment, just about any visual aspect of the element. You can assign styling via in-line (within the tag of the elemnt), internal (via a style element in the head section of the html file), or via external css (css in a seperate file linked via a link tag in the head section)

### Selecting Elements via JavaScript
You can use JavaScript to access and manipulate elements on a web page. Two common means of doing so are by selecting the element by its id attribute, or accessig multiple elements by a shared class name
```JavaScript
// accessing via id
const element = document.getElementById("id goes here as a string");

// accessing via class
let elements = document.getElementsByClassName("class name goes here as a string")
```
using the second option returns an HTMLCollection object that contains references to all the web elements that contain the given class name. This collection can be iterated through, and the elements can be accessed by their index position, but the collection does not have access to the push, pop, and shift methods that a normal Array would have.

### Event Listeners
Event listeners provide a way of adding dynamic functionality to your web pages. You can tell your web page to "listen" for events to happen, and when they do, perform some action, such as sending information to a web server, pop up an alert for the user, change text color on the page, etc. You can do this by using an onevent attribute directly in your web elements or by using the addEventListener function via JavaScript
```HTML
<!-- notice the "this" keyword: it provides an easy reference to the element it is used in -->
<p onclick="this.style.color='red'">this text will turn red when the element is clicked on</p>

<p id="paragraph">this text will turn yellow when the element is clicked on</p>

<script>
    // create a reference to the element
    const paragraph = document.getElementById("paragraph");

    // create a function to execute upon your chosen event
    function changeTextYellow(){
        paragraph.style.color = "yellow";
    }

    // use the addEventListener method to set the event the page is "listening" for and the function to execute when it happens
    paragraph.addEventListener("click",changeTextYellow);
</script>
```