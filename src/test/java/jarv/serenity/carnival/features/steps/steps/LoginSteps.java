package jarv.serenity.carnival.features.steps.steps;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jarv.serenity.carnival.questions.builder.LoginQuestions;
import jarv.serenity.carnival.tasks.DoesABadLogin;
import jarv.serenity.carnival.tasks.OpenBrowserOnHomePage;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class LoginSteps {

    @Before
    public void set_the_stage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) wants to login at carnival portal$")
    public void jorge_wants_to_login_at_carnival_portal(String actor) throws Throwable {
        theActorCalled(actor).wasAbleTo(OpenBrowserOnHomePage.opensPortal());
    }

    @When("^he attempts an incorrect login$")
    public void he_attempts_invalid_login() {
        theActorInTheSpotlight().attemptsTo(DoesABadLogin.badLoginAttempt("jarv1111@hotmail.com","JJJJJJ"));
    }

    @Then("^he must see that login was not successful$")
    public void he_should_see_that_login_was_not_succesful()  {
        theActorInTheSpotlight().should(
                seeThat(LoginQuestions.IsLoginFailed(),is(true)),
                seeThat(LoginQuestions.IsLoginModalOpen(),is(true)),
                seeThat(LoginQuestions.IsUserLoggedIn(),is(false))
        );
    }

}