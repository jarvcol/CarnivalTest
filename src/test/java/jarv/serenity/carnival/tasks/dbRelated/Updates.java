package jarv.serenity.carnival.tasks.dbRelated;

import jarv.serenity.carnival.dataBaseConection.DataBaseDriver;
import jarv.serenity.carnival.model.Users;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;
import jarv.serenity.carnival.interactions.dbRelated.UpdateDataBase;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Updates implements Task {

    private final DataBaseDriver dbDriver;
    private final Users user;
    private int userKey;

    public Updates(DataBaseDriver dbDriver, Users user, int userKey) {
        this.dbDriver = dbDriver;
        this.user = user;
        this.userKey = userKey;
    }

    @Step("Enters the user #userPassword")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                UpdateDataBase.update(dbDriver, user, userKey)
        );
    }

    public static Updates update(DataBaseDriver dbDriver, Users user, int userKey) {
        return instrumented(Updates.class, dbDriver, user, userKey);
    }

}