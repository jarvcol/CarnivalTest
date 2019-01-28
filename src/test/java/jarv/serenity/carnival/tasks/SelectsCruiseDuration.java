package jarv.serenity.carnival.tasks;

import jarv.serenity.carnival.ui.CruiseDurationOptions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectsCruiseDuration implements Task {
    private final String duration;

    protected SelectsCruiseDuration(String duration) {
        this.duration = duration;
    }

    @Step("Enters the user #userPassword")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CruiseDurationOptions.getCruiseDurationFilterTarget(duration))
        );
    }

    public static SelectsCruiseDuration selectsCruiseDuration(String duration) {
        return instrumented(SelectsCruiseDuration.class, duration);
    }

}
