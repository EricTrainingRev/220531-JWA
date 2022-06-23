# Basic End to End Automation Steps
1. Create a maven project
    - create a folder to hold your project
    - use ctr + shift + p to open the command pallet
    - run the command "maven: create maven project"
    - choose the maven quickstart archetype
    - follow the prompts to set the group id, artifact id, and version
        - for these instructions we will assume the group id was set to com.automation
    - after confirming the details open the root project folder (will share the name of the artifact id you set) with vsc
        - WARNING if you do not open the root project folder with vsc it will make all your mvn commands break
2. Update the pom.xml
    - add the necessary dependencies (cucumber junit, cucumber java, selenium)
        - NOTE you may need to change the version of the dependencies on future projects
```xml
    <!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-java -->
    <dependency>
      <groupId>io.cucumber</groupId>
      <artifactId>cucumber-java</artifactId>
      <version>6.1.1</version>
    </dependency>

    <!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-junit -->
    <dependency>
      <groupId>io.cucumber</groupId>
      <artifactId>cucumber-junit</artifactId>
      <version>6.1.1</version>
      <scope>test</scope>
    </dependency>

    <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
    <dependency>
      <groupId>org.seleniumhq.selenium</groupId>
      <artifactId>selenium-java</artifactId>
      <version>3.141.59</version>
    </dependency>
```
3. create a resources folder inside src/test 
4. create a folder called features to store your feature files in, and add your chosen driver to the resources folder as well
5. Transfer your acceptance criteria into feature files and place them in your features folder
6. Create a package called steps inside src/test/java/com/automation (com.automation was created by setting the group id to com/automation, your package structure will look different if you chose a different name)
7. Create Java files in the steps package to (eventually) host the code to fullfill each acceptance criteria step
8. Create a package called runner inside src/test/java/com/automation (com.automation was created by setting the group id to com/automation, your package structure will look different if you chose a different name)
9. Create a java file called TestRunner inside the runner package
    - Add the annotation @RunWith(Cucumber.class)
    - Add the annotation @CucumberOptions(features="classpath:features", glue="com/automation/steps")
        - each of these annotations will require you to set imports for them
10. Run the command "mvn verify" in the terminal to generate the code steps for the acceptance criteria
    - copy the code for the steps into the classes you created in the steps folder
        - make sure to only copy one method for each step: any duplicate steps only need one method definition. If you try and duplicate them your code will not execute correctly
11. Create a package in the same directory as your runner and steps packages called poms (stands for page object models)
12. Create a Java class for each web page you are interacting with
  - make sure to name the classes in such a way that the connection they share with their respective web page is obvious
  - Make sure to provide an instance of a driver to the PageFactory class in the constructor of each pom you create
13. create fields to represent the various web elements Selenium will be interacting with in each pom
14. create methods to interact with the web elements (via the fields created last step)
15. Set the Driver information in the TestRunner, and initialize any poms you are using in the TestRunner as well
  - it can be worthwhile to create a WebDriverWait object to force Selenium to pause for a time (like if a webpage takes a long time to load, or there is a delay before an element renders on the page)
  - it can also be worthwhile to set an implicit wait using the initialized driver to handle slow internet
16. Implement the acceptance criteria steps using the driver and poms you initialized in the TestRunner class
17. Run your test using the command "mvn verify" in the terminal and adjust your code as necessary

## Examples
See the Week4 Day3 and Day4 folders for examples of how your code should be organized. Feel free to copy the dependencies from their poms, and make sure to use those examples as a guide for creating your own automation tests.

## Helpful Links
- [Selenium Documentation](https://www.selenium.dev/documentation/) 
- [Selenium Practice](https://demo.seleniumeasy.com/)
  - this website offers a plethora of ways to practice writing code to interact with web pages