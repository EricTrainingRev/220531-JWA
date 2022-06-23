# Java Review
## Java Introduction
- high level
    - automatic memory management (no developer pointers, garbage collection handled for you)
- compiled
    - source code is all compiled together and then it can be run
- statically typed
    - must declare variable types
- strongly typed
    - can not coerce data types
- OOP
    - makes use of classes and objects
- Write Once, Run Anywhere
    - Anyone with a JRE and JVM can run a java app
- rich open source community
    - vast ammount of libraries you can add to your program
## class/object
|class|object|
|-----|------|
|declared using class keyword| declared using new keyword|
|declared once|declared as many times as needed|
|no memory allocated when created|memory allocated when created|
|blueprint for creating objects|instatiated class|
```java
public class myClass {

}
// public = access modifier
// class = needed for class declaration
// myClass = name of class
```
## jdk, jre, jvm
- JVM
    - the jvm takes compiled java code and runs it.
- JRE
    - the jre contains the runtime libraries necessary for a java app to run, and it houses the jvm too
- JDK
    - the jdk contains developer tools (compiler, debuger, documentation tools, etc.) that allow for the creation of java apps
## pillars of oop
- Abstraction
    - you don't need to know why code works to be able to use it
- Polymorphism
    - objects can behave differently in different contexts
        - Overriding and Overloading are clear examples
        - Overriding happens when you take method from a parent and change its implementation in a child class
        - Overloading is where you have a method with the same name but different parameters that all do different things
- Inheritance
    - classes can acquire behaviors(methods) and attributes(fields) other than those defined in their class
        - child class can inherit variables and methods from parent
- Encapsulation
    - classes can protect their behaviors and attributes by making them private and designating specific means of interacting with their content
    - this provides a level of protection for the class: it prevents unintentional interaction with class data
## methods & parameters
```java
class myClass{
    public static void myBasicMethod(){
        System.out.println("This is where the code for the method goes");
    }
}
// public = access modifier
// static = non-access modifier keyword. Allows access to the method without instantiation
// void = return type. void indicates there is nothing to return
// myBasicMethod = name of the method
// () = any paramaters for the method are listed here
```
## Constructors
Constructors are special methods that determine how classes are to be instantiated as objects. They handle the build logic
```java
public class myClass{
    int myInt;
    String myString;

    // this is a basic "no args" constructor
    public myClass(){
        // every constructor calls super() (or this()) as its first line of code, whether you place it or not
    }

    // this is a constructor that only initializes one variable
    public myClass(int myInt){
        this.myInt = myInt;
    }

    // this is a constructor that initializes both variables
    public myClass(int myInt, String myString){
        this.myInt = myInt;
        this.myString = myString;
    }

    // this is a constructor that takes in an argument for one variable and sets a default for the other
    public myClass(String myString){
        this.myInt = 0;
        this.myString = myString;
    }
}
```
## Variable Scopes
1. Class/static scope
    - available to all instances of the class by invoking the class itself
    - the static keyword makes a variable class scope
    - class scope methods/variables can not interact with instance variables/methods
2. Instance/object scope
    - available to the instance of an object
    - this keword is used to interact with an instance variable
    - instace variables do not cross objects: they are unique per object
3. Method scope
    - available within the method it is instantiated in
    - the variable no longer exists after the method is finished, so it can not be used outside the method
4. Block scope
    - available within the {} it is instantated in
    - usually your controlflow statements
