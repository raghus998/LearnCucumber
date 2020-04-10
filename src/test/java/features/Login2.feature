@RegTest
Feature: SigIn into application

  Scenario: SignIn into application with valid username and password
    Given Navigate to login page
    When user provide when user provide followinf information
      | raghus | 123 | abc@gmail.com | GVT |
    When click on login btn
    Then Homepage should be displayed
    And verfiy Title

  Scenario: SignIn into application with valid username and password
    Given Navigate to login page
    When user provide when user provide followinf information
      | raghus | 123 | abc@gmail.com | GVT |
    When click on login btn
    Then Homepage should be displayed
    And verfiy Title
