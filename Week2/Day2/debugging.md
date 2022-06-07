# Debugging Strategies
When writting code, one should  assume that they are going to do something incorrectly, whethere it is calling a function that hasn't been created, mistyping a variable name, etc. This is not something that can be avoided, we are all human. So let's talk some strategies for how to fix our code when things go wrong.

### Debugging methods
1. **Check and see if your IDE is giving you any warning messages**
    - most modern IDEs will provide some sort of visual clue that there is a mistake in your code. VSC has multiple ways of informing you:
        - VSC will underline sections of your code with a red squiggly line if you have some sort of syntax error(you have written your code wrong)
        - VSC will also highlight the line in red in the overview section of your workspace. The overview can be seen on the right side of the workspace
        - VSC will also provide a red square in the space where the scrollbar resides to indicate that you can view your syntax error if you move your scroll bar to that location
2. **check the stack trace in your terminal**
    - when you are building an application or writing a bit of code error message, or what is known as the stack trace, will typically print into your active terminal when something goes wrong with your code.
        - A typical stack trace will usually contain two main sections we as developers will be interested in: the first is a report of the actual issue that occured, the second is the location of where the issue occured
        - the example below happens when you try to reference a variable that does not exist: in this case, we wrote code that tried to access our non-existant variable on line three of our file, at position 13 of the third line.
```cli
ReferenceError: myvariable is not defined
    at Object.<anonymous> (C:\Users\EricSuminski\Desktop\220531-JWA\Week2\Day2\scratch.js:3:13)
    at Module._compile (node:internal/modules/cjs/loader:1105:14)
    at Object.Module._extensions..js (node:internal/modules/cjs/loader:1159:10)
    at Module.load (node:internal/modules/cjs/loader:981:32)
    at Function.Module._load (node:internal/modules/cjs/loader:822:12)
    at Function.executeUserEntryPoint [as runMain] (node:internal/modules/run_main:77:12)
    at node:internal/main/run_main_module:17:47
```
another common error you will see is when you misspell the name of a file or folder when trying to execute your code: in the example below an extra s was added to the name of the file
```cli
Error: Cannot find module 'C:\Users\EricSuminski\Desktop\220531-JWA\Week2\Day2\sscratch.js'
    at Function.Module._resolveFilename (node:internal/modules/cjs/loader:933:15)
    at Function.Module._load (node:internal/modules/cjs/loader:778:27)
    at Function.executeUserEntryPoint [as runMain] (node:internal/modules/run_main:77:12)
    at node:internal/main/run_main_module:17:47 {
  code: 'MODULE_NOT_FOUND',
  requireStack: []
}
```
3. **Rereading your code is sometimes necessary to fix a problem. This typically happens when our code executes without an error but we don't get the results we expected**
    - in these cases, your best bet is to go back line-by-line and reread your code. This can be a slow process, but it is the best way when neither your IDE nor your stacktrace are providing any assistance.
    - A way of making this process more efficient is to incorporate the "Rubber Ducky Debugging Methodology": this is a process where you speak/explain what is happening line by line until your explanation of what the code is supposed to be doing no longer matches the code you have written. Some programmers like to have a rubber ducky next to their workspace and they explain their code to the duck when debugging
4. **If all else fails, ask for help!**
    - Your fellow associates/trainer are always resources you can turn to for advice, and so is the web!
        - Don't be afraid to reach out to others for help when you are stumped, but recognize that the intial help you recieve will typically be the first three debugging options
        - if the previous debugging options fail you, then the web is going to be your best friend: more likely than not, someone else has run into the same issue you have, and getting the answer they were provided with is a short google search away. Some typically helpful locations to look for answers:
            - StackOverflow
            - Official Documentation
            - W3Schools
            - Google