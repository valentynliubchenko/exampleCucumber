Feature: Auto

  Scenario Outline: Find an auto by its name fifth
    Given the following autos exist Example fifth
      | field | value   |
      | name  | <name>  |
      | power | <power> |
    When I search named "<name>"
    Then I should not find an auto
    Examples:
      | name  | power |
      | Tesla | 500   |
      | Mazda | 5     |
      | Volvo | 50    |
