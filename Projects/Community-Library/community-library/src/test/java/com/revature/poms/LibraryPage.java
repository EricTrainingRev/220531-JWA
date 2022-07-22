package com.revature.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.Select;


public class LibraryPage {

    private WebDriver driver;


    // this is absolute xpath: it is a bad idea if you have web elements that change position constantly
    // @FindBy(xpath = "/html/body/table/tbody/tr[8]/td[4]/button")
    @FindBy(xpath = "//button[@id='-5']")
    private WebElement takeButton;

    @FindBy(xpath = "//select[@id='idSelect']")
    private WebElement editId;

    @FindBy(id = "titleEdit")
    private WebElement editTitle;

    @FindBy(id = "authorEdit")
    private WebElement editAuthor;

    @FindBy(id = "confirmButton")
    private WebElement updateButton;

    @FindBy(id = "newTitle")
    private WebElement newTitle;

    @FindBy(id = "newAuthor")
    private WebElement newAuthor;

    @FindBy(id = "createButton")
    private WebElement createBookButton;

    public LibraryPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void getLibraryPage(){
        this.driver.get("file://C:/Users/EricSuminski/Desktop/Community-Library/community-library/src/main/resources/web-pages/library.html");
    }

    public void clickTakeBookButton(){
        this.takeButton.click();
    }

    public String getAlertText(){
        String text = this.driver.switchTo().alert().getText();
        this.driver.switchTo().alert().accept();
        return text;
    }

    public void selectBookToUpdate(){
        Select selectElement = new Select(this.editId);
        selectElement.selectByValue("-6");
    }

    public void updateTitle(){
        this.editTitle.sendKeys("New title");
    }

    public void updateAuthor(){
        this.editAuthor.sendKeys("New Author");
    }

    public void clickUpdateButton(){
        this.updateButton.click();
    }

    public void addNewTitle(){
        this.newTitle.sendKeys("E2E new title");
    }

    public void addNewAuthor(){
        this.newAuthor.sendKeys("E2E new author");
    }

    public void clickAddBookButton(){
        this.createBookButton.click();
    }

    
    
}
