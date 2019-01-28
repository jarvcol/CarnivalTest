package jarv.serenity.carnival.features.steps.steps;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jarv.serenity.carnival.questions.builder.SearchQuestions;
import jarv.serenity.carnival.tasks.*;
import jarv.serenity.carnival.tasks.OpenBrowserOnCruiseSearch;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class SearchSteps {

    @Before
    public void set_the_stage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) wants to make a dream cruise reserve$")
    public void jorge_wants_to_login_at_carnival_portal(String actor) throws Throwable {
        theActorCalled(actor).wasAbleTo(OpenBrowserOnCruiseSearch.opensSearchPage());
    }

    @When("^he sets filter ship \"([^\"]*)\" and duration \"([^\"]*)\"$")
    public void he_sets_shipName_and_duration(String shipName, String duration) {
        theActorInTheSpotlight().attemptsTo(
                OpensCruiseDurationFilter.clicksOnCruiseDurationFilter(),
                SelectsCruiseDuration.selectsCruiseDuration(duration),
                OpensShipListFilter.clicksOnShipListFilter(),
                SelectsShipByName.selectShipFromOptions(shipName+" ")
                );
    }

    @When("^he sets the number of (.*)$")
    public void he_sets_passenger_amount(String passengerAmount) {
        theActorInTheSpotlight().attemptsTo(
                OpensTravelersNumberFilter.clicksOnTravelersNumberFilter(),
                SetNumberOfTravelers.setsTravelers(Integer.parseInt(passengerAmount))
        );
    }

    @Then("^he must see that first results fits the filter input \"([^\"]*)\" and \"([^\"]*)\"$")
    public void he_should_see_the_first_result_according(String shipName, String duration)  {
        theActorInTheSpotlight().should(
                seeThat(SearchQuestions.IsResultsBetweenDurationRange(duration),is(true)),
                seeThat(SearchQuestions.AreResultsRelatedToShips(shipName+" "),is(true))
        );
    }

}
