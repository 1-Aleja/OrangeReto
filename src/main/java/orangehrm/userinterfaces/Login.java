package orangehrm.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Login {
    public static final Target USERNAME_FIELD = Target.the("username field")
            .locatedBy("[name='username']");
    public static final Target PASSWORD_FIELD = Target.the("pasword field")
            .locatedBy("[name='password']");
    public static final Target LOGIN_BUTTON = Target.the("login button")
            .locatedBy(".orangehrm-login-button");

}


