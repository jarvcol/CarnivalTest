package jarv.serenity.carnival.questions.builder;

import net.serenitybdd.screenplay.Question;
import jarv.serenity.carnival.questions.AreResultsRelatedToShips;
import jarv.serenity.carnival.questions.IsResultsBetweenDurationRange;

public class SearchQuestions {
    public static Question<Boolean> IsResultsBetweenDurationRange(String days) {
        return new IsResultsBetweenDurationRange(days);
    }

    public static Question<Boolean> AreResultsRelatedToShips(String shipName) {
        return new AreResultsRelatedToShips(shipName);
    }
}