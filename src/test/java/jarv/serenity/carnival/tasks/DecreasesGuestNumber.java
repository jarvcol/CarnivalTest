package jarv.serenity.carnival.tasks;

import jarv.serenity.carnival.ui.CruiseSearchTravelersAmount;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DecreasesGuestNumber implements Task {

    public DecreasesGuestNumber() {
    }

    @Step("Decrease the cruise travelers")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CruiseSearchTravelersAmount.GUEST_DECREASE_AMOUNT)
        );
    }

    public static DecreasesGuestNumber decreaseTravelers() {
        return instrumented(DecreasesGuestNumber.class);
    }

}
