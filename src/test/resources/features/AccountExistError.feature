Feature: On Create primary account holder form fill up the form and click on create Account Button
  Validate user navigate to Sing up your Account page and email address shows as expected.
  Scenario: filling the Create primary account form and click on create account button
    #Given open browser
    When navigate to url
    Then click on Create primary account
    And validate "Create Primary Account Holder" appears
    Then fill the Create Primary Account Form
    And submit the form
    And verify error "ERROR" appears
    #And close browser