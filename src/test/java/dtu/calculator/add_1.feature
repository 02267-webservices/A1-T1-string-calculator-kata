Feature: Does add() add the numbers correctly?

  Scenario: Sum of empty is 0
    Given input is ""
    When the add button is pressed
    Then 0 is shown on the display.

  Scenario: Sum of 2 is 2
    Given input is "2"
    When the add button is pressed
    Then 2 is shown on the display.

  Scenario: 1 plus 1 is 2
    Given input is "1,1"
    When the add button is pressed
    Then 2 is shown on the display.

  Scenario: 1 + 1 + 5+ 7 + 89 + 4 is 2
    Given input is "1,1,5,7,89,4"
    When the add button is pressed
    Then 107 is shown on the display.

  Scenario: 1 plus 2 plus 3 is 6
    Given input is "1\n2,3"
    When the add button is pressed
    Then 6 is shown on the display.

  Scenario: Test for different delimiters
    Given input is "//;\n1;2"
    When the add button is pressed
    Then 3 is shown on the display.