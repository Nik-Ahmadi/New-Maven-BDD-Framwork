@Homepage
Feature: Validate Title and Button on home page
  Scenario: Validate When user navigate to home page, title is TEK Insurance App
             and create Primary Account Button is exists
    Given open browser
    When navigate to url
    Then get title and validate title is "Tek Insurance UI"
    And assure create primary button exists
    And close browser

