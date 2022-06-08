# Dynamic Mad Lib
For this excercise you need to create a dynamic mad lib (takes in user input, continues working until user input tells it to shut dow) using the following tools:
- variables
- if
- else if
- else
- console.log();
- for
- while
- do while
- prompt-sync
- arrays
- template literals

don't forget to make variables, and aim to have your mad lib, at a minimum, handle 3 noun inputs, 3 adjective inputs, and 2 verb inputs

### Mad lib file template
```JavaScript
const prompt = require("prompt-sync")(); // make sure to add second set of open and close parenthesis

/*
    make sure to define your variable that controls the loop
*/

madLibRunning = true;

/*
    create your loop and write your vowel counter code inside of it
*/
while(madLibRunning){

    // these are just for example: your mad lib may use more or fewer parts of speech
    properNouns = [];
    properNounsNeeded = 0; // make this the actual amount needed
    verbs = [];
    verbsNeeded = 0; // make this the actual amount needed
    adjectives = [];
    adjectivesNeeded = 0; // make this the actual amount needed
    adverbs = [];
    adverbsNeeded = 0; // make this the actual amount needed

    /*
        you need to make sure you get all the words necessary for your mad lib
    */
   for(let x = 1; x <= propernounsNeeded; x++){
       let word = prompt("prompt user here");
       properNouns.push(word);
   }

    madlib = 
    `
        you can write your mad lib in a template literal. This allows you to make a multi-line string while also
        adding the contents of your arrays with the filler words. You can do this by writing a $ and then placing curly
        brackets after it. Inside of the curly brackets you would place the value you want inserted, like so: 
        ${properNouns[0]}. This is how you can easily fill in the blanks for your mad lib.
    `

    // make sure to actually print the story

    /*
        make sure to add some code inside the loop that allows for ending the loop
    */
    let continue = prompt("ask user if they want to continue or not");
    if(continue != "desired input"){
        madLibRunning = false;
    }
}
console.log("Thanks for using my Mad Lib App!");
```

### Stretch Goals
Try adding these to your Mad Lib if you finish with the base requirements:
- let the user choose from multiple stories
- try to make a simple choose-your-own-adventure (user input determines what parts of a story they see)
