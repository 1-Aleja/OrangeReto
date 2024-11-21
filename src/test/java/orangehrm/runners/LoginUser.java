package orangehrm.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/user_login.feature",
glue = "orangehrm.stepdefinitions",
tags="@scenario1",
snippets = CucumberOptions.SnippetType.CAMELCASE)
public class LoginUser {
}
