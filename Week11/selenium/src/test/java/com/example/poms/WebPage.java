package com.example.poms;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebPage {

    private WebDriver driver;

    @FindBy(id = "upload")
    private WebElement fileInput;

    @FindBy(id = "button")
    private WebElement submitButton;

    @FindBy(id = "textInput")
    private WebElement textInput;

    @FindBy(id = "headerButton")
    private WebElement headerButton;

    public WebPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void uploadFile(){

        this.fileInput.sendKeys("C:\\Users\\EricSuminski\\Desktop\\selenium\\src\\main\\resources\\puppy.jpg");

    }

    public void clickSubmit(){
        // this.submitButton.click();
        /*
            The Actions API is a convinience tool that can give you fine-tuned control over Selenium actions. In
            the example below the moveToElement() method scrolls the web page till the element is visible in the
            browser and then moves the mouse directly over the center of the element. The click() method in this
            action chain will simulate a user clicking WHERE THE MOUSE IS CURRENTLY LOCATED, unlike the click() 
            method attached to the WebElement type, which also attempts to click the center of the element, but if
            the element (not necessarily the click point) is obscured on the page then an element click intercepted
            exception will be raised. This can happen when the CSS of the web page offsets elements or causes multiple
            elements to inhabit the same space
        */
        new Actions(this.driver).moveToElement(this.submitButton).pause(Duration.ofSeconds(1)).click().perform();

    }

    public void updateHeader(){
        /*
            A few things to note: even though moveToElement moves the browser and mouse to the element, it does
            not make it the active element (like select a WebElement object directly would) so you either must 
            specify the element you are sending keys to using sendKeys(element,text), or you must click the 
            element and then send keys.
        */
        new Actions(this.driver)
            .moveToElement(this.textInput).click().sendKeys("some text")
            .moveToElement(this.headerButton).click().perform();
    }

    /*
        NOTE: you could use this method to take the screenshot and not have to define these actions in the
        steps, but because I already put all the notes in the steps I will stick with the current
        step implementation, just know this is another option for how to take the screenshot
    */
    public void takeScreenshot() throws IOException{
        File screenshotData = ((TakesScreenshot)this.driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotData, new File("src\\test\\resources\\screenshots\\Header.jpg"));
    }
    
}
