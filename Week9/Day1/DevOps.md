# DevOps
Software Development and Operations (DevOps) is a methodology that tries to streamline and automate the development, deployment, and maintenance of code as much as possible. There are 5 general steps to the DevOps process:
1. Source Code Control
    - this is the practice of storing your source code in a central repository accessible to all the developers/testers
2. Building and Testing Automation
    - this is the practice of automating your unit tests as part of your DevOps pipeline and using your passing tests as a check before building your application.
3. Deploying to Staging
    - this is the practice of taking your built application from the previous step and deploying it in a test environment for the purposes of doing your System tests (think E2E tests)
4. Acceptance Testing
    - this is the practice of automating your integration/System tests in an environment that simulates the production environment as closely as possible
5. Deployment of Build
    - this is the practice of moving your application to the production environment and starting it up

### DevOps and Agile
When doing Agile development there are three terms typically used to describe how much/little of the DevOps pipeline has been automated: there is Continuous Integration, Continuous Delivery, and Continuous Deployment.

### Continuous Integration
CI is the process of implementing the Source Code Control step of the devop pipeline. You've done this by using Github as a central repository for group work: this is implementing Continuous Integration. 

### Continuous Delivery
CD is the process of implementing automation for steps 2-4: this can be any combination of automating these steps. This particular CD is the term used to describe a level of automation of the DevOps process that is not complete automation of the pipeline. This can be a useful practice if you are just starting work on a project because the time it takes to set up an automated DevOps pipeline can take away from the actual development work on the application. The more established the project is, and the larger the team working on it is, the easier it can be to make your Continuous Delivery practice more and more automated.

### Continuous Deployment
CD (not to be confused with the CD above) is the process by which the entirety of your DevOps pipeline is automated: theoretically, a merge to the main branch of your central repository could, by automation, lead to an update in your production environment without anyone actually touching the source code, the production environment, the test environment, or anything in-between. Because this is such an all encompasing practice, you typically won't see this implemented unless working on a well established project that has had the manpower/time to set up the Continuous Deployment pipeline.