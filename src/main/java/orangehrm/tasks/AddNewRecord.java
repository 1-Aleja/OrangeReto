package orangehrm.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import orangehrm.models.CandidateDates;
import static orangehrm.userinterfaces.AddNewRecord.*;
import orangehrm.userinterfaces.GoToRecruitmentAndAdd;
import org.openqa.selenium.Keys;

import java.nio.file.Path;
import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;


public class AddNewRecord implements Task {
    private final List<CandidateDates> dates;

    public AddNewRecord(List<CandidateDates> dates) {
        this.dates = dates;
    }
    Path fileToUpload = Path.of("src/test/resources/fileOrange/OrangetestCV.pdf");
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(GoToRecruitmentAndAdd.RECRUITMENT_MENU_ITEM, isClickable()).forNoMoreThan(10).seconds(),
                Enter.theValue(dates.get(0).getFirstName()).into(FIRSTNAME_FIELD),
                Enter.theValue(dates.get(0).getMiddleName()).into(MIDDLE_NAME_FIELD),
                Enter.theValue(dates.get(0).getLastName()).into(LASTNAME_FIELD),
                Click.on(VACANCY_FIELD),
                Hit.the(Keys.ARROW_DOWN).into(VACANCY_FIELD),
                Hit.the(Keys.ENTER).into(VACANCY_FIELD),
                Enter.theValue(dates.get(0).getEmail()).into(EMAIL_FIELD),
                Enter.theValue(dates.get(0).getContactNumber()).into(GETCONTACNUMBER_FIELD),
                Upload.theFile(fileToUpload).to(FILE_UPLOAD),
                Enter.theValue(dates.get(0).getKeywords()).into(KEYWORDS_FIELD),
                Enter.theValue(dates.get(0).getNotes()).into(NOTES_FIELD),
                Click.on(CONSENT_FIELD),
                Click.on(BUTTON_SUBMIT),
                WaitUntil.the(BUTTON_SHORTLIST, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(BUTTON_SHORTLIST),
                Click.on(BUTTON_SUBMIT)
        );
    }
    public static AddNewRecord fillOutForm(List<CandidateDates> dates) {
        return Tasks.instrumented(AddNewRecord.class,dates);
    }
    
}
