# Static Letter Counter
Create a script that will count how many vowels are in a name and print a message stating how many there are to the console. For instance, if I provide the name Eric I should get a message back saying something like "vowels in your name: 2". Use only the following tools to make this static vowel counter (application runs once, does not take in user input):
- variables
- if
- else if
- else
- console.log()
- for
- while
- do while

### Vowel Counter file template
```JavaScript
/*
    make sure to define your variables
*/

name = ""; // replace the empty string with the name you are checking
vowels = 0; // this variable will keep track of the vowels you find

/*
    write your code to make the vowel counter work after defining your variables
*/

// this will make your for loop go through the characters of the string one by one
for(let character of name){
    // write your code in here to find the number of vowels in the name
}
// don't forget to include a message telling you how many vowels there are
```
### Stretch Goals
- count how many total letters there are in the name
- count how many consonants there are in the name
- count how many words the name contains
- make it so your vowel counter refuses to check a specific name (like "Eric","Billy","Sally", etc.), providing a strongly worded message instead