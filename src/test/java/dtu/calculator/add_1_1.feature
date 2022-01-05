Feature: Does 1 plus 1 equals 2?

  Scenario: 1 plus 1 is 2
    Given input is "1,1,5,7,89,4"
    When the add button is pressed
    Then 107 is shown on the display.