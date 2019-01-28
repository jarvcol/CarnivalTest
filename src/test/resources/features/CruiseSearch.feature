Feature: Invalid login
  Users need to be able to look for cruise options base on some filters options


  Scenario outline: Attempt to login with invalid credentials
    Given Jorge wantsto make a dream cruise reserve
    When he sets filter <ship> and <duration>
    And he sets the number of <passengers>
    Then he must see that first results fits the filter input
  Examples:
  |ship             |duration| passengers |
  |Carnival Conquest| 2-5    | 1          |
  |Carnival Fantasy | 10+    | 5          |