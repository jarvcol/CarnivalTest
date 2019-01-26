package jarv.serenity.carnival.questions.builder;

import net.serenitybdd.screenplay.Question;
import jarv.serenity.carnival.questions.IsLoginModalOpen;
import jarv.serenity.carnival.questions.IsLoginFailed;

public class LoginQuestions {
    public static Question<Boolean> IsLoginModalOpen() {
        return new IsLoginModalOpen();
    }

    public static Question<Boolean> IsLoginFailed() {
        return new IsLoginFailed();
    }

}