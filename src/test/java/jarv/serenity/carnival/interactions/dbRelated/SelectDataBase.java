package jarv.serenity.carnival.interactions.dbRelated;

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
    private ResultSet rs=null;

    public SelectDataBase(DataBaseDriver dbDriver) {
        this.dbDriver = dbDriver;
    }

    @Override
    @Step("Selecting from DB")
    public <T extends Actor> void performAs(T actor) {
        try
        {
            Statement st = dbDriver.getConn().createStatement();
            rs = st.executeQuery("SELECT * From users");
            dbDriver.disconect();
        }
        catch(Exception e)
        {
            dbDriver.disconect();
            System.out.println(e);
        }
    }

    public ResultSet getResults(){
        return rs;
    }

    public static Interaction select(DataBaseDriver dbDriver) {
        return instrumented(SelectDataBase.class, dbDriver);
    }

    @Override
    public String toString() {
        return rs.toString();
    }
}