package jarv.serenity.carnival.questions;

import jarv.serenity.carnival.ui.CarnivalHomePageHeader;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import jarv.serenity.carnival.ui.LoginModal;

@Subject("Checks if error message is displayed at login modal")
public class IsUserLoggedIn implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return CarnivalHomePageHeader.GREETING_HEADER_MESSAGE.resolveFor(actor).isCurrentlyVisible() &&
                !CarnivalHomePageHeader.SIGN_UP_HEADER_LINK.toString().contains("Create Account");
    }

    public static IsLoginModalOpen isUserLoggedIn() {
        return new IsLoginModalOpen();
    }
}
