package jarv.serenity.carnival.tasks;

import jarv.serenity.carnival.ui.CruiseSearchPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class OpenBrowserOnCruiceSearch implements Task {

    CruiseSearchPage cruiceSearchPage;

    @Step("Open the cruise steps page")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(cruiceSearchPage)
        );
    }
}
