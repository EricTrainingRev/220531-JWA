# Employee Reimbursement System

You will be building and testing an employee reimbursement system for a company of your choosing. The company should be fictious and fun. Examples, Weyland Utani, Wayne Enterprises, Stark Industries etc.... You will have to build the application from the ground up following Behavior Driven Development and Test Driven Development practices. You will build the UI and write the automation tests for it. You will be given high level user stories: You must break these down into smaller User Stories where necessary and then into Acceptance Criteria.

## Sprint backlog
The following user stories have been assigned to you for this sprint: you should consider each of these user stories as an MVP (minimum viable product) requirement and so you should focus your efforts on implementing these user stories before anything else in the product backlog.

### Managers
|As A| I Want to| So That|
|----|----------|--------|
|Manager| Sign in| I can view my custom home page| 
|Manager| sign out| I can prevent others from accessing my information|
|Manager| View Reimbursement Requests | I can start addressing them|
|Manager| Approve/Deny Reimbursement Requests | the company knowns whether to pay out or not |

### Employees
|As A| I Want to| So That|
|----|----------|--------|
|Employee| Sign in| I can view my custom home page| 
|Employee| sign out| I can prevent others from accessing my information|
|Employee| create a reimbursement request| I can get money back I spent for the company|
|Employee| view previous reimbursement requests | I can see whether to expect money back or not|

## Business Rules
- Employees
    - Employees must only see their own reimbursement requests
    - Employees may only request up to $1000 dollars per request
    - Employees must provide a reason for the reimbursement request no longer than 500 characters

- Managers
    - Managers must provide a reason for approving or denying a reimbursement request no longer than 500 characters

- Both
    - Usernames must be unique

### Required Documentation
A test policy document will be provided for you. You must produce the remaining documentation listed below:
- Test Plan
    - treat this as a living document
        - should include all your planned test cases
        - test cases should be organized into test suites
        - Unit testing assignments should be dictated here
- Requirement Traceability Matrix
    - treat this as a living document
        - E2E testing assignments should be dictated here
- Acceptance Criteria
    - Similar user stories should be grouped by Feature
    - Business Rules should have acceptance criteria written for them
        - This allows you to create negative E2E tests

### Tesing Requirements

#### Unit Testing
- Repository Layer
    - all methods must have one positive test
- Service Layer
    - all methods must have one negative test per business rule enforced
        - use Mockito to stub the methods for your tests 
#### Integration Testing
- API
    - all routes must have one positive test
    - all routes must have a negative test for each business rule (if applicable)

#### End to End testing
- All Acceptance criteria must be tested via Cucumber and Selenium

## Sprint Schedule
- **7/12/2022 - 7/15/2022**
    - Create wireframes for application
        - get them approved
    - turn user stories into acceptance criteria
        - get them approved
    - create basic requirement traceability matrix
        - get it approved
    - create test plan document
        - start keeping track of required technologies
        - start writing test cases
    - Create database with correct tables
    - Confirm project can successfully connect to the database
    - write unit tests for repository and service layer of application
    - start implementing repository and service layer interfaces to pass unit tests
- **7/18/2022 - 7/22/2022**
    - All repository and service unit tests should be implemented
    - All repository and service interfaces should be implemented to pass unit tests
    - work should be started on project API
        - Javalin should be utilized
        - Thundercat Client or Postman should be used to handle integration tests for the API
    - Work should be started on project UI
        - use basic html/css/javascript
    - E2E tests should be designed
        - use the Server Mocking capabilities of Postman to get a head start on E2E tests
- **7/25/2022 - 2/28/2022**
    - API should be finished
    - E2E tests should be finished
    - Final debugging should be finished by end of day 2/28, ideally on 2/27
    - Code freeze should be implemented 2/28 ideally
    - You should practice your presentation two or three times to hit your 10 minute mark.
    - Make sure your documentation is preppared 
- **7/29/2022**
    - Project presentations are today

## Recommended HTML Elements to Use
- input
- button
- table
    - thead
    - tbody
    - tr
    - th
    - td
- select or datalist
    - option
- header
- paragraph

## Product Backlog
This section includes all the remaining user stories associated with this project, and a diagram for how the content of the user stories should work together. Use it to decide upon stretch goals should you complete the sprint backlog before the end of the sprint.
### Managers
|As A| I Want to| So That|
|----|----------|--------|
|Manager| view global reimbursement statistics | I can see how much money the company has given in reimburesments|
|Manager| view my reimbursement statistics | I can see how much money I have given in reimburesments|

### Employees
|As A| I Want to| So That|
|----|----------|--------|
|Employee| view my reimbursement statistics | I can see how much money I have been given in reimburesments|

## Extra Stretch Goals
- add styling to your web pages
- add extra negative tests to your test case collection
- start implementing user stories from the product backlog