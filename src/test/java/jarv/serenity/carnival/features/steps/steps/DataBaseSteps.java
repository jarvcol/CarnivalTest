package jarv.serenity.carnival.features.steps.steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jarv.serenity.carnival.abilities.QueryADatabase;
import jarv.serenity.carnival.questions.builder.LoginQuestions;
import jarv.serenity.carnival.tasks.DoesABadLogin;
import jarv.serenity.carnival.tasks.OpenBrowserOnHomePage;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import jarv.serenity.carnival.dataBaseConection.DataBaseDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;

public class DataBaseSteps {

    @Before
    public void set_the_stage(){
        OnStage.setTheStage(new OnlineCast());
        theActorInTheSpotlight().whoCan(QueryADatabase.at(new DataBaseDriver()));
    }

    @Given("^(.*) wants to execute operations on a data base$")
    public void jorge_wants_to_operate_db(String actor) throws Throwable {
        theActorCalled(actor).wasAbleTo(OpenBrowserOnHomePage.opensPortal());
    }

    @When("^he attempts to do an insert$")
    public void he_attempts_to_do_an_insert() {
        theActorInTheSpotlight().attemptsTo(DoesABadLogin.badLoginAttempt("jarv1111@hotmail.com","JJJJJJ"));
    }

    @When("^he attempts to do an update$")
    public void he_attempts_to_do_an_update() {
        theActorInTheSpotlight().attemptsTo(DoesABadLogin.badLoginAttempt("jarv1111@hotmail.com","JJJJJJ"));
    }

    @When("^he attempts to do a delete$")
    public void he_attempts_to_do_a_delete() {
        theActorInTheSpotlight().attemptsTo(DoesABadLogin.badLoginAttempt("jarv1111@hotmail.com","JJJJJJ"));
    }

    @Then("^he must see that login was not successful$")
    public void he_should_something()  {
        //TODO
        /*theActorInTheSpotlight().should(
                seeThat(LoginQuestions.IsLoginFailed(),is(true)),
                seeThat(LoginQuestions.IsLoginModalOpen(),is(true)),
                seeThat(LoginQuestions.IsUserLoggedIn(),is(false))
        );*/
    }

}
