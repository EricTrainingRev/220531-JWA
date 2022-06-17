# Software Development Lifecycle
The SDLC is the workflow for creating a piece of software. There is no "official" or perfect SDLC, and different organizations and design philosophies will have their own take on the SDLC. All of them will have a similar structure as outlined below, or at least include them somewhere in their development lifecycle:
- **The Design Phase**
    - gather requirements
    - analyze requirements
    - design a solution
- **The Development Phase**
    - develop solution
    - test the solution
    - perform User Acceptance Testing
- **The Delivery Phase**
    - release solution
    - maintain the product

### Waterfall Methodology (plan driven model)
Historically, the Waterfall approach has been the means of enacting the SDLC as listed above.
The waterfall methodology is a rigid system that only ever moves forward: once you have left a phase you DON'T go back to it. It is a contract heavy, documentation dense, and highly ordered means of development.

![waterfall image](waterfall-image.png)

- **Requirements definition**
    - The system's components, goals, functionalities, services, and constraints will be determined and written in detail in the documentation. This documentation will be known as the system specification.
- **System and software design**
    - Determine the overall system architecture
- **Implementation and unit testing**
    - This stage involves breaking down the software design into components and verifying whether the components address requirement specifications
- **Integration and system testing**
    - Every component is combined to form a single system and is tested to see if they components mesh well with each other.
