package jarv.serenity.carnival.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CruiceSearchShipsOptions extends PageObject {
    public static Target SHIP_FILTER_OPTIONS = Target.the("Ship filter button option").
            located(By.xpath(".//li/button[@class='cdc-filter-button ng-binding' and @aria-label='shipName']"));
}
