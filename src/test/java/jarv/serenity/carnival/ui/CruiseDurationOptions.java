package jarv.serenity.carnival.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CruiseDurationOptions extends PageObject {
    private static String SHIP_DURATION_FILTER_OPTIONS_LOCATOR = "div[data-tealium='cdc-filter-duration'] button[aria-label='Days']";

    public static Target getCruiseDurationFilterTarget (String duration) {
        switch (duration){
            case "2-5":
                return Target.the("Ship filter button option").
                        located(By.cssSelector(SHIP_DURATION_FILTER_OPTIONS_LOCATOR.replace("Days","2 - 5 Days ")));
            case "6-9":
                return Target.the("Ship filter button option").
                        located(By.cssSelector(SHIP_DURATION_FILTER_OPTIONS_LOCATOR.replace("Days","6 - 9 Days ")));
            case "10+":
                return Target.the("Ship filter button option").
                        located(By.cssSelector(SHIP_DURATION_FILTER_OPTIONS_LOCATOR.replace("Days","10+ Days ")));
                default:
                    return null;
        }
    }
}