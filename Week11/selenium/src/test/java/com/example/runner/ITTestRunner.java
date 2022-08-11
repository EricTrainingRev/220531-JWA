package com.example.runner;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.example.poms.WebPage;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", glue = "com.example.steps", plugin = "pretty")
public class ITTestRunner {

    public static WebDriver driver;
    public static WebPage page;

    @BeforeClass
    public static void setup(){
        WebDriverManager.chromedriver().setup(); // provided by the web driver manager dependency
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        page = new WebPage(driver);
    } 

    @AfterClass
    public static void teardown(){
        driver.quit();
    }
    
}
