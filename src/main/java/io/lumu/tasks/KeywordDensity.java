package io.lumu.tasks;

import static io.lumu.ui.PrincipalPage.KEYWORD_DENSITY;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.questions.Text;

public class KeywordDensity implements Task {

  public static KeywordDensity density() {
    return Tasks.instrumented(KeywordDensity.class);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {

    for (int i = 1; i < 4; i++) {
      String keywordDensity = Text.of(KEYWORD_DENSITY.of(String.valueOf(i))).answeredBy(actor);

      Serenity.recordReportData()
              .withTitle(String.valueOf(i))
              .andContents(keywordDensity);
    }
  }
}
