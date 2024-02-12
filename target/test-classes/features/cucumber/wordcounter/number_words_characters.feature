@word_counter
Feature: Word Counter Test Suite - Validation of Word and Character Counts

  Scenario Outline: Adding Text and Verifying Word Counts, characters and Repeated Words
    Given Raul opens the Word Counter application in a browser
    When Raul enters the text "<text>" into the provided text field
    And Raul validates the word and character counts
    Then Raul verifies the three most repeated words along with their respective repetition counts


    Examples:
      | text                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |
      | Lorem Ipsum is simply dummy dummy text of the printing and Lorem typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum. |

