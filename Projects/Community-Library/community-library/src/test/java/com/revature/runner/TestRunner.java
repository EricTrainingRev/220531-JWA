package com.revature.runner;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.revature.poms.LibraryPage;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", glue = "com/revature/steps", plugin = "pretty")
public class TestRunner {

    public static WebDriver driver;
    public static LibraryPage libraryPage;
    public static WebDriverWait wait;

    @BeforeClass
    public static void setup(){
        // i want to create the book that is going to be used in the take book scenario here
        // and then pass its id into the pom so I know what id to grab

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);

        libraryPage = new LibraryPage(driver);

        wait = new WebDriverWait(driver, 2);

    }

    @AfterClass
    public static void teardown(){
        driver.quit();
    }
    
}
