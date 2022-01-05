Feature: Is sum of empty 0?

  Scenario: Sum of empty is 0
    Given input is ""
    When the add button is pressed
    Then 0 is shown on the display.