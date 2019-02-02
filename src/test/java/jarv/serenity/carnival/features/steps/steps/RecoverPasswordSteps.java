package jarv.serenity.carnival.features.steps.steps;

import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import static net.serenitybdd.rest.SerenityRest.then;
import static net.serenitybdd.rest.SerenityRest.given;

import org.json.simple.JSONObject;

public class RecoverPasswordSteps {

    private String restApiBaseUrl = "https://www.carnival.com/ProfileManagement/api/v1.0";
    private String forgotPaswordService = "/Accounts/Password/Forgot";
    private Actor jorge;
    private String userName;
    JSONObject requestParams;

    @Before
    public void set_the_test(){
        jorge = Actor.named("Jorge, learning serenity rest").whoCan(CallAnApi.at(restApiBaseUrl));
    }

    @Given("^Jorge is not a registered user$")
    public void jorge_is_not_registered() throws Throwable {
        //I am setting this as blank cause the service to retrieve the password will only failed if request parameter is blank!!!
        //When sending any other kind of string response is 202 Accepted, only blanks generate 400 Bad request
        //Test may need to be changed to recover username instead, which has more options to get the error code
        userName = "";
    }

    @Given("^he wants to recover his password$")
    public void jorge_wants_to_recover_the_password() throws Throwable {
        requestParams = new JSONObject();
        requestParams.put("username",userName);
        given().baseUri(restApiBaseUrl).contentType("application/json").body(requestParams.toJSONString()).post(forgotPaswordService);
    }

    @When("^he sends the required information to recover his password$")
    public void he_attemps_to_recover_password() throws Throwable {
        //TODO: Create Object Model for Request Body and send it. Anyway example is way too simple to do that and I am running out of time Julian.
        //when().post(theRestApiBaseUrl); This was sending back a 415 Unsupported Media Type
    }

    @Then("^he should be informed that operation could not be done$")
    public void he_must_see_a_failed_response() throws Throwable {
        then().statusCode(400);
    }
}