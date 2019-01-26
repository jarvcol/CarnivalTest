package jarv.serenity.carnival.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import jarv.serenity.carnival.ui.LoginModal;

@Subject("Checks element visibility")
public class IsLoginModalOpen implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return LoginModal.LOGIN_MODAL.resolveFor(actor).isCurrentlyVisible();
    }

    public static IsLoginModalOpen isOpen() {
        return new IsLoginModalOpen();
    }
}
