# Test Driven Development Steps
Note: this process assumes you have already generated your user stories and acceptance critera and your wireframes.

For this example I will build a very simple calculator that does simple addition and subtraction.

1. Create interfaces for your application
    - an Interface is a Java feature that allows you to create a "contract" between the interface and a class that implements the interface. Any class that implements an interface MUST define how the methods in the interface should be used
2. Create a base implementation class that will inherit methods from the interface. Don't implement those methods yet!
3. Create tests to determine what the methods should actually accomplish
    - each method being tested should have at minimum one test method assigned to it
    - use the @Test annotation to indicate that a method is a test method
    - use the @BeforeClass method to set up and objects needed for the testing
        - this can also be used to set up test objects
4. Now we can implement our methods to pass our tests
5. Now we can run our tests and see if our implementations pass the tests
6. Refactor code as needed, and when all your tests pass you move on to the next stage of development