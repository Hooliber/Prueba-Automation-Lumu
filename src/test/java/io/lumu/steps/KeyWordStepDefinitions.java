package io.lumu.steps;

import static io.lumu.tasks.LeftCount.count;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.lumu.tasks.EnterTextField;
import io.lumu.tasks.KeywordDensity;
import net.serenitybdd.screenplay.Actor;

public class KeyWordStepDefinitions {

  @When("{actor} enters the text {string} into the provided text field")
  public static void enters_the_text_into_the_provided_text_field(Actor actor, String text) {
    actor.attemptsTo(EnterTextField.enterField(text));
  }

  @And("{actor} validates the word and character counts")
  public static void validates_the_word_and_character_counts(Actor actor) {
    actor.attemptsTo(count());
  }

  @Then("{actor} verifies the three most repeated words along with their respective repetition counts")
  public static void verifies_the_three_most_repeated_words_along_with_their_respective_repetition_counts(Actor actor) {
    actor.attemptsTo(KeywordDensity.density());
  }
}
