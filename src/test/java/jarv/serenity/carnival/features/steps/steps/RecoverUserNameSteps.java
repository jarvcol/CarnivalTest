package jarv.serenity.carnival.features.steps.steps;

import jarv.serenity.carnival.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.interactions.Post;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class RecoverUserNameSteps {

    private String theRestApiBaseUrl = "https://www.carnival.com/ProfileManagement/api/v1.0";
    private Actor jorge;
    private String userName;

    @Before
    public void set_the_test(){
        jorge = Actor.named("Jorge the supervisor").whoCan(CallAnApi.at(theRestApiBaseUrl));
    }

    @Given("^Jorge is not a registered user$")
    public void jorge_is_not_registered() throws Throwable {
        //TODO: Investigate what sould be done here???
    }

    @Given("^he wants to recover his password$")
    public void jorge_wants_to_recover_the_password() throws Throwable {
        //I am setting this as blank cause the service to retrieve the password will only failed if request parameter is blank!!!
        //When sending any other kind of string response is 202 Accepted, only blanks generate 400 Bad request
        //Test may need to be changed to recover username instead, which has more options to get the error code
        userName = "";
    }

    @When("^he sends the required information to recover his password$")
    public void he_attemps_to_recover_password() throws Throwable {
        //TODO: Create Object Model for Request Body and send it. Anyway example is way too simple to do that and I am running out of time Julian.
        jorge.attemptsTo(
                Post.to("/Accounts/Password/Forgot")
                        .with(request -> request.header("Content-Type", "application/json")
                                .body("{\"username\": \""+userName)
                        )
        );
    }

    @Then("^he should be informed that operation could not be done$")
    public void he_must_see_a_failed_response() throws Throwable {
        jorge.should(
                seeThatResponse( "Recover for password was denied",
                        response -> response.statusCode(400)
                )
        );
    }
}