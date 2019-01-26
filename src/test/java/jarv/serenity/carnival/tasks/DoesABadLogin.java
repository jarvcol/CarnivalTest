package jarv.serenity.carnival.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoesABadLogin implements Task {

    private final String userName;
    private final String userPassword;

    protected DoesABadLogin(String userName, String userPassword) {
        this.userName = userName;
        this.userPassword = userPassword;
    }

    @Step("Enters the user #userName")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                OpenLoginModal.openLoginModal(),
                EnterLoginUser.entersUserName(userName),
                EnterLoginPassword.entersPassword(userPassword),
                ClicksOnLoginButton.clicksOnLoginButton()
        );
    }

    public static DoesABadLogin badLoginAttempt(String userName, String userPassword) {
        return instrumented(DoesABadLogin.class, userName, userPassword);
    }

}

