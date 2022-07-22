Feature: Users should be able to interact with the community library

    Background: users should be on the library home page
        Given   The user is on the community library home page
        
    Scenario: As a user I want to take a book so I can read
        # Given   The user is on the community library home page
        When    The user clicks on the take button for the book he wants to take
        Then    The user should see an alert saying he has successfully taken the book

    Scenario: As a user I want to edit a book so I can fix a mistake in it
        # Given   The user is on the community library home page
        When    The user selects the id of the book he wants to edit
        When    The user provides an updated title
        When    The user provides an updated author
        When    The user clicks the confirm button
        Then    The user should see an alert saying he successfully edited the book

    Scenario: As a user I want to give a book so I can give back to the community
        # Given   The user is on the community library home page
        When    The user provides a title for the new book
        When    The user provides an author name for the new book
        When    The user clicks the add button
        Then    The user should see an alert saying he has successfully added a book to the library