- **Operation and maintenance**
    - The system is shipped out and maintenance (improving the system and fixing any bugs that were not discovered earlier.
#### Benefits/Drawbacks
- **Benefits**
    - you know exactly what the end goal of your work is
    - The linear progression of development makes it easier to know what to do "next"
    - this methodology helps to reduce confusion between different teams
    - this methodology doesn't require in-depth knowledge of any "ceremonies" or mindsets: you finish a step, you move to the next one, and that's all you need to know from a development point of view
- **Drawbacks**
    - lack of client involvement can lead to a dissapointed customer when they realize you've built something they don't actually want
    - a lack of backwards movement in development stages puts a lot of pressure on teams to "get it right" without knowing how all the pieces work together
    - many bugs won't be discovered until later steps of the process are reached, due to everything happening in a forward moving linear pattern
### Agile
Agile methodologies tend to be much more flexible as design philosophies than Waterfall. There are four core components to any Agile methodology:
- Individuals and interactions over processes and tools
- Working software over comprehensive documentation
- Customer collaboration over contract negotiation
- Responding to change over following a plan

![agile vs plan driven](agile-image.png)

Teams that work with the Agile mindset typically include the following:
- dynamic project scopes
- iterative development cycles
- copious use of automation tools to speed up redundant work

A key feature of Agile development is the User Stories: these stories are where customer desires can be transformed into developer work. There are multiple ways of developing these stories, but there are some stereotypical ways of creating these user stories:
- **Epic**
    - an epic is a collection of user stories that details how multiple features, usually those that have some overlap with one another, should work
- **User Story**
    - a short narrative of what a user should see/what actions they should take when using the product

Because user stories are only part of the whole when it comes to an application, and due to Agile development being done in iterative cycles, teams need a way of determining how easy/difficult user stories will be to create, and how long these stories will be to implement. To handle this, User stories are typically assigned **Story Points**, which is an easy way to tracking how much (expected) time and effort will be needed to finish the user story during development. An iteration of development is typically called a **Sprint**, and the total amount of Story Points handled during the sprint is known as the **Velocity** of the sprint. Keeping track of sprint velocity allows teams to better understand how much work they can handle each iteration, and it also gives them a good metric for tracking how well they assign Story Points to user stories.
### Scrum
Scrum is an agile methodology that follows some standard practices in order to maintain an Agile mindset. There is some terminlolgy you will need to be familiar with when we discuss this topic:
- **Development Team**
    - this is a small group of developers (ideally no more than 7) that work together on a project
- **Product Backlog**
    - a list of work that needs to be done for the current project. This could be user stories to implement, documentation to write, or other supplementary tasks
- **Stakeholder**
    - the individual/group the product is being created for
- **Product Owner**
    - an individual (or small team) that determine what features/requirements are necessary for the end product. This can be the actuall individual you are doing development work for, but it could also be a project manager or some other stakeholder
- **Scrum**
    - confusingly, scrum is also the name of the daily meeting that happens with the team. Everyone gives a brief update on where they are at, any blockers they have, and this is a time for the team to either help those with blockers or schedule some time to help those who need it
- **Scrum master**
    - this individual keeps the team moving in the right direction: they handle interacting with outside sources (such as other departments, the product owner, etc.) and they help with cross-team communication. While the official developers of Scrum say these individuals are not project managers, it is hard to see what the real difference is between them

A Scrum will have three main phases, with the middle phase being the longest by far:
- **Initial Phase**
    - during this time the initial plan for the project are set up and the initial backlog is created
- **Sprint Cycles**
    - this is the phase where sprints are completed, with the product being produced in increments. Changes to the project can be made at this time, which can affect the necessary amount of sprints necessary to complete the project
- **Closure Phase**
    - This phase is when the project is fininished, any final documentation is created, and the team can now be assigned to a new project
#### Scrum Sprint
![Scrum Sprint overview](scrum-image.png)

A normal sprint will contain the following Ceremonies (activities, not sure why they are called ceremonies):
- **User Story Grooming**
    - this is where user stories/epics are taken from the backlog and assigned to teams. Story Pointing also happens at this time
    - this is the first ceremony of the Sprint
- **Daily Standup**
    - this is the scrum, the morning activity where everyone gets on the same page and communicates how things are going
- **Sprint Retrospective**
    - this ceremony happens at the end of a sprint. The team meets to do a review session and determine what went well, what can be improved upon, and do any prep necessary before the start of the next sprint

### async/await/promise
-**async**
    - An async function is a function that operates asynchronously via the event loop(it's execution can pause and continue at a later time) and returns a Promise object implicitly. async ensures that the function returns a promise.
- **promise**
    - a promise is a placeholder for data used in asynchronously coding: they can be "fulfilled" if the expected content is returned, or "rejected" if it is not. functions declared with the async keyword will return a promise by default
- **await**
    - this keyword can only be used in async functions: when used with a promise it will make the function pause execution (allowing the rest of your code to continue executing) until the promise is handled (fulfilled or rejected)
        - the await keyword is the prefered way of handling promises

### fetch
Fetch is a built in function that allows you to make http requests via your JavaScript code. By default, fetch returns a promise object, so wrapping it in an async function makes it easy to parse out the response by using the await keyword
```JavaScript
async function makeHTTPRequest(){
    /*
        response will be a reference to the http response retrieved from the promise (handled by await)
    */
    const httpResponse = await fetch(`http://url-goes-here.com`);

    /*
        responseBody will be a reference to the content of the http response body (the json function converts the data from a json into a JavaScript object). HOWEVER, the actual return value of the json function is a promise, so we use the await keyword one more time to convert the promise object into the JavaScript object literal  
    */
    const responseBody = await httpResponse.json();

    // see Week3 Day2 pokedex example to see how you can work with fetch

}
```
to attach data to your HTTP request you can create an object literal and pass it as the second argument of the fetch function
```JavaScript
/*
    assume the code below is inside an async function

    you can create an object with the three keys below to adjust the HTTP request you make
*/
let httpRequestBody = {
    keyOne:"value one",
    keyTwo:"value two"
}

let config = {
    method:"POST", // method is a reference to the kind of request you are making (the verb): GET is the default
    headers:{'Content-Type':"application/json"}, // some APIs will return an error message without this value included
    body: JSON.stringify(httpRequestBody) // stringify converts a JavaScript object into a json
}

const httpResponse = await fetch("http://url-goes-here.com", config); // notice we added the config object

const responseBody = await httpResponse.json(); // converts the response body json into a JavaScript object
```
