# Intro to BDD/TDD
Thinking back to the Software Development Life Cycle, there are Three main phases to the cycle:
- Design Phase
- Development Phase
- Delivery Phase

The first phase, the Design Phase, is where Behavior Driven Development really shines: BDD is actually an excellent way of handling things in the Design phase.

### Behavior Driven Development
The whole idea behind BDD is that you are doing development from the perspective of the user. Typically this role of "user" is filled by the product owner. The product owners and the development team interact to create what is known as "User Stories" which the develoment team is able to later turn into code. 

BDD takes into account the entire user experience: their expectations, their experience (are they familiar or not with the application being created), previous interactions with the product, etc. Because this is an all encompasing viewpoint, all aspects of the application need to be designed through this lense of the user perspective:

- UI development (the webpage the user interacts with, the homepage of a desktop application, etc)
- API (how does the user actually interact with the software you are creating?)
- Server choices (where/how is information being stored?)
- etc.

### End to End Tests
E2E tests are the end-goal of Behavior Driven Development: these tests simulate user interactions with your application to determine whether the application as a whole is working correctly or not. In web applications this is typically done via the use of Cucumber and Selenium: Cucumber can take acceptance criteria written via Gherkin syntax and turn it into executable steps of code, whereas Selenium is used to actually interface with the web pages that a user would use to interact with the application.

### Test Driven Development
If BDD is an all encompasing practice, TDD is more focused on the initial setup of an application: BDD tells us that we need to plan/organize everything from the users perspective: Test Driven Development tells us that our actualy development needs to be guided by tests. 

Test Driven Development is a process by which you use your tests to both guide your development and to set guardrails against scope creep. Scope creep is the process by which new and unnecessary features are added to an application. A way to avoid scope creep when developing an application is to FIRST write tests that your application must pass in order to move on to the next step of development.