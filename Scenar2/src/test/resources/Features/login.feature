Feature: Feature to validate the response

  Scenario: Validate the response
    Given API for foreign exchange
    When posted with correct information
    Then validate positive response code received
