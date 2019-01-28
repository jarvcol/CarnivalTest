package jarv.serenity.carnival.questions;

import jarv.serenity.carnival.ui.CruiseSearchResults;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

@Subject("Checks if Search Results are related with indicated days range")
public class IsResultsBetweenDurationRange implements Question<Boolean> {
    private final String days;

    public IsResultsBetweenDurationRange(String days) {
        this.days = days;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        int dayRange = Integer.parseInt(CruiseSearchResults.CRUISE_RESULTS_DURATION.resolveFor(actor).getText());
        if(!days.equals("10+")){
            int lowerBoundary=Integer.parseInt(days.split("-")[0]) , upperBoundary=Integer.parseInt(days.split("-")[1]);
            if(lowerBoundary <= dayRange && upperBoundary >= dayRange)
                return true;
            else
                return false;
        }else{
            return (dayRange>=10) ? true : false;
        }
    }

    public static IsResultsBetweenDurationRange isResultsBetweenDates(String days) {
        return new IsResultsBetweenDurationRange(days);
    }
}
