Feature: I want to calculate something

  Scenario: Add two numbers
    Given I have entered 50 into the calculator
    And I have entered 70 into the calculator
    And I want to add 80
    When I press add
    Then the result should be 200 on the screen