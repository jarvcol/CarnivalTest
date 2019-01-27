package jarv.serenity.carnival.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CruiseSearchResults {
    public static Target CRUISE_RESULTS_LIST_OPTIONS = Target.the("Cruise Results List").
            located(By.cssSelector("article.vrg-result-item.ng-scope.vrg-result-item--result.vrg-result-item--small"));
    public static Target CRUISE_RESULTS_SHIP_NAME = Target.the("Cruise Results List").
            located(By.xpath(".//article//span[@class='cgc-cruise-glance__secondary-text ng-binding']"));
    public static Target CRUISE_RESULTS_DURATION = Target.the("Cruise Results List").
            located(By.xpath(".//article//span[@class='cgc-cruise-glance__days ng-binding']"));
}
