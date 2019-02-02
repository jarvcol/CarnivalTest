package jarv.serenity.carnival.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

@Subject("Dummy Question that says that there was no exception")
public class IsItAnyException implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return true;
    }

    public static IsItAnyException thereWasNoExpection() {
        return new IsItAnyException();
    }
}
