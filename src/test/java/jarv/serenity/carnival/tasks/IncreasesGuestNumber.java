package jarv.serenity.carnival.tasks;

import jarv.serenity.carnival.ui.CruiseSearchTravelersAmount;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IncreasesGuestNumber implements Task {

    public IncreasesGuestNumber() {
    }

    @Step("Increase the cruise travelers")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CruiseSearchTravelersAmount.GUEST_INCREASE_AMOUNT)
        );
    }

    public static IncreasesGuestNumber increasesTravelers() {
        return instrumented(IncreasesGuestNumber.class);
    }

}