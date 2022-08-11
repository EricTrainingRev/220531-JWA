Feature: Selenium can upload files and take screenshots

    Background: Getting to the Web Page
        Given I am on the Web Page

    Scenario: As a tester I can upload files using Selenium
        When  I upload the test photo
        When  I click the submit button
        Then  An alert with the value of the file path should display

    Scenario: As a tester I want to take screenshots when things go wrong
        When  I enter text into the text input and click the button to change the header
        Then  A screenshot should be saved in the screenshot folder