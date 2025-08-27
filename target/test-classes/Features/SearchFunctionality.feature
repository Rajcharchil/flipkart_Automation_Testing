Feature: Validate Flipkart Application

  Background:
    Given Launch the Flipkart Application
    When  Close the login popup
    Then  User should be navigated to the Home page

  Scenario: Validate the search functionality
    Given User enters the text in the Search field
    When  User clicks the search button
    Then  It should navigate to the search results page and display the relevant details
