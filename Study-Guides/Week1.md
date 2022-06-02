# Week 1 Study Guide

### Integrated Development Environment
an IDE is a tool we use to write and test our code. Most IDEs will have the following:
- intelisense
    - informs you about syntax errors, gives helpful hints for what functions you can call, etc.
- project explorer
    - an overview of what folder you have open and all the sub directories and files contained within
- workspace
    - a window where you write your code. Intelisense help happens here
- a way to execute your code
    - in Visual Studio Code we have been using the command line in a terminal

### Terminal
a terminal is a way of interacting with your computer via written commands. So far we have used the node command to execute our JavaScript files and the cd command to change our working directory to make it easier to execute our files
- working directory is where the terminal is operating in your file system. Any command you run (like node fileName.js) will automatically look for the file located in the working directory of the terminal. If you want to execute a command on a file located somewhere else you have to provide the path to that file (node folder1\folder2\file.js)

### Runtime Environment
A Runtime Environment is software that provides the means of executing your code. For JavaScript we are using the Node.js runtime environment. Node provides us with a way of executing JavaScript files from the command line by using the command "node". Node will then read, compile, and execute our file.
- compiling is the process of turning code from its human readable format into a machine-friendly format that your computer understands

### JavaScript Data types
1. string
2. number
3. bigInt
4. boolean
5. null
6. undefined
7. symbol

### Variable


### Various JavaScript Operators
An operator is a character that provides some kind of functionality in a programming language. For instance, the "=" character is the assignment operator: you use it to assign a value to a variable
#### Arithmetic Operators
```javascript
/*
    + addition
    - subtraction
    / division
    * multiplication
    % modulous (get the remainder of a division result)
    ** exponent (raise a number to a given power: 5**2 would raise 5 to the second power)
*/
```
#### Logic Operators
```JavaScript
/*
    > greater than
    < less than
    == loose equality (doesn't check data type, allows type coercion)
    === strict equality (checks type, does not allow type coercion)
    >= greater than equal to
    <= less than equal to
    || or
    && and
    ! not
*/
```