Feature: Login with Wrong Username and Wrong Password
  Scenario: navigate to login with wrong username and password
    When navigate to url
    Then click on the Login button
    And validate "Sign in to your Account" is displayed
    Then login with username "WrongUsername" and password "WrongPassword"
    And verify error "ERROR" appears