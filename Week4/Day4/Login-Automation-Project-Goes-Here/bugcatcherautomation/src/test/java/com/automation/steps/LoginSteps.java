package com.automation.steps;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.automation.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    /*
        User agnostic steps below
     */

    @Given("the employee is on the login page")
    public void the_employee_is_on_the_login_page() {
        // when telling selenium to get a local file you have to add File:// to the start of the url
        TestRunner.driver.get("File://C:/Users/EricSuminski/Desktop/220531-JWA/Week4/Day4/Login-Automation-Project-Goes-Here/bugcatcherautomation/src/test/resources/web-pages/login.html");
    }

    @When("the employee clicks the login button")
    public void the_employee_clicks_the_login_button() {
        TestRunner.login.clickButton();
    }


    /*
        Manager steps below
     */

    @When("the manager enters his correct username")
    public void the_manager_enters_his_correct_username() {
        TestRunner.login.enterUsername("Manager");
    }

    @When("the manager enters his correct password")
    public void the_manager_enters_his_correct_password() {
        TestRunner.login.enterPassword("Automation");
    }

    @Then("the manager should be logged in to the manager home page")
    public void the_manager_should_be_logged_in_to_the_manager_home_page() {
        // this method checks that my simulated manager has actually ended up on the manager page
        TestRunner.wait.until(ExpectedConditions.titleIs("Manager Page"));
        String title = TestRunner.driver.getTitle();
        Assert.assertEquals("Manager Page", title);
    }

    /*
        Tester steps below
     */
    
    @When("the tester enters his correct username")
    public void the_tester_enters_his_correct_username() {
        TestRunner.login.enterUsername("Tester");
    }

    @When("the tester enters his correct password")
    public void the_tester_enters_his_correct_password() {
        TestRunner.login.enterPassword("Automation");
    }
    
    @Then("the tester should be logged in to the tester home page")
    public void the_tester_should_be_logged_in_to_the_tester_home_page() {
        TestRunner.wait.until(ExpectedConditions.titleIs("Tester Page"));
        String title = TestRunner.driver.getTitle();
        Assert.assertEquals("Tester Page", title);
    }
    
    
}
