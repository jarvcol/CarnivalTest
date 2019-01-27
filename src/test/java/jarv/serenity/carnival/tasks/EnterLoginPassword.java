package jarv.serenity.carnival.tasks;

import jarv.serenity.carnival.ui.LoginModal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterLoginPassword implements Task {

    private final String userPassword;

    protected EnterLoginPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Step("Enters the user #userPassword")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(userPassword)
                        .into(LoginModal.LOGIN_PASSWORD_INPUT)
        );
    }

    public static EnterLoginPassword entersPassword(String userPassword) {
        return instrumented(EnterLoginPassword.class, userPassword);
    }

}

