/*
    Every now and then you will need to craft complex strings that go farther than one line, or perhaps you need to
    place the results of some complex operation in the middle of your string. You could do regular string concatenation
    using a lot of + operators, or you could use a template literal (sometimes called a template string).
*/

regularString = "This is a regular string";

myTemplateLiteral = 
`
This is how I can make
        a multi-line string easily
`

console.log(myTemplateLiteral); // this will print our template literal along with its formatting/positioning to the console

/*
    The real power of a template literal is its ability to let you include JavaScript statements within the string
    and the results of that statement will become part of the string
*/

// this is how you add an embeded expression into the template literal
// ${} lets JS know we have an embeded expression
// 5+5 is what we want added to the template literal, which equates in this case to 10
result = `5 + 5 is equal to ${5 + 5}`;
console.log(result);

myName = "Charlie";
console.log(`Hello ${myName}!`);

listOfNames = ["Bill", "Tesla"];
console.log(`Hello ${listOfNames[0]} and ${listOfNames[1]}!`);