Feature: Search Cruise
  Users need to be able to look for cruise options base on some filters options

  Scenario Outline: Search Cruise filtering with Ship name, duration and passengers quantity
    Given Jorge wants to make a dream cruise reserve
    When he sets filter ship "<ship>" and duration "<duration>"
    And he sets the number of <passengers>
    Then he must see that first results fits the filter input "<ship>" and "<duration>"
  Examples:
  |ship             |duration| passengers |
  |Carnival Conquest| 2-5    | 1          |
  |Carnival Fantasy | 10+    | 5          |