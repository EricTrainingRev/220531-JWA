# Code Challenge Help
There are some helpful functions built in to strings and arrays that can oftentimes make hard coding challenges much simpler. this is a currated list of some helpful functions to be aware of: take some time to mess around with these functions to become more familiar with them.

### String
https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String

- split()
    - can break a string down into smaller parts and store those parts in an array
- includes()
    - returns true if the word/phrase provided is part of the string the function is called on
- indexOf()
    - returns the position where the substring you provide starts: returns -1 if it is not part of the string
- replace()
    - replaces a substring with a new substring (hellow world converted to hello world). The results of the function need to be assigned to a new variable
### Array
https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array

- sort()
    - will order any numbers or string from least to greatest (strings in alphabetical order). Can also be reversed
- indexOf()
    - returns the index position of the argument provided (only the first instance). Returns -1 if the element is not in the array
- lastIndexOf()
    - the same as indexOf, but for the last element to match the argument
- length
    - length is a property that returns the amount of elements stored in the array (including any undefined elements)
- reverse()
    - this function reverses the order of the array
- toString()
    - returns a string representation of the array
