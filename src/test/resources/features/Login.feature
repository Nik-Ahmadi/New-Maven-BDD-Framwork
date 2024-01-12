Feature:
  Scenario:
    #Given open the browser
    When navigate to url
    Then click on the Login button
    And validate "Sign in to your Account" is displayed
    Then login with username "supervisor" and password "tek_supervisor"
    And validate user navigates to "Customer Service Portal"
    #And close the browser