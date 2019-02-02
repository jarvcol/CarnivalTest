package jarv.serenity.carnival.interactions.dbRelated;

import jarv.serenity.carnival.dataBaseConection.DataBaseDriver;
import jarv.serenity.carnival.model.Users;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.thucydides.core.annotations.Step;

import java.sql.PreparedStatement;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DeleteDataBase implements Interaction {

    private final DataBaseDriver dbDriver;
    private final Users user;

    public DeleteDataBase(DataBaseDriver dbDriver, Users user) {
        this.dbDriver = dbDriver;
        this.user = user;
    }

    @Override
    @Step("Deleting from DB")
    public <T extends Actor> void performAs(T actor) {
        try
        {
            PreparedStatement st = dbDriver.getConn().prepareStatement("DELETE FROM users WHERE usercode = ?");
            st.setInt(1,user.getUserCode());
            st.executeUpdate();
            dbDriver.disconect();
        }
        catch(Exception e)
        {
            dbDriver.disconect();
            System.out.println(e);
        }
    }

    public static Interaction delete(DataBaseDriver dbDriver, Users user) {
        return instrumented(DeleteDataBase.class, dbDriver, user);
    }
}

