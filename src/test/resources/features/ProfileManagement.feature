Feature: Profile Managemente
  Users need to be able administrate his/her profile at Carnival portal

  Scenario: User attempts to recover username
    Given Jorge wants to recover his username
    When he enters wrong information on recover form
    Then he must see that user name recovery failed