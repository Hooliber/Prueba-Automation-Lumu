@empty string
Feature: empty string Test Suite - Validate Counting words in an empty string

  Scenario Outline: The system should not count words when only spaces are entered
    Given Raul mistakenly enters only spaces in the word counter
    When Raul provide an empty text string example ¨¨
    And valid in the system the count of the words
    Then Word counter should return zero words


    Examples:
      | Text                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      |
      | The word counter should return zero words when only spaces are entered. Example ¨¨