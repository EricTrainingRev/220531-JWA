package com.revature.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.revature.runner.TestRunner;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TakeBookSteps {

    @When("The user clicks on the take button for the book he wants to take")
    public void the_user_clicks_on_the_take_button_for_the_book_he_wants_to_take() {
        TestRunner.libraryPage.clickTakeBookButton();
    }
    @Then("The user should see an alert saying he has successfully taken the book")
    public void the_user_should_see_an_alert_saying_he_has_successfully_taken_the_book() {
        TestRunner.wait.until(ExpectedConditions.alertIsPresent());
        String result = TestRunner.libraryPage.getAlertText();
        TestRunner.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[@id='bookId-1']")));
        Assert.assertEquals("You have checked the book out! Enjoy!", result);
    }
    
}
