package jarv.serenity.carnival.tasks.dbRelated;

import jarv.serenity.carnival.dataBaseConection.DataBaseDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;
import jarv.serenity.carnival.interactions.dbRelated.SelectDataBase;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Selects implements Task {

    private final DataBaseDriver dbDriver;

    public Selects(DataBaseDriver dbDriver) {
        this.dbDriver = dbDriver;
    }

    @Step("Enters the user #userPassword")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectDataBase.select(dbDriver)
        );
    }

    public static Selects select(DataBaseDriver dbDriver) {
        return instrumented(Selects.class, dbDriver);
    }

}
