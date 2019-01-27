package jarv.serenity.carnival.features.search.search;

import jarv.serenity.carnival.tasks.*;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.*;

@RunWith(SerenityRunner.class)
public class CruiseSearchTest {

    Actor jarv = Actor.named("Jorge");

    @Managed(driver = "chrome")
    public WebDriver hisBrowser;

    @Steps
    OpenBrowserOnCruiceSearch openTheApplication;

    @Before
    public void jarvCanBrowseTheWeb() {
        jarv.can(BrowseTheWeb.with(hisBrowser));
    }

    @Test
    public void cruice_search_by_ship_duration_passengers() {

        givenThat(jarv).wasAbleTo(openTheApplication);

        when(jarv).attemptsTo(OpensShipListFilter.clicksOnShipListFilter());
        when(jarv).attemptsTo(SelectsShipByName.selectShipFromOptions("Carnival Glory "));
        when(jarv).attemptsTo(OpensTravelersNumberFilter.clicksOnTravelersNumberFilter());
        when(jarv).attemptsTo(SetNumberOfTravelers.setsTravelers(5));
    }
}