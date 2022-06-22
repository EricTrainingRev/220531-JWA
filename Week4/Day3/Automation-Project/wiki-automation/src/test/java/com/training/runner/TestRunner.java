package com.training.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) // this line of code lets Junit know it is interacting with Cucumber
/*
    features: this tells Cucumber where the feature files are located: this can be a folder or a direct
    path to individual feature files: below we are just listing the folder that holds the feature files

    glue: this tells Cucumber where the code is located to implement each step of the acceptance criteria.
    You can put the path to either individual java files, or the package that holds all the steps
 */
@CucumberOptions(features="classpath:features" , glue="com/training/steps")
public class TestRunner {
    // this class will handle setting up our automation code, and tearing it down when it is done

    /*
        this class will be Junit's contribution to our automation code: it provides the means of setting up
        all of our data for the automation tests, and then it closes down all the necessary tools we use
        so that our application doesn't eat up all our memory
     */

     public static WebDriver driver;

     @BeforeClass
     public static void setup(){
        System.out.println("This method runs before the steps");

        // this is how we let our code know where the chromedriver is
        // easy way to get the path to the chromedriver.exe is to copy the relative path
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe"); 
        // below we set the driver field to be a ChromDriver object, which is now ready to interact with chrome
        driver = new ChromeDriver();
     }

     @AfterClass
     public static void teardown(){
        System.out.println("This method runs after the steps");

        driver.quit(); // this closes the driver when we are done
     }
    
}
