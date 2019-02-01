package jarv.serenity.carnival.tasks.dbRelated;

import jarv.serenity.carnival.dataBaseConection.DataBaseDriver;
import jarv.serenity.carnival.model.Users;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.thucydides.core.annotations.Step;

import java.sql.PreparedStatement;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class UpdateDataBase implements Interaction {

    private final DataBaseDriver dbDriver;
    private final Users user;

    public UpdateDataBase(DataBaseDriver dbDriver, Users user) {
        this.dbDriver = dbDriver;
        this.user = user;
    }

    @Override
    @Step("Updating from DB")
    public <T extends Actor> void performAs(T actor) {
        try
        {
            PreparedStatement st = dbDriver.getConn().
                    prepareStatement("UPDATE users SET usercode=?, username=? WHERE usercode=?");
            st.setInt(1,user.getUserCode());
            st.setString(2,user.getUserName());
            st.setInt(3,user.getUserCode());
            st.executeUpdate();
            dbDriver.disconect();
        }
        catch(Exception e)
        {
            dbDriver.disconect();
            System.out.println(e);
        }
    }

    public static Interaction update(DataBaseDriver dbDriver, Users user) {
        return instrumented(UpdateDataBase.class, dbDriver, user);
    }
}