package com.example.steps;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.example.runner.ITTestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UploadSteps {

    @Given("I am on the Web Page")
    public void i_am_on_the_Web_Page() {
        ITTestRunner.driver.get("File://C:\\Users\\EricSuminski\\Desktop\\selenium\\src\\main\\resources\\Web-Page.html");
    }

    @When("I upload the test photo")
    public void i_upload_the_test_photo() {
        ITTestRunner.page.uploadFile();
    }
    @When("I click the submit button")
    public void i_click_the_submit_button() {
        ITTestRunner.page.clickSubmit();
    }
    @Then("An alert with the value of the file path should display")
    public void an_alert_with_the_value_of_the_file_path_should_display() {
        String text = ITTestRunner.driver.switchTo().alert().getText();
        ITTestRunner.driver.switchTo().alert().accept();
        Assert.assertEquals("C:\\fakepath\\puppy.jpg", text);
    }

    @Then("A screenshot should be saved in the screenshot folder")
    public void a_screenshot_of_the_alert_should_be_saved_in_the_screenshot_folder() {
        try {
            String headerText = ITTestRunner.driver.findElement(By.id("header")).getText();
            Assert.assertEquals("some text", headerText);
            // NOTE: selenium can not take a screenshot when an alert is present

            /*
                To make the screenshot happen we have to typcast the driver to a TakesScreenshot type, which gives 
                access to the getScreenshotAs() method.
            */            
            File screenshotData = ((TakesScreenshot)ITTestRunner.driver).getScreenshotAs(OutputType.FILE);
            /*
                We then use the FileUtils copyFile() method to create an image from our screenshot. Any duplicate
                screenshots will overwrite the previous image, so if you want to keep records you will need to 
                use a formatted string.
            */
            FileUtils.copyFile(screenshotData, new File("src\\test\\resources\\screenshots\\Header.jpg"));
            

            /*
                NOTE: typically you would take a screenshot of a failed step so you can get a visual of the page
                when things go wrong: that is why this particular step has an assert statement at the front
                end of it to verify the header actually changed instead of putting it at the end. The screenshot
                is there to show off how you would go about using it
            */
        } catch (IOException e) {
            /*
                copyFile() can cause an IOException, which is a checked exception, so we need this catch block to
                handle the possible exception. If we get the exception the Assert.fail() call will ensure the
                step is marked as failing.
            */
            e.printStackTrace();
            Assert.fail();
        }

    }

    @When("I enter text into the text input and click the button to change the header")
    public void i_enter_text_into_the_text_input_and_click_the_button_to_change_the_header() {
        ITTestRunner.page.updateHeader();
    }
    
}
