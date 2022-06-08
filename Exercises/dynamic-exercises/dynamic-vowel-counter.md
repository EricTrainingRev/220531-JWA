# Dynamic Vowel Counter
For this excercise you need to create a dynamic vowel counter (takes in user input, continues working until user input tells it to shut dow) using the following tools:
- variables
- if
- else if
- else
- console.log();
- for
- while
- do while
- prompt-sync

don't forget to make variables, and aim to have your vowel counter, at a minimum, able to determine how many vowels are in a person's name

### Vowel Counter file template
```JavaScript
const prompt = require("prompt-sync")(); // make sure to add second set of open and close parenthesis

/*
    make sure to define your variable that controls the loop
*/

vowelCounterRunning = true;

/*
    create your loop and write your vowel counter code inside of it
*/

while(vowelCounterRunning){

    let name = prompt("message to get input goes here");

    for(let letter of name){
    // code to execute
    }

    // don't forget to print the results to the console!

    /*
        make sure to add some code inside the loop that allows for ending the loop
    */
    let continue = prompt("ask user if they want to continue or not");
    if(continue != "desired input"){
        vowelCounterRunning = false;
    }
}
console.log("Thanks for using my Vowel Counter App!");
```

### Stretch Goals
Try adding these to your Vowel Counter if you finish with the base requirements:
- find how many total letters there are and also print it to the console
- find how many consonants there are and also print it to the console
- find how many words are in their name and also print it to the console