package jarv.serenity.carnival.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CruiceSearchFilterSection {
    public static Target SHIPS_FILTER_SELECTION = Target.the("Ship filter").located(By.id("sfn-nav-ships"));
    public static Target TRAVELERS_AMOUNT_FILTER_SELECTION = Target.the("Number of travelers filter").located(By.id("sfn-nav-travelers"));
}