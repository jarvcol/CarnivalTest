package jarv.serenity.carnival.tasks.dbRelated;

import jarv.serenity.carnival.dataBaseConection.DataBaseDriver;
import jarv.serenity.carnival.interactions.dbRelated.InsertDataBase;
import jarv.serenity.carnival.model.Users;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Inserts implements Task {

    private final DataBaseDriver dbDriver;
    private final Users user;

    public Inserts(DataBaseDriver dbDriver, Users user) {
        this.dbDriver = dbDriver;
        this.user = user;
    }

    @Step("Enters the user #userPassword")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                InsertDataBase.insert(dbDriver, user)
        );
    }

    public static Inserts insert(DataBaseDriver dbDriver, Users user) {
        return instrumented(Inserts.class, dbDriver, user);
    }

}