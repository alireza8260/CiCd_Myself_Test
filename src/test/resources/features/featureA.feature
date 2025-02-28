Feature: Application Should be work
@smoke
  Scenario: simple login
    Given user should be in home page
    When user should choose "Form Authentication" page
    Then user should be login with valid credentails
    Then user should see "You logged into a secure area!" message

