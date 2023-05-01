Feature: Add employee to project
  Scenario: Add employee to project
    Given Project with id 1 and name "Project4" exists
    And Employee with name "John" and age 30 and initials "jodo" exists
    When User adds employee "John" to Project with id 1
    Then employee "John" should be assigned to Project with id 1

