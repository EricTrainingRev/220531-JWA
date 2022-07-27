Feature: You should be able to get a randomly generated name and submit it in a form

    Scenario: Using Selenium to submit a randomly generated name

        Given   Selenium has pulled up the level 1 web page
        When    Selenium enters the randomly generated name into the input
        When    Selenium clicks the level 1 submit button
        Then    An alert should appear saying how long it took Selenium to automate this Scenario