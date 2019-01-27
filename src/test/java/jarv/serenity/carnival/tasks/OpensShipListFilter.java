package jarv.serenity.carnival.tasks;

import jarv.serenity.carnival.ui.CruiseSearchFilterSection;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpensShipListFilter implements Task {

    public OpensShipListFilter() {
    }

    @Step("Opens ship filter list")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CruiseSearchFilterSection.SHIPS_FILTER_SELECTION)
        );
    }

    public static OpensShipListFilter clicksOnShipListFilter() {
        return instrumented(OpensShipListFilter.class);
    }

}