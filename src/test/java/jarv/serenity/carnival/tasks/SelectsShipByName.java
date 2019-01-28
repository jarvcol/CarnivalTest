package jarv.serenity.carnival.tasks;

import jarv.serenity.carnival.ui.CruiseSearchShipsOptions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectsShipByName implements Task {

    private final String shipName;

    protected SelectsShipByName(String shipName) {
        this.shipName = shipName;
    }

    @Step("Enters the user #userPassword")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CruiseSearchShipsOptions.getShipFilterTarget(shipName))
                );
    }

    public static SelectsShipByName selectShipFromOptions(String shipName) {
        return instrumented(SelectsShipByName.class, shipName);
    }

}
