package jarv.serenity.carnival.questions.builder;

import net.serenitybdd.screenplay.Question;
import jarv.serenity.carnival.questions.IsItAnyException;

public class DBQuestions {
    public static Question<Boolean> IsItAnyException() {
        return new IsItAnyException();
    }
}
