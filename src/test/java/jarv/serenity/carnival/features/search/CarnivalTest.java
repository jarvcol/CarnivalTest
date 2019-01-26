package jarv.serenity.carnival.features.search;

import jarv.serenity.carnival.questions.builder.LoginQuestions;
import jarv.serenity.carnival.tasks.DoesABadLogin;
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
    public void invalid_login_attempt() {

        givenThat(jarv).wasAbleTo(openTheApplication);

        when(jarv).attemptsTo(DoesABadLogin.badLoginAttempt("jarv1111@hotmail.com","JJJJJJ"));

        then(jarv).should(seeThat(LoginQuestions.IsLoginFailed(),is(true)));

        then(jarv).should(seeThat(LoginQuestions.IsLoginModalOpen(),is(true)));

        then(jarv).should(seeThat(LoginQuestions.IsUserLoggedIn(),is(false)));
    }
}