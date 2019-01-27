package jarv.serenity.carnival.tasks;

import jarv.serenity.carnival.ui.CruiseSearchFilterSection;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpensTravelersNumberFilter implements Task {

    public OpensTravelersNumberFilter() {
    }

    @Step("Opens travelers number filter")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CruiseSearchFilterSection.TRAVELERS_AMOUNT_FILTER_SELECTION)
        );
    }

    public static OpensTravelersNumberFilter clicksOnTravelersNumberFilter() {
        return instrumented(OpensTravelersNumberFilter.class);
    }

}
