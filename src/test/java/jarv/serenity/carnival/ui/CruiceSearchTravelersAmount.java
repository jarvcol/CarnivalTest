package jarv.serenity.carnival.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CruiceSearchTravelersAmount {
    public static Target GUEST_DECREASE_AMOUNT = Target.the("Guest decrease arrow").
            located(By.cssSelector("a.xft-travelers-group__decrease"));
    public static Target GUEST_INCREASE_AMOUNT = Target.the("Guest increase arrow").
            located(By.cssSelector("a.xft-travelers-group__increase"));
    public static Target GUEST_TRAVELER_COUNTER = Target.the("Guest increase arrow").
            located(By.cssSelector("p.xft-travelers-group__adults"));

}
