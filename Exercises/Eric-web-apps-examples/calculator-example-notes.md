# Calculator example notes
So you have had some time to work on the static and dynamic exercises, and this is the newest exercise implementation: the web app. Here I will run you through my thought process and how I would go through each phase of the SDLC to build this basic web calculator.

### Phase 1: The Design Phase
#### Step 1: gather requirements
The first thing I need to do is actually determine what my application needs to accomplish: what sort of problems will my application solve, what sort of quality of life benefit will my applicaiton provide, etc.

Since this exercise was made by me, I just look back at the previous exercises and read the base requirements. In this case, my calculator just needs to be able to do addition, subtraction, multiplication, and divison. I now have finished gathering my requirements, and I need to analyze them

#### Step 2: analyze requirements
This is where a lot of people will get stumped: we know what the application needs to do, but how to we actually get it there? Answering that question is what this step is for. To be most effective, I am going to approach this piece by piece. For starters, to perform ANY mathematical opperation, I need at least 2 things: a number to work with, and the operation to perform.

So, I now know that I need to include at least these two things in my application: a number, and an operation. Realistically though, because I am doing simple mathematics, I will need to use 2 numbers, but if I was doing advanced mathematics I might only need one.

So, I need 2 numbers to work with, and I need an operation to perform on them, and I need one more thing: I need a way of saying the numbers and operator are all correct and that I am ready to get a response from my data. 

So now I know that I need my 2 numbers, my operator, and a way of activating my calculator (this can be both the means of making the operation work, and also showing the results). You could absolutely argue that these things are seperate, the key is to make sure you have both.

#### Step 3: design a solution
Let's start with the numbers: I need to think of a way of getting these numbers from the user. Before, we either would have hard coded the variables, or we would have gotten the user input from the terminal. For a web based app, we need to design our web page in such a way that the user can easily enter the numbers they want to work with. This can easily be handled by using the input element, which we will designate as having the number type to make sure that users only enter numbers in.

Now, for the operator, we could do the same thing and just use an input element, but there is a slight problem with this. If we choose our operator with the input element we will have to use the text type, but this will allow our users to enter any kind of text they want. Ideally, our users should only be allowed to select from our pre-determined operations (addition, subtraction, division, multiplication). I am probably going to want to choose a different web element to handle this choice. After a quick web search, it looks like the select and option elements can give us an easy way to pre-determine what options a user can pick.

Now to actually run the calculation, I think the easiest way to do this would be to create a button and assign it a function to execute a mathematical operation based upon the number inputs and the chosen operator. I will use an event listener to handle this.

Lastly, to actually display my results, I am going to use a simple paragraph element that will have its text content change to show the result of the mathematical operation that was performed. I will set it up so that the value changes to display only the new result every time an operation is performed
### The Development Phase
See calculator-example.html for this phase