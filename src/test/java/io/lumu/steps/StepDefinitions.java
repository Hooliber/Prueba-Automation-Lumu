package io.lumu.steps;

import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.lumu.tasks.NavigateTheBrowser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class StepDefinitions {

  @ParameterType(".*")
  public static Actor actor(String actorName) {
    return OnStage.theActorCalled(actorName);
  }

  @Before
  public static void setTheStage() {
    OnStage.setTheStage(new OnlineCast());
  }

  @Given("{actor} opens the Word Counter application in a browser")
  public static void opens_the_word_counter_application_in_a_browser(Actor actor) {
    actor.wasAbleTo(NavigateTheBrowser.navigateBrowser());
  }

}
