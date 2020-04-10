@smokeTest
Feature: login into application

  Scenario: Login into application with valid username and password
    Given Navigate to login page
    When user provide valid username "user1" and password "password1"
    When click on login btn
    Then Homepage should be displayed
    And verfiy Title

  Scenario: Login into application with valid username and password
    Given Navigate to login page
    When user provide valid username "user1" and password "password1"
    When click on login btn
    Then Homepage should be displayed
    And verfiy Title
