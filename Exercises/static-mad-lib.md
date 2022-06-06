# Static Mad Lib
This exercise involves creating a mad lib that will generate the missing words via arrays you create. For the sake of simplicity your mad lib should be no more than a paragraph or two, and you should aim to fill in no more than 5 blanks in the story. Use only the following tools to make your static mad lib (application runs once, does not take in user input):
- variables
- if
- else if
- else
- console.log()
- for
- while
- do while
- arrays
- template literals

### Static Mad Lib file template
```JavaScript
/*
    make sure to define your variables
*/

// these are just for example: your mad lib may use more or fewer parts of speech
properNouns = [];
verbs = [];
adjectives = [];
adverbs = [];

madlib = 
`
    you can write your mad lib in a template literal. This allows you to make a multi-line string while also
    adding the contents of your arrays with the filler words. You can do this by writing a $ and then placing curly
    brackets after it. Inside of the curly brackets you would place the value you want inserted, like so: 
    ${properNouns[0]}. This is how you can easily fill in the blanks for your mad lib.
`

// make sure to actually print the story
```
### Stretch Goals
- write multiple mad libs that take in varying amounts of words, use your knowledge of control flow to determine which mad lib is printed to the console
