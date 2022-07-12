# Test Policy

### Github
- The main branch should be protected from direct pushes
- All development work should be done on individual branches
    - ericLogin could be the name of a branch I create to work on a login feature
- pull requests should be made from the main branch at the start and end of development work to try and minimize merge issues
- pull requests into the main branch should be handled in Github
    - ideally one or more people should have to approve the request before the merge can be complete
    - ideally all merge conflicts should be handled locally: vsc intellisense can help prevent typos you might miss if you try and resolve the merge conflicts in github

### API Routes
- All routes should follow RESTful naming conventions
    - verbs
        - GET: used when retrieving information
        - POST: used when creating information
        - PATCH: used when updating information or logging in
    - routes
        - naming conventions should be consistent
            - /reimbursements can be used for getting, creating, and updating reimbursements by changing which verb is used in the HTTP request
            - if updating a specific reimbursement you should also add an identifier to the route to indicate which specific reimbursement is being updated
                - /reimbursements/{id}

### Project Structure
Your project should be a three tiered web application: it should contain an API, a service layer, and a repository layer.
- the API handles HTTP requests and responses
- the service layer validates that business rules are being adhered to
- the repository layer handles interacting with the database