``` java
public class myClass{

    static int classCount = 0; // class scope: available to all myClass objects
    String objectName; // instance scope: each object of this class will have their own objectName field

    public myClass(String objectName){
        int addOnetoClass = 1; // method scope: only available within this method
        myClass.classCount += addOneToClass;
        this.objectName = objectName;
    }

    public static void countClass(){
        if (myClass.classCount > 0){
            System.out.println(myClass.classCount);
        } else {
            int zero = 0; //block scope: only exists here in the code
            System.out.println(zero);
        }
    }
}
```
## access modifiers
|modifier|access|
|-------|-------|
|public|anywhere|
|protected|within same package and sub-classes|
|default (no keyword)|within same package|
|private|within same class|
## packages & imports
packages are a way of organizing our java code. The naming convention is to write a reverse web domain seperating words with periods:
```java 
package com.suminski.mypackage;
```
classes can be referenced anywhere in your program by either using their "fully qualified name" or by importing them.
``` java
// you use the import keyword to import from another package or class
import packagename.classname

// fully qualified class names include the package
packagename.classname.method()
```
# Cucumber/Selenium Review
### Cucumber
Cucumber is a testing framework that allows you to easily create End to End tests that utilize gherkin syntax. This framework can take your acceptance criteria (found in one or more feature files) and link them to test steps you create in test classes (typically placed inside of a steps package). Once you have your steps definied (not implemented) you can then write the code to make sure your acceptance criteria is being fullfilled. What Cucumber does specifically is link your acceptance criteria with the step implementations you create in your test classes.
```feature
Feature: As a user I should be able to view Wikipedia pages in different languages
  Scenario: As an English user I should be able to view Wikipedia in English
    Given I am on the Wikipedia home page
    When  I click the English link
    Then  I should be on the English home page
  Scenario: As an Spanish user I should be able to view Wikipedia in Spanish
    Given I am on the Wikipedia home page
    When  I click the Spanish link
    Then  I should be on the Spanish home page
  Scenario: As an Italian user I should be able to view Wikipedia in Italian
    Given I am on the Wikipedia home page
    When  I click the Italian link
    Then  I should be on the Italian home page
```
Cucumber takes the acceptance criteria above and links it to the steps defined below. The means by which we have been doing this is a TestRunner class
```java
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

@RunWith(Cucumber.class) // this sets Cucumber as the framework to run our tests
@CucumberOptions(
        /*
            features: this determines which feature file/s will be used
            glue: this tells Cucumber where the step implementations are. Direct it to a package
         */
        features = "classpath:features",
        glue = "com/revature/steps"
)
public class TestRunner {

    /*
        The WebDriver field below is necessary for interacting with webpages: it has nothing to do inherently with Cucumber, but you will need it to make use of Selenium: see notes below for Selenium information
    */
    public static WebDriver driver;


    @BeforeClass
    public static void setup(){
        // use the three lines below to set your driver: see Selenium notes below for more information
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe"); // this tells Java what kind of driver you are using, and where it is located
        driver = new ChromeDriver(); // this initializes the value of the driver field you created above
    }

    // don't forget to quit your driver when you are done
    @AfterClass
    public static void teardown(){
        driver.quit();
    }

}

```
To make Cucumber generate your code steps you need to run the command "mvn verify" from the terminal. NOTE your working directory for the terminal needs to be the root folder of the application or the command will not work properly.
```java
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WikiLinksSteps {

    @Given("I am on the Wikipedia home page")
    public void i_am_on_the_wikipedia_home_page() {
        // you write code here to simulate a user's actions
    }
    @When("I click the English link")
    public void i_click_the_english_link() {
        // you write code here to simulate a user's actions
    }
    @Then("I should be on the English home page")
    public void i_should_be_on_the_english_home_page() {
        // you write code here to simulate a user's actions
    }

    @When("I click the Spanish link")
    public void i_click_the_spanish_link() {
        // you write code here to simulate a user's actions
    }
    @Then("I should be on the Spanish home page")
    public void i_should_be_on_the_spanish_home_page() {
        // you write code here to simulate a user's actions
    }

    @When("I click the Italian link")
    public void i_click_the_italian_link() {
        // you write code here to simulate a user's actions
    }
    @Then("I should be on the Italian home page")
    public void i_should_be_on_the_italian_home_page() {
        // you write code here to simulate a user's actions
    }

}
```
Note in the above: All Cucumber has done is link the feature file steps with the Java code steps by using the TestRunner class: you as the tester must provide the means of actually implementing the steps. I skipped ahead a bit and added the Driver field to the TestRunner class already: Selenium will make use of it to interact with the webpage.
### Selenium
Selenium is a browser automation tool: that's it (see their website). That being said, Selenium is the perfect tool to pair with cucumber to create End to End tests for web applications, since Selenium can fill in for a real person interacting with your web pages. In the above examples we linked our acceptance criteria with our code steps, but we had no means of simulating a user on Wikipedia. This is where Selenium comes in: we can use it to simulate the actions a user would take browsing the web. Since the driver has already been set up in the TestRunner we can implement our steps via Selenium in the WikiLinksSteps class
```java
package com.revature.steps;

import com.revature.runner.TestRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.junit.Assert;

public class WikiLinksSteps {

    @Given("I am on the Wikipedia home page")
    public void i_am_on_the_wikipedia_home_page() {
        // the get method is used to simulate the user typing a url into the browser
        TestRunner.driver.get("https://www.wikipedia.org/");
    }
    @When("I click the English link")
    public void i_click_the_english_link() {
        // the findElement method is used to locate an element on the DOM. You first use the By class to determine the css selector you are using, and the second argument is the selector value
        WebElement englishLink = TestRunner.driver.findElement(By.id,"js-link-box-en");
        // the click method is used to simulate the user clicking on a web element
        englishLink.click();
        
    }
    @Then("I should be on the English home page")
    public void i_should_be_on_the_english_home_page() {
        // the getTitle method is used to retrieve the title of the webpage you are on
        String title = TestRunner.driver.getTitle();
        // here we are using the Assert class from Junit to make sure we are on the correct page, else the step will fail because the assertEquals method will throw an exception
        Assert.assertEquals("Wikipedia, the free encyclopedia", title);
    }

    @When("I click the Spanish link")
    public void i_click_the_spanish_link() {
        // note that we can choose different kinds of selectors other than just an id
        WebElement spanishLink = TestRunner.driver.findElement(By.cssSelector,"div[lang='es']");
        spanishLink.click();
    }
    @Then("I should be on the Spanish home page")
    public void i_should_be_on_the_spanish_home_page() {
        Assert.assertEquals("Wikipedia, la enciclopedia libre", TestRunner.driver.getTitle());

    }

    @When("I click the Italian link")
    public void i_click_the_italian_link() {
        // note I can directly call click() on the result of findElement()
        TestRunner.driver.findElement(By.xpath,"/html/body/div[2]/div[8]/a").click();
    }
    @Then("I should be on the Italian home page")
    public void i_should_be_on_the_italian_home_page() {
        Assert.assertEquals("Wikipedia, l'enciclopedia libera", TestRunner.driver.getTitle());
    }

}
```
Notice that Selenium itself is not doing any testing: it is simply simulating the actions of a user. Cucumber is checking to see if an exception is thrown in any of the steps, and if they are, then it marks the step as failing. 

