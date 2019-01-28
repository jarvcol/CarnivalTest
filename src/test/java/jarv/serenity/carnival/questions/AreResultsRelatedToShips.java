package jarv.serenity.carnival.questions;

import jarv.serenity.carnival.ui.CruiseSearchResults;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;


@Subject("Checks if Search Results are related with indicated Ship")
public class AreResultsRelatedToShips implements Question<Boolean> {
    private final String shipName;

    public AreResultsRelatedToShips(String shipName) {
        this.shipName = shipName;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return CruiseSearchResults.CRUISE_RESULTS_SHIP_NAME.resolveFor(actor).getText().toLowerCase().trim().contains(shipName.toLowerCase().trim());
    }

    public static AreResultsRelatedToShips areResultsRelated(String shipName) {
        return new AreResultsRelatedToShips(shipName);
    }
}