package com.revature.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.revature.runner.TestRunner;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GiveBookSteps {


    @When("The user provides a title for the new book")
    public void the_user_provides_a_title_for_the_new_book() {
        TestRunner.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='title goes here']")));
        TestRunner.libraryPage.addNewTitle();
    }
    @When("The user provides an author name for the new book")
    public void the_user_provides_an_author_name_for_the_new_book() {
        TestRunner.libraryPage.addNewAuthor();
    }
    @When("The user clicks the add button")
    public void the_user_clicks_the_add_button() {
        TestRunner.libraryPage.clickAddBookButton();
    }
    @Then("The user should see an alert saying he has successfully added a book to the library")
    public void the_user_should_see_an_alert_saying_he_has_successfully_added_a_book_to_the_library() {
        TestRunner.wait.until(ExpectedConditions.alertIsPresent());
        String result = TestRunner.libraryPage.getAlertText();
        TestRunner.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[@id='bookId-1']")));
        Assert.assertEquals("thank you for providing the book!", result);
    }
    
}
