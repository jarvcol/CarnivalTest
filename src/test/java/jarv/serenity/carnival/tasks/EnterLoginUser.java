package jarv.serenity.carnival.tasks;

import jarv.serenity.carnival.ui.LoginModal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterLoginUser implements Task {

    private final String userName;

    protected EnterLoginUser(String userName) {
        this.userName = userName;
    }

    @Step("Enters the user #userName")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(userName)
                        .into(LoginModal.LOGIN_USR_NAME_INPUT)
        );
    }

    public static EnterLoginUser entersUserName(String userName) {
        return instrumented(EnterLoginUser.class, userName);
    }

}

