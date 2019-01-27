package jarv.serenity.carnival.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import jarv.serenity.carnival.ui.LoginModal;

@Subject("Checks if error message is displayed at login modal")
public class IsLoginFailed implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return LoginModal.LOGIN_ERROR_MESSAGE.resolveFor(actor).isCurrentlyVisible();
    }

    public static IsLoginModalOpen isShowingError() {
        return new IsLoginModalOpen();
    }
}
