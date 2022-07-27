Feature: You should be able to tell Selenium to perform multiple actions in a single step if necessary

    Scenario: Using Selenium to interact with sometimes hidden elements

        Given   Selenium has pulled up the level 4 web page
        When    Selenium enters a single character into the input then closes the alert 100 times
        When    Selenium clicks the level 4 submit button
        Then    An alert should appear saying how long it took Selenium to automate this Scenario