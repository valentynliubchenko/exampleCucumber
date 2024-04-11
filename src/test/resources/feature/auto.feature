Feature: Search for an Auto by name

  Scenario: Find an auto by its name
    Given the following autos exist
      | name     | power |
      | Tesla    | 500   |
      | BMW      | 300   |
      | Mercedes | 400   |
    When I search for the auto named "Tesla"
    Then I should find an auto with 500 horsepower

  Scenario: Find an auto by its name example second
    Given the following autos exist Example second
      | name     | power |
      | Tesla    | 500   |
      | BMW      | 300   |
      | Mercedes | 400   |
    When I search for the auto named "Tesla"
    Then I should find an auto with 500 horsepower


  Scenario: Find an auto by its name example third
    Given the following autos exist Example third
      | name     | power |
      | Tesla    | 500   |
      | BMW      | 300   |
      | Mercedes | 400   |
    When I search for the auto named "Tesla"
    Then I should find an auto with 500 horsepower


  Scenario: Find an auto by its name negative
    Given the following autos exist Example third
      | name     | power |
      | Tesla    | 500   |
      | BMW      | 300   |
      | Mercedes | 400   |
    When I search for the auto named "Tesla new"
    Then I should not find an auto




