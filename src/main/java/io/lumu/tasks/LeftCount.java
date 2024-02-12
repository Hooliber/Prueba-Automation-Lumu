package io.lumu.tasks;

import static io.lumu.ui.PrincipalPage.TOP_COUNTER;

import java.util.List;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.questions.Text;

public class LeftCount implements Task {

  public static LeftCount count() {
    return Tasks.instrumented(LeftCount.class);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {

    List<String> topCounter = List.of(Text.of(TOP_COUNTER).answeredBy(actor).split(" "));
    if (topCounter.size() == 2) {
      Serenity.recordReportData()
              .withTitle(topCounter.get(1))
              .andContents(topCounter.get(0));
    }

    if (topCounter.size() == 4) {
      Serenity.recordReportData()
              .withTitle(topCounter.get(3))
              .andContents(topCounter.get(2));
    }

  }
}
