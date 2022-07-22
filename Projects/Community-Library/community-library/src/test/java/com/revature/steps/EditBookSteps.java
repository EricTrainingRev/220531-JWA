package com.revature.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.revature.runner.TestRunner;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditBookSteps {

    @When("The user selects the id of the book he wants to edit")
    public void the_user_selects_the_id_of_the_book_he_wants_to_edit() {
        TestRunner.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[@id='option-6']")));
        TestRunner.libraryPage.selectBookToUpdate();
    }
    @When("The user provides an updated title")
    public void the_user_provides_an_updated_title() {
        TestRunner.libraryPage.updateTitle();
    }
    @When("The user provides an updated author")
    public void the_user_provides_an_updated_author() {
        TestRunner.libraryPage.updateAuthor();
    }
    @When("The user clicks the confirm button")
    public void the_user_clicks_the_confirm_button() {
        TestRunner.libraryPage.clickUpdateButton();
    }
    @Then("The user should see an alert saying he successfully edited the book")
    public void the_user_should_see_an_alert_saying_he_successfully_edited_the_book() {
        TestRunner.wait.until(ExpectedConditions.alertIsPresent());
        String result = TestRunner.libraryPage.getAlertText();
        TestRunner.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[@id='bookId-1']")));
        Assert.assertEquals("book was updated successfully!", result);
    }
    
}
