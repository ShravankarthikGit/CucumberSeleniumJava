Feature: Login

  Scenario: test login with username and password to ecommerce website
    Given User is on ecommerce home page
    When User enters valid credentials
    And User clicks on submit button
    Then User is on accountpage