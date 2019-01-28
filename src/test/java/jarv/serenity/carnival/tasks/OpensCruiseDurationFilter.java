package jarv.serenity.carnival.tasks;

import jarv.serenity.carnival.ui.CruiseSearchFilterSection;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpensCruiseDurationFilter implements Task {

    public OpensCruiseDurationFilter() {
    }

    @Step("Opens ship filter list")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CruiseSearchFilterSection.CRUISE_DURATION_FILTER)
        );
    }

    public static OpensCruiseDurationFilter clicksOnCruiseDurationFilter() {
        return instrumented(OpensCruiseDurationFilter.class);
    }

}