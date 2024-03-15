Feature: Calculator

  Scenario: Check add
    Given Calculator with value 5
    When call add method with value 7
    Then The value will be 12



  Scenario: Check add
    Given Calculator with value -5
    When call add method with value 7
    Then The value will be 12


  Scenario: Check add
    Given Calculator with value -5
    When call add method with value -7
    Then The value will be 12
