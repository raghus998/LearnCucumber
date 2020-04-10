Feature: login into application with invalid credentials

  Background: 
    Given open the browser
    When Maximize the browser
    Then Enter the URL

  Scenario: Login into application with invalid  username and password
    Given Navigate to login page
    When user provide valid username "user2" and password "password2"
    When click on login btn
    Then Homepage should be displayed
    And verfiy Title

  Scenario: Login into application with invalid  username and password
    Given Navigate to login page
    When user provide valid username "user1" and password "password1"
    When click on login btn
    Then Homepage should be displayed
    And verfiy Title
