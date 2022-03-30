@SignUpPage
Feature:SignFeature
  I want to test signup functinality
   
    @SignUp
    Scenario Outline: SignUp Scenario
    Given I am a user of facebook applications
    When User click on create new account button
    And User Enter firstname <firstname>
    And User enter lastname <lastname>
    Then User should be able to signup successfully
    
    Examples: 
      | firstname | lastname |
      | Bali      |    Raj   |
      | Ravi      |    Kumar |