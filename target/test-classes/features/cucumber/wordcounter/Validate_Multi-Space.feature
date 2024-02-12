@Multi-Space
Feature: Multi-Space Test Suite -

  Scenario Outline: Multi-space word count
    Given Raul needs to know how many words he wrote in his text
    When Raul enters multiple words with their respective space
    And Raul validates that the number of words is exact
    Then Raul Check that the number of words matches those written


    Examples:
      | Text                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      |
      | The word counter should count words correctly, even if there are multiple spaces between them