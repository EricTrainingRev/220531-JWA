Feature: You should be able to tell Selenium to wait for elements to be interactable before trying to interact with them

    Scenario: Using Selenium to interact with sometimes hidden elements

        Given   Selenium has pulled up the level 3 web page
        When    Selenium enters any text into the first hidden input
        When    Selenium enters any text into the second hidden input
        When    Selenium enters any text into the third hidden input
        When    Selenium enters any text into the fourth hidden input
        When    Selenium clicks the level 3 submit button
        Then    An alert should appear saying how long it took Selenium to automate this Scenario