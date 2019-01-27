package jarv.serenity.carnival.tasks;

import jarv.serenity.carnival.ui.CarnivalHomePageHeader;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.ENTER;

public class OpenLoginModal implements Task {

    public OpenLoginModal() { }

    @Step("Opens the login modal")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CarnivalHomePageHeader.LOGIN_HEADER_LINK)
        );
    }

    public static OpenLoginModal openLoginModal() {
        return instrumented(OpenLoginModal.class);
    }

}