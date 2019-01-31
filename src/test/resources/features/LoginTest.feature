Feature: Invalid login
  Users need to be able see the login refused if invalid credentials are input

  Scenario: Attempt to login with invalid credentials
    Given Jorge wants to login at carnival portal
    When he attempts an incorrect login
    Then he must see that login was not successful