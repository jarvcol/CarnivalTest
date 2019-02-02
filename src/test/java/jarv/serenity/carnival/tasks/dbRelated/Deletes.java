package jarv.serenity.carnival.tasks.dbRelated;

import jarv.serenity.carnival.dataBaseConection.DataBaseDriver;
import jarv.serenity.carnival.model.Users;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;
import jarv.serenity.carnival.interactions.dbRelated.DeleteDataBase;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Deletes implements Task {

    private final DataBaseDriver dbDriver;
    private final Users user;

    public Deletes(DataBaseDriver dbDriver, Users user) {
        this.dbDriver = dbDriver;
        this.user = user;
    }

    @Step("Enters the user #userPassword")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                DeleteDataBase.delete(dbDriver,user)
        );
    }

    public static Deletes delete(DataBaseDriver dbDriver, Users user) {
        return instrumented(Deletes.class, dbDriver, user);
    }

}
