package jarv.serenity.carnival.features.steps.steps;

import static net.serenitybdd.rest.SerenityRest.then;
import static net.serenitybdd.rest.SerenityRest.with;
import static net.serenitybdd.rest.SerenityRest.given;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.hamcrest.Matchers.containsString;
import static net.serenitybdd.rest.SerenityRest.then;
import static net.serenitybdd.rest.SerenityRest.when;


public class RecoverUserNameSteps {


    @Given("^Jorge wants to recover his username$")
    public void juan_wants_to_purchase_a_vehicle() throws Throwable {
        given()
                .contentType("application/json");
    }

    @When("^he enters wrong information on recover form$")
    public void he_looks_the_available_vehicles() throws Throwable {
        when().get("https://www.carnival.com/ProfileManagement/Accounts/forgot-username");
    }

    @Then("^he must see that user name recovery failed$")
    public void he_must_see_which_vehicles_are_available() throws Throwable {
        then().statusCode(400)
                .body(containsString("failed"));
    }
}