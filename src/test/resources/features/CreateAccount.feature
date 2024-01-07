@CreateAccount
Feature: Navigate to Home page then click on Create Primary Account Button. User should navigate
         to Create Account form page validate Form Title as Expected “Create Primary Account Holder”
  Scenario: Validating create account button and form
    #Given open browser
    When navigate to url
    Then click on Create primary account
    And validate "Create Primary Account Holder" appears
    #And close browser