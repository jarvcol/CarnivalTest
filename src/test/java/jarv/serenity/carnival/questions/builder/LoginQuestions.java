package jarv.serenity.carnival.questions.builder;

import net.serenitybdd.screenplay.Question;
import jarv.serenity.carnival.questions.IsLoginModalOpen;

public class LoginQuestions {
    public static Question<Boolean> IsLoginModalOpen() {
        return new IsLoginModalOpen();
    }

}