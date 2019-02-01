Feature: Profile Management
  Users need to be able administrate his/her profile at Carnival portal

  Scenario: User attempts to recover the password
    Given Jorge is not a registered user
    And he wants to recover his password
    When he sends the required information to recover his password
    Then he should be informed that operation could not be done