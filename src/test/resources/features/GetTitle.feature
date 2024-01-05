@GetTitle
Feature: Getting the Title of the WebSite
  Scenario: Check the Title is Google
    Given open the browser
    When navigate to google.com
    Then the title should be google
    And close the browser