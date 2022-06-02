/*
    For this to work I am going to need a variable that represents the name I am looping through, and I will also need
    a variable that represents the number of vowels in the name I am looping through
*/

nameToLoopThrough = ""; // I will assign this a value later
vowelCount = 0; // this value will increase depending on the name I loop through

/*
    Now that I have my variables I need to start thinking about what kind of code I need to write for this script
    to work correctly. I know that I need to loop through the name, so an easy way to do this is by using a for loop

    for(let letter of nameToLoopThrough){

    }

    Inside of this loop I know that I need to check and see if each letter is a vowel or not

    for(let letter of nameToLoopThrough){
        if(letter is a vowel){

        }
    }

    if the letter is in fact a vowel then I want to increase the vowelCount variable by 1

    for(let letter of nameToLoopThrough){
        if(letter is a vowel){
            vowelCount++
        }
    }

    After I have looped through all the letters of the name I want to print a message to the console saing
    how many vowels there are

    for(let letter of nameToLoopThrough){
        if(letter is a vowel){
            vowelCount++
        }
    }
    console.log(statement)

*/

nameToLoopThrough = "gordon ramsey";
vowelCount = 0;
totalCount = 0;

for(let letter of nameToLoopThrough){
    if(
        letter === "a" || // remember that the || is the or operator, so if letter does not equal a it will cehck and see if it equals e, etc 
        letter === "e" ||
        letter === "i" ||
        letter === "o" ||
        letter === "u" ||
        letter === "y"
    ){
        vowelCount++
        totalCount++;
    } else {
        totalCount++;
    }
}
console.log("There are " + vowelCount + " vowels in your name and there are " + totalCount + " letters total!");