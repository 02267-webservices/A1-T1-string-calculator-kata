Feature: Does 1 plus 1 plus 1 equals 3?

  Scenario: 1 plus 1 plus 1 is 3
    Given input is "1\n2,3"
    When the add button is pressed
    Then 6 is shown on the display.
