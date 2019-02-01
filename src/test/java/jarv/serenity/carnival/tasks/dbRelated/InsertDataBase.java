package jarv.serenity.carnival.tasks.dbRelated;

import jarv.serenity.carnival.dataBaseConection.DataBaseDriver;
import jarv.serenity.carnival.model.Users;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.thucydides.core.annotations.Step;

import java.sql.PreparedStatement;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class InsertDataBase implements Interaction {

    private final DataBaseDriver dbDriver;
    private final Users user;

    public InsertDataBase(DataBaseDriver dbDriver, Users user) {
        this.dbDriver = dbDriver;
        this.user = user;
    }

    @Override
    @Step("Inserting from DB")
    public <T extends Actor> void performAs(T actor) {
        try
        {
            PreparedStatement st = dbDriver.getConn().prepareStatement("INSERT INTO users(usercode,username) VALUES(?,?)");
            st.setInt(1,user.getUserCode());
            st.setString(1,user.getUserName());
            st.executeUpdate();
            dbDriver.disconect();
        }
        catch(Exception e)
        {
            dbDriver.disconect();
            System.out.println(e);
        }
    }

    public static Interaction insert(DataBaseDriver dbDriver, Users user) {
        return instrumented(InsertDataBase.class, dbDriver, user);
    }
}
