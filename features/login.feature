@Facebook
Feature: FacebookFeature
  I want to test facebook application

  @LoginTag
  Scenario Outline: Login Scenario
    Given I am a user of facebook applications
    When User enter valid Username <username>
    And User enter valid Password <password>
    And User click on login button
    Then User should be able to login successfully

    Examples: 
      | username | password |
      | Bali     |    12345 |
      | Ravi     |    45632 |

  @CreateNewAccount
  Scenario: Login Scenario
    Given I am a user of facebook applications
    When User click on create new account button
    Then User should be able to signup successfully
