 
 Feature: Login to HRM Application

  Scenario: Login with valid credentials
    Given User is on HRMLogin page
    When User enters valid credentials
      | Admin | admin123 |
    Then User should be able to login sucessfully and new page open
