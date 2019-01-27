package jarv.serenity.carnival.tasks;

import jarv.serenity.carnival.ui.CruiseSearchTravelersAmount;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SetNumberOfTravelers implements Task {

    private final int guestAmount;

    protected SetNumberOfTravelers(int guestAmount) {
        this.guestAmount = guestAmount;
    }

    @Step("Enters the user #userPassword")
    public <T extends Actor> void performAs(T actor) {
        int counter = Integer.parseInt(CruiseSearchTravelersAmount.GUEST_TRAVELER_COUNTER.resolveFor(actor).getText());
        while (counter != guestAmount){
            if (counter > guestAmount){
                actor.attemptsTo(Click.on(CruiseSearchTravelersAmount.GUEST_DECREASE_AMOUNT));
                counter--;
            }
            else{
                actor.attemptsTo(Click.on(CruiseSearchTravelersAmount.GUEST_INCREASE_AMOUNT));
                counter++;
            }
        }
    }

    public static SetNumberOfTravelers setsTravelers(int guestAmount) {
        return instrumented(SetNumberOfTravelers.class, guestAmount);
    }

}
