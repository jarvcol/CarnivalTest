package jarv.serenity.carnival.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CarnivalHomePageHeader {
    public static Target GREETING_HEADER_MESSAGE = Target.the("Greeting message").located(By.cssSelector("span#greeting"));
    public static Target SIGN_UP_HEADER_LINK = Target.the("Greeting message").located(By.cssSelector("a#join"));
    public static Target LOGIN_HEADER_LINK = Target.the("Home page login link").located(By.id("ccl_header_expand-login-link"));
}
