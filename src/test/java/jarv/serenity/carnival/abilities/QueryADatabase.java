package jarv.serenity.carnival.abilities;

import jarv.serenity.carnival.dataBaseConection.DataBaseDriver;
import net.serenitybdd.screenplay.Ability;
import net.serenitybdd.screenplay.Actor;

public class QueryADatabase implements Ability {
/*
    private final DataBaseDriver dbDriver;

    private QueryADatabase(DataBaseDriver dbDriver) {
        this.dbDriver = dbDriver;
    }

    *//**
     * Ability to Call and api at a specified baseUrl
     *//*
    public static QueryADatabase at(DataBaseDriver dbDriver) {
        return new QueryADatabase(dbDriver);
    }

    *//**
     * Used to access the Actor's ability to CallAnApi from within the Interaction classes, such as GET or PUT
     *//*
    public static CallAnApi as(Actor actor) {
        return actor.abilityTo(CallAnApi.class);
    }

    public String resolve(String resource) {
        return baseURL + resource;
    }

    public Response getLastResponse() {
        return SerenityRest.lastResponse();
    }

    @Override
    public String toString() {
        return "call an API at " + baseURL;
    }*/
}