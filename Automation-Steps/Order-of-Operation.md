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
6. Create a package called steps inside src/test/java/com/automation (com/automation was created by setting the group id to com/automation, your package structure will look different if you chose a different name)
7. Create Java files in the steps package to (eventually) host the code to fullfill each acceptance criteria step
8. Create a package called runner inside src/test/java/com/automation (com/automation was created by setting the group id to com/automation, your package structure will look different if you chose a different name)
9. Create a java file called TestRunner inside the runner package
    - Add the annotation @RunWith(Cucumber.class)
    - Add the annotation @CucumberOptions(features="classpath:features", glue="com/automation/steps")
        - each of these annotations will require you to set imports for them
10. Run the command "mvn verify" in the terminal to generate the code steps for the acceptance criteria
    - copy the code for the steps into the classes you created in the steps folder
        - make sure to only copy one method for each step: any duplicate steps only need one method definition. If you try and duplicate them your code will not execute correctly