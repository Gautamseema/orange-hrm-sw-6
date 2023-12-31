@sanity
Feature: Login test
  As a User I am on login Orange HRM website

  @author-Max @sanity @regression
  Scenario: User should login successful
    Given I am on login page
    When Enter username
    And Enter password
    And Click on Login Button
    Then Verify "Welcome" Message

  @sanity @regression
  Scenario: Verify logo is displayed on homepage
    When I am on login page
    Then Verify Logo is Displayed

  @regression
  Scenario: User should logout successfully
    Given I am on login page
    When Enter username
    And Enter password
    And Click on Login Button
    And Click on User Profile logo
    And Mouse hover on Logout and click
    And Verify the text "Login" is displayed