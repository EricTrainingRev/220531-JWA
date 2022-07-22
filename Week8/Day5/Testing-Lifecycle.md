# Testing Lifecycle
In the same way that the Software Development Lifecycle has different phases in which different tasks need to be accomplished, so to the Testing Lifcycle has its own phases (which often mirror the SDLC) in which different tasks need to be accomplished before moving on to the next.

1. Requirements Analysis Phase
    - Entry Requirements
        - Proper testing documentation
            - test policy
            - test plan
            - user stories
            - etc.
    - Exit Requirement
        - Up-to-date Requirements Traceability Matrix
2. Test Planning Phase
    - Entry Requirements
        - Requirements Traceability Matrix
        - general testing documentation ready to go
    - Exit Requirements
        - Test plan approved (the actual tests approved)
        - Effort Estimation cost approved
3. Test Case Development Phase
    - Entry Requirements
        - up to date RTM and your Test Plan (specificly the tests you need to do)
        - tests cases need to be written up
        - test data written out
    - Exit Requirements
        - tests actually written in code
        - test data created
4. Environment Setup Phase
    - Entry Requirements
        - System design/architectural documents
            - these just tell the developers the specifics of the tools they are working with
                - database connection credentials
                - connection details for virtual machine that will run application
                - etc
            - Environment setup plan
                - this will probably come from your DevOps team
    - Exit Requirements
        - Test environment needs to be set up
            - Smoke testing happens during this time
5. Test Execution Phase
    - Entry Requirements
        - Test Environment set up with test data
    - Exit Requirements
        - All tests are executed
        - All defects should be logged/tracked
6. Test Cycle Closure phase
    - Entry Requirements
        - Tests need to be done
    - Exit Requirements
        - Client approves/confirms work