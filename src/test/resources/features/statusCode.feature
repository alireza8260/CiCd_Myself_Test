Feature: Status Code
@smoke
  Scenario:
    Given user should be in home page
    When user should choose "Status Codes" page
    Then user should see the below list of status code
      | 200 |
      | 301 |
      | 404 |
      | 500 |
