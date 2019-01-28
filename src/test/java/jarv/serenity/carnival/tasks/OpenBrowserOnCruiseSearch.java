package jarv.serenity.carnival.tasks;

import jarv.serenity.carnival.ui.CruiseSearchPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class OpenBrowserOnCruiseSearch implements Task {

    CruiseSearchPage cruiseSearchPage;

    @Step("Open the cruise search page")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(cruiseSearchPage)
        );
    }

    public static OpenBrowserOnCruiseSearch opensSearchPage() {
        return instrumented(OpenBrowserOnCruiseSearch.class);
    }
}
