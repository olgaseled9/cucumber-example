Feature: As a user I want to get ability to use menu sections

  @smoke
  Scenario: Docs sections should contains appropriate columns
    Given the user opens Spring website
    When the user clicks on the "Learn" section
    And the user clicks on the "Overview" item
    Then page with title "Spring | Learn" is displayed
