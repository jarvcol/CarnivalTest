package jarv.serenity.carnival.tasks.dbRelated;

import jarv.serenity.carnival.dataBaseConection.DataBaseDriver;
import jarv.serenity.carnival.model.Users;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.thucydides.core.annotations.Step;
import java.sql.ResultSet;
import java.sql.Statement;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectDataBase implements Interaction {

    private final DataBaseDriver dbDriver;
    private final Users user;

    public SelectDataBase(DataBaseDriver dbDriver, Users user) {
        this.dbDriver = dbDriver;
        this.user = user;
    }

    @Override
    @Step("Selecting from DB")
    public <T extends Actor> void performAs(T actor) {
        try
        {
            Statement st = dbDriver.getConn().createStatement();
            ResultSet rs = st.executeQuery("SELECT * From users");
            dbDriver.disconect();
        }
        catch(Exception e)
        {
            dbDriver.disconect();
            System.out.println(e);
        }
    }

    public static Interaction select(DataBaseDriver dbDriver, Users user) {
        return instrumented(SelectDataBase.class, dbDriver, user);
    }
}