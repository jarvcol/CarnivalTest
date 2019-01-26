package jarv.serenity.carnival.features.search;

import jarv.serenity.carnival.questions.builder.LoginQuestions;
import jarv.serenity.carnival.tasks.OpenLoginModal;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import jarv.serenity.carnival.tasks.OpenBrowserOnHomePage;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.Matchers.is;

@RunWith(SerenityRunner.class)
public class CarnivalTest {

    Actor jarv = Actor.named("Jorge");

    @Managed(driver = "chrome")
    public WebDriver hisBrowser;

    @Steps
    OpenBrowserOnHomePage openTheApplication;

    @Before
    public void jarvCanBrowseTheWeb() {
        jarv.can(BrowseTheWeb.with(hisBrowser));
    }

    @Test
    public void openning_the_login_modal() {

        givenThat(jarv).wasAbleTo(openTheApplication);

        when(jarv).attemptsTo(OpenLoginModal.openLoginModal());

        then(jarv).should(seeThat(LoginQuestions.IsLoginModalOpen(),is(true)));
    }
}