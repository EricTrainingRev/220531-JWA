package com.revature.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.revature.runner.TestRunner;

import io.cucumber.java.en.Given;

public class SharedSteps {

    @Given("The user is on the community library home page")
    public void the_user_is_on_the_community_library_home_page() {
        TestRunner.wait.until(ExpectedConditions.not(ExpectedConditions.alertIsPresent()));
        TestRunner.libraryPage.getLibraryPage();
    }

}
