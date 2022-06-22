package com.training.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.training.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WikiLinkSteps {

    @Given("The user is on the Wikipedia homepage")
    public void the_user_is_on_the_Wikipedia_homepage() {
        // drivers have a method called get() which provides an easy way to pull up a webpage in the browser
        TestRunner.driver.get("https://www.wikipedia.org/");
    }

    @When("The user clicks on the English link")
    public void the_user_clicks_on_the_English_link() {
        /*
            there are a few things we need to set up for Selenium to interact with the element
            1. we need to create a Java Object that represent the element
            2. we need to tell Selenium that the element is the specific one we want to interact with
            3. we tell selenium what action to take on the element we specified
         */

        // step 1: create an object that represents the element we want to interact with
        By englishLinkInfo = By.id("js-link-box-en");

        // step 2: create a web element object to actually represent the element we are interacting with
        WebElement englishLink = TestRunner.driver.findElement(englishLinkInfo);

        // step 3: tell selenium what action to take on the element
        englishLink.click();
    }
    @Then("The user should view content in English")
    public void the_user_should_view_content_in_English() {
        // an easy way to check that you are on a new page is to check the title
        String actualTitle = TestRunner.driver.getTitle();

        // to confirm the title is correct and we are on the right page I will use the Assert class
        Assert.assertEquals("Wikipedia, the free encyclopedia", actualTitle); 
    }
}
