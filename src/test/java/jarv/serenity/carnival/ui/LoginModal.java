package jarv.serenity.carnival.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.questions.CurrentVisibility;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginModal extends PageObject {
    public static Target LOGIN_USR_NAME_INPUT = Target.the("Login Modal Username Input").located(By.id("username"));
    public static Target LOGIN_PASSWORD_INPUT = Target.the("Login Modal Password Input").located(By.id("password"));
    public static Target LOGIN_BUTTON = Target.the("Log in Modal Log in button").located(By.id("ccl_header_expand-login-link"));
    public static Target LOGIN_ERROR_MESSAFGE = Target.the("Log in Modal Error Messages").located(By.cssSelector("ul.errf-list li"));
    public static Target LOGIN_MODAL = Target.the("Log in Modal Box").located(By.cssSelector("div.lr-view.lr-login"));
}
