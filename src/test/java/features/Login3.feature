
Feature: login into application with diffrent users

  Scenario Outline: login into application with diffrent users
    Given Navigate to login page
    When user provide valid username <username> and password <Password> of diffrent user
    When click on login btn
    Then Homepage should be displayed
    And verfiy Title

    Examples: 
      | username  | Password  | 
      | username1 | password1 |
      | username2 | Password2 | 
      | username3 | Password3 | 
