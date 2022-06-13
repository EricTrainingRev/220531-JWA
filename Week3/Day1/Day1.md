# Software Development Life Cycle (SDLC)
While there is no official SDLC, there are some specific practices and phases of development that are either universal or highly recommended. All SDLC will contain some form of the following phases and practices within the phases:
- Design Phase
    - gather requirements
    - analyze requirements
    - design solution for requirements
- Development Phase
    - developing solutions to achieve requirements
    - testing the solution
    - User Acceptance Testing (UAT)
- Delivery Phase
    - release solution
    - maintain solution
### Waterfall (Plan Driven Model)
The typical way of doing software development in the past was the Waterfall method: this type of devlopment is a very rigid model of development: it is contract heavy, documentation dense, and incredibly ordered. One of the key features of the waterfall methodology is that progress only ever moves forward: you NEVER move backwards in development, only ever on to the next step in the process
- **Design phase**
    - gather requirements
    - analyze requirements
    - design solution for requirements
        - **Development Phase**
            - develop solutions
            - test solutions
            - UAT
                - **Deliver Phase**
                    - release
                    - maintain
#### Benefits/Drawbacks
- **Benefits**
    - you always know what you are doing in this methodology
    - linear progression makes it easier to know what's next
    - helps maintain workflow (less confusion between teams/individuals)
    - this methodology does not require intimate knowledge of special ceremonies/activities
- **Drawbacks**
    - lack of client invovlment
    - lack of backwards movement means bugs might not be discovered until later stages in development
    - lack of backwards movement creates a lot of pressure to "get it right" the first time
### Agile
Agile is now considered the standard when it comes to software development. Unlike the waterfall methodology, which has strict rules and organization, Agile is much more of a mindset for development that has many different ways of being implemented. There are four core tenants of Agile that any Agile implementation will maintain:
- Individuals and interactions over processes and tools
- Working software over comprehensive documentation
- Customer collaboration over contract negotiation
- Responding to change over following a plan

Most implementations of the Agile mindset will typically contain the following features:
- dynamic project scopes
- iterative development cycles
- use of automation tools

### Key Agile terminology to know
- **User Story**
    - user stories are a short narrative that explains the actions a user will take with the application you are developing. By writing out these actions as a narrative instead of in technical jargon, this allows for both the product owner (the one/s you are building the application for) and the developers to use a shared language (the language of narrative) to better understand each other
    - in short, user stories are brief explanation of what kinds of actions users will do with the application
- **Epic**
    - an epic is simply a collection of user stories, typically grouped by shared functionality
- **Sprint**
    - sprint is the term typically used to describe an iterative development cycle
- **Story Point**
    - story points are a way of assigning difficulty to user stories. The amount of points assigned will vary depending on company/team, but the idea will remain the same: the more story points assigned to a user story, the more difficult it will be implement the user story.
- **Velocity**
    - velocity is determined by the amount of story points in assigned user stories in a sprint. By keeping track of the velocity of sprints, and whether your team successfully handled all user stories in a sprint, teams are better able to determine whether they are taking on too much, too little, or just the right amount of work.
### Scrum
Scrum is an implementation of the Agile mindset. It makes use of all the agile concepts and terminology, but it also adds its own features/ideas to the process

- **Development team**
    - this is typically going to be no more than 7 developers
- **Product Backlog**
    - this is the place where you document the features that need to be added to the final application you are working on
- **Stakeholder**
    - this is the individual/group that the product is being created for
- **Product Owner**
    - the individual or small team that handle communication between the development team and the stakeholder. Typically the product ownder will help determine what features/requirements are necessary, and therfore, are added to the product backlog.
- **Scrum**
    - confusingly, this is the name of a daily meeting that happens when working during a sprint. This is also sometimes called a standup. During a standup (scrum) the development checks in with each other, describe their tasks for the day, and discuss any blockers among the team members
- **Scrum master**
    - an individual who keeps the team moving in the right direction: this individual handles interactions with the product owner, and also helps to maintain good communication between development teams. There are many who think it is wrong to describe Scrum masters as project managers, but since they do all the same work, I think its fine.

### Scrum phases
There are three main phases to a Scrum
- **Initial Phase**
    - product backlog is created
    - initial development teams are assigned
- **Sprint Cycles**
    - all scrum sprints will contain similar features
        - **Sprint backlog**
            - similar to the project backlog, this collection of user stories is the work that needs to be done in the current sprint
        - **Daily Standups (Daily Scrums)**
            - see scrum notes above
        - **Sprint**
            - a sprint is simply 2-4 weeks (typically) of development work on the contents in the Sprint backlog
        - **release**
            - this happens at the end of a sprint: the work you've done is demoed to the product owner, and feedback is given
        - **retrospective**
            - this is an internal review by the development teams and the Scrum master. This is a checkin to talk about what went well, what could be improved upon, and what work needs to be done before the next sprint
- **Closure Phase**
    - project is finished, any final documentation is created, and the team can now be assigned new work
### Scrum ceremonies
There are three scrum ceremonies you should be familiar with
- **User Story Grooming ceremony**
    - this happens at the start of a sprint when epics are moved to the sprint backlog. Sometimes it is necessary to break down user stories into even more specific user stories (break down the narrative into its individual parts). This happens at the start of a sprint, and it is usually where story pointing happens.
- **Stand Up**
    - see scrum notes above
- **Retrospective**
    - see notes above