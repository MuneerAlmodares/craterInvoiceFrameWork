@CeaterLogin
Feature: Title of your feature
  I want to use this template for my feature file

  @LoginValidation
  Scenario: Valid login scenario
    Given User navigate to the login page
    When User enter a valid Email "muneralmodares93@gmail.com"
    And User enter a valid Password "Test1234"
    When User click on the Login button
    Then User should be on Dashboard Page



  @InvalidLogin
  Scenario Outline: inValid login scenario
    Given User navigate to the login page
    When  User enter a invalid or blank  Email "<userEmail>" and "<password>"
    And   User click on the Login button
    Then  User should see errore message
    

    Examples: 
      | userEmail            | password       |
      | name1@yahoo.com      | pass222        |
      | name2@gmail.com      | hello222       |
      | mony@gmail.com       | hisss          |
      |                      |                |
      | basta@gmail.com      |                |
      | sam@gmail.com        | jkdsjkfsd      |
