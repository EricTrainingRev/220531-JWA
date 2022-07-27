Feature: You should be able to tell Selenium to read information on a web page and choose appropriate options

    Scenario: Using Selenium to submit randomly generated content

        Given   Selenium has pulled up the level 2 web page
        When    Selenium selects the appropriate dropdown option
        When    Selenium selects the appropriate check box options
        When    Selenium selects the appropriate radio button
        When    Selenium enters the correct Date
        When    Selenium clicks the level 2 submit button
        Then    An alert should appear saying how long it took Selenium to automate this Scenario