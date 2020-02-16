@login
Feature: Orange HRM Login

  Scenario: Logo presence on Orange HRM homepage
    Given Open the browser and load the URL
    When URL opens provide Username and Password
    And Click on the Login button
    Then validate the logo presence post login
    And close browser


