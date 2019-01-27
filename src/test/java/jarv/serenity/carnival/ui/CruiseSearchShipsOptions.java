package jarv.serenity.carnival.ui;

import jarv.serenity.carnival.tasks.SelectsShipByName;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CruiseSearchShipsOptions extends PageObject {
    private static String SHIP_FILTER_OPTIONS_LOCATOR = ".//li/button[@class='cdc-filter-button ng-binding' and @aria-label='shipName']";

    public static Target getShipFilterTarget (String shipName) {
        return Target.the("Ship filter button option").
                located(By.xpath(SHIP_FILTER_OPTIONS_LOCATOR.replace("shipName",shipName)));
    }
}
