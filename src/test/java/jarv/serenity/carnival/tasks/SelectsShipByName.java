package jarv.serenity.carnival.tasks;

import jarv.serenity.carnival.ui.CruiseSearchShipsOptions;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.ClickOnBy;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectsShipByName implements Task {

    private final String shipsName;

    protected SelectsShipByName(String shipsName) {
        this.shipsName = shipsName;
    }

    @Step("Enters the user #userPassword")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                new ClickOnBy(By.xpath(
                        CruiseSearchShipsOptions.SHIP_FILTER_OPTIONS.getCssOrXPathSelector().toString().
                                replace("","")
                        )
                )
        );
    }

    public static SelectsShipByName entersPassword(String shipsName) {
        return instrumented(SelectsShipByName.class, shipsName);
    }

}
