Feature: create activity
  Description:  an activity is created.
                when an activity is created it has to have a time budget, a start/end week number.
                it can be created with/without a name, project leader and/or employees.
                it should be possible to plan the activities long before their time period begins.

  Actor: Employee

  Scenario: An activity is created with the name "Test project" successfully
    Given that the company get a project with the name "Test project".
    When an employee creates the project.
    Then a project with the name "Test project" is created successfully.
    And the project gets given a project id.