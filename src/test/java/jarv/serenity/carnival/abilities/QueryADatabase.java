package jarv.serenity.carnival.abilities;

import jarv.serenity.carnival.dataBaseConection.DataBaseDriver;
import net.serenitybdd.screenplay.Ability;

public class QueryADatabase implements Ability {

    private final DataBaseDriver dbDriver;

    private QueryADatabase(DataBaseDriver dbDriver) {
        this.dbDriver = dbDriver;
    }

    public static QueryADatabase at(DataBaseDriver dbDriver) {
        return new QueryADatabase(dbDriver);
    }
}