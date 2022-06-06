/*
    Arrays are data structures that allow for storing other data inside of them. You can think of them like boxes
    that have mini containers inside of them: each container within the box can store information for you and provide
    an easy means of accessing that information. To create an array you use square brackets [] and you can place
    information inside of them when you first create it if you wish
*/

myEmptyArray = []; // this is an empty array, ready for information to be stored in it

myArrayWithContent = ["Eric","Bill","Bush"]; // this is any array that has three strings inside of it

/*
    A neat feature about arrays in JavaScript is that they can hold any type of data, and you can mix-and-match
    those data types.
*/

myArrayWithLotsOfDataTypes = ["Obama",12,true,null]; // this is a perfectly fine array

/*
    There are multiple ways to access information from your arrays: the easiest is to reference the index position
    of the data you want. All arrays are indexed: each piece of stored information is assigned a numeric value
    in reference to its position in the array. In JavaScript indexing for arrays starts with the number 0, not
    the number 1, so to access the first element in an array you would use index number 0, not index number 1
*/

myArray = ["String one", "String two"];
console.log(myArray[0]); // this will print String one to the terminal, because that is the value of the string in the first index position
console.log(myArray[1]); // this will print String two to the terminal, because that is the value of the string in the second index position

/*
    myArray is a reference to the array I wish to get information from
    [0] indicates that I want to, in the case above, print the value of the element at index position 0 in the array
*/

/*
    in the same way that a variable is a placeholder for data, you can think of the array itself as a big placeholder for multiple pieces
    of information, each referenced by its respective index position. So, anything you can do with a variable, you can do with an array and its
    index position, but this can lead to some unintended consequences 
*/

myNumbersArray = [5,6];

console.log(myNumbersArray[0] + myNumbersArray[1]); // this is the same as writting console.log(5 + 6)

myNumbersArray[0] = 10;

console.log(myNumbersArray[0] + myNumbersArray[1]); // this is the same as writting console.log(10 + 6)

myStringsArray = ["String one","String two"];

console.log(myStringsArray[0] + myStringsArray[1]); // this is the same as writting "String one" + "String two"

myStringsArray[0] = "String three";

console.log(myStringsArray[0] + myStringsArray[1]); // this is the same as writting "String three" + "String two"

/*
    There are some drawbacks to being able to so easily use the assignment operator: if you assign a value to an index position
    that hasn't yet been created, your array will not only assign the value you want to the index position, but it will also fill in
    any potential gaps there might be
*/

myEmptyArray = []; // this is an empty array: there are no index positions currently

myEmptyArray[3] = "My String"; // this will assign my string to the 4th position in the array, and it will backfill the array so that it actually contains 4 positions

console.log(myEmptyArray);

myNotEmptyArray = ["Position one", "Position two"];

myNotEmptyArray[3] = "Position four";

console.log(myNotEmptyArray[2]);

/*
    to avoid adding potentially many undefined data types to your arrays you can use a built in function that arrays have called push. Any data you
    pass as an argument in the push function will be placed after the last element in the array without the possibility of accidentally creating
    many undefined data types in between.
*/

myArray = [];

myArray.push("Eric"); // this adds my data to the next index position, in this case position 0, since no other data is in the array

console.log(myArray); 

myArray.push("Superman"); // this adds my data to the next index position, in this case position 1, because there is one other element in the array

console.log(myArray);

/*
    To access the built in function you use the dot operator . after the variable name and then, without any spaces added,
    you type the name of the function you want to call, and provide it with any necessary arguments.
*/

/*
    To remove elements from an array you have a few options: there are two functions that can remove elements, and there
    is the key word delete  
*/

myArray = ["Position one", "Position two"];

delete myArray[0];

console.log(myArray);

/*
    delete is a useful option, but notice it just changes the data to be undefined. If you want to actually
    remove the data, you can use the pop command
*/

myArray = ["Position one", "Position two"];

myString = myArray.pop(); // this removes the last element in the array, in this case string "Position two"

console.log(myArray);
console.log(myString);
/*
    to remove an element from the front of the array you can use the shift function
*/

myArray = ["Position one", "Position two"];

myString = myArray.shift() // this removes the first element in the array, in this case, string "Position one"

console.log(myArray);
console.log(myString);