This code is fine, but for larger tests it can be a hassle having to write all of the code inside of the steps themselves: this also makes any potential refactors to the test more difficult, because you would need to comb through the steps to find all the places where any affected code is located and then manually change each individual place. To avoid this problem, and to avoid general boilerplate code, you can create a Page Object Model for each webpage you simulate interacting with, which will localize all the web elements you need to interact with, making it both easier to interact with elements, and also easier to refactor your code when necessary.
```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiHome {

    private WebDriver driver;

    public WikiHome(WebDriver driver){
        // a driver is necessary for finding the web elements you need to interact with. You can initialize this field in the TestRunner
        this.driver = driver;
        // the page factory abstracts away the logic for interacting with web elements: you use the @FindBy annotation to indicate how the PageFactory can find the elements you need on a web page
        PageFactory.initElements(driver,this);
    }

    // we use FindBy to tell the page factory what selector and associated values to use to find the element we want
    @FindBy(id = "js-link-box-en")
    public WebElement english;

    @FindBy(css = "div[lang='es']")
    public WebElement spanish;

    @FindBy(xpath = "/html/body/div[2]/div[8]/a")
    public WebElement italian;

}
```
With the page object model created you can add it to the TestRunner class to make use of it in your step implementation
```java
import com.revature.poms.WikiHome;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = "com/revature/steps",
)
public class TestRunner {

    public static WebDriver driver;
    public static WikiHome wikiHome;


    @BeforeClass
    public static void setup(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();

        // don't forget to pass your driver into your poms
        wikiHome = new WikiHome(driver);
    }

    // don't forget to quit your driver when you are done
    @AfterClass
    public static void teardown(){
        driver.quit();
    }

}
```
Now that your page object model is initialized in the TestRunner you can use it in your steps
```java
package com.revature.steps;

import com.revature.runner.TestRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WikiLinksSteps {

    @Given("I am on the Wikipedia home page")
    public void i_am_on_the_wikipedia_home_page() {
        TestRunner.driver.get("https://www.wikipedia.org/");
    }
    @When("I click the English link")
    public void i_click_the_english_link() {
        TestRunner.wikiHome.english.click();
    }
    @Then("I should be on the English home page")
    public void i_should_be_on_the_english_home_page() {
        String title = TestRunner.driver.getTitle();
        Assert.assertEquals("Wikipedia, the free encyclopedia", title);
    }

    @When("I click the Spanish link")
    public void i_click_the_spanish_link() {
        TestRunner.wikiHome.spanish.click();
    }
    @Then("I should be on the Spanish home page")
    public void i_should_be_on_the_spanish_home_page() {
        Assert.assertEquals("Wikipedia, la enciclopedia libre", TestRunner.driver.getTitle());
    }
    @When("I click the Italian link")
    public void i_click_the_italian_link() {
        TestRunner.wikiHome.italian.click();
    }
    @Then("I should be on the Italian home page")
    public void i_should_be_on_the_italian_home_page() {
        Assert.assertEquals("Wikipedia, l'enciclopedia libera", TestRunner.driver.getTitle());
    }
}
```
Now any potential changes to your webpage can be handled in the pom (like an id being changed, an element being replaced with another, etc) and your steps can remain the same.
### Selenium/Cucumber wrap-up
- Cucumber
    - a testing framework that can turn your Acceptance Criteria into executable steps
    - Alone it does NOT provide the means of interacting with your web pages
- Selenium
    - a web browser automation tool
    - you can simulate user actions on the web using Selenium, but it does not provide any inherent testing features
    - [This is the documentation for Selenium: it contains more specific methods you can use to automate user actions](https://www.selenium.dev/documentation/overview/)

- Cucumber and Selenium together
    - You use Cucumber to determine the steps a user would take for your E2E tests
    - You use Selenium to automate the actions a user would do on your webpages 
- Page Object Model
    - a design pattern used to reduce boilerplate code and simplify the refactoring of your E2E tests.
    - you write the code to locate your elements in the pom, then reference them via a pom object in the steps
        - you could even go as far as to create methods which perform the desired action upon the element, and then call the method in your step implementation
- Junit
    - a test framework that integrates well with Cucumber
    - we make use of the Junit BeforeClass and AfterClass decorators to set up and tear down our E2E test
        - Cucumber looks for a class called TestRunner to perform the setup and teardown when integrated with Junit

