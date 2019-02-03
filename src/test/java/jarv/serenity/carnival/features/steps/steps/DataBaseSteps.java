package jarv.serenity.carnival.features.steps.steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import jarv.serenity.carnival.abilities.QueryADatabase;
import jarv.serenity.carnival.model.Users;
import jarv.serenity.carnival.questions.IsItAnyException;
import jarv.serenity.carnival.tasks.dbRelated.Deletes;
import jarv.serenity.carnival.tasks.dbRelated.Inserts;
import jarv.serenity.carnival.tasks.dbRelated.Updates;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import jarv.serenity.carnival.dataBaseConection.DataBaseDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DataBaseSteps {

    private DataBaseDriver dbDriver;

    @Before
    public void set_the_stage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) wants to execute operations on a data base$")
    public void jorge_wants_to_operate_db(String actor) throws Throwable {
        dbDriver = new DataBaseDriver();
        dbDriver.connect();
        theActorCalled(actor).whoCan(QueryADatabase.at(dbDriver));
    }

    @When("^he attempts to do an insert$")
    public void he_attempts_to_do_an_insert() {
        theActorInTheSpotlight().attemptsTo(Inserts.insert(dbDriver, new Users("Jorge", 1)));
    }

    @When("^he attempts to do an update$")
    public void he_attempts_to_do_an_update() {
        theActorInTheSpotlight().attemptsTo(Updates.update(dbDriver, new Users("Lorena", 1), 1));
    }

    @When("^he attempts to do a delete$")
    public void he_attempts_to_do_a_delete() {
        theActorInTheSpotlight().attemptsTo(Deletes.delete(dbDriver,new Users("Lorena", 1)));
    }

    @Then("^he should do something$")
    public void he_should_something()  {
        //TODO with a real assertion
        theActorInTheSpotlight().should(seeThat(IsItAnyException.thereWasNoExpection()));
    }

}
