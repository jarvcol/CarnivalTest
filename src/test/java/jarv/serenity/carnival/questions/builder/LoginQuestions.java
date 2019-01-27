package jarv.serenity.carnival.questions.builder;

import net.serenitybdd.screenplay.Question;
import jarv.serenity.carnival.questions.IsLoginModalOpen;
import jarv.serenity.carnival.questions.IsLoginFailed;
import jarv.serenity.carnival.questions.IsUserLoggedIn;

public class LoginQuestions {
    public static Question<Boolean> IsLoginModalOpen() {
        return new IsLoginModalOpen();
    }

    public static Question<Boolean> IsLoginFailed() {
        return new IsLoginFailed();
    }

    public static Question<Boolean> IsUserLoggedIn() {
        return new IsUserLoggedIn();
    }

}