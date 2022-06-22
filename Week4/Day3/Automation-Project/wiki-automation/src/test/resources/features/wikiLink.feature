Feature: Users should be able to view content in their own language
    Scenario: as a English reader I want to view content in English so I can become more knowledegable
        Given   The user is on the Wikipedia homepage
        When    The user clicks on the English link
        Then    The user should view content in English 