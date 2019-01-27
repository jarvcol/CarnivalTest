package jarv.serenity.carnival.tasks;

import jarv.serenity.carnival.ui.LoginModal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClicksOnLoginButton implements Task {

    public ClicksOnLoginButton() {
    }

    @Step("Clicks on Login button")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LoginModal.LOGIN_BUTTON)
        );
    }

    public static ClicksOnLoginButton clicksOnLoginButton() {
        return instrumented(ClicksOnLoginButton.class);
    }

}

