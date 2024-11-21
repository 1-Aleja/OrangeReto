package orangehrm.stepdefinitions;

import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import orangehrm.models.CandidateDates;
import orangehrm.models.LoginDates;
import orangehrm.tasks.AddNewRecord;
import orangehrm.tasks.WriteAllField;
import orangehrm.models.GenericTransformer;

import java.util.List;
import java.util.Map;

import static orangehrm.utils.Constants.URL;

public class LoginUserStepDefinitions {
    private GenericTransformer genericTransformer = new GenericTransformer();

    @DataTableType
    public LoginDates loginDatesTransformer(Map<String, String> row) {
        return genericTransformer.transform(row, LoginDates.class);
    }

    @DataTableType
    public CandidateDates candidateDatesTransformer(Map<String, String> row) {
        return genericTransformer.transform(row, CandidateDates.class);
    }

    @Given("the user is on the login page")
    public void userInTheHomePage() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Open.url(URL));

    }

    @Given("the user logs in with valid credentials")
    public void theUserLogsInWithValidCredentials(List<LoginDates> dates) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(WriteAllField.login(dates));
    }

    @When("the user fills in all the required fields in Recruitment")
    public void theUserFillsInAllTheRequiredFieldsInRecruitment(List<CandidateDates> dates) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(AddNewRecord.fillOutForm(dates));
    }

    @Then("the user checks the hired status")
    public void theUserChecksTheHiredStatus() {

    }


}
