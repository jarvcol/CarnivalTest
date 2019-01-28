package jarv.serenity.carnival.tasks;

import jarv.serenity.carnival.ui.CarnivalHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenBrowserOnHomePage implements Task {

    CarnivalHomePage carnivalHomePage;

    @Step("Open the the Carnival portal")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(carnivalHomePage)
        );
    }

    public static OpenBrowserOnHomePage opensPortal() {
        return instrumented(OpenBrowserOnHomePage.class);
    }
}
