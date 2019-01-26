package jarv.serenity.carnival.tasks;

import jarv.serenity.carnival.ui.CarnivalHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import jarv.serenity.carnival.ui.GoogleSearchPage;

public class OpenBrowserOnHomePage implements Task {

    CarnivalHomePage carnivalHomePage;

    @Step("Open the application")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(carnivalHomePage)
        );
    }
}
