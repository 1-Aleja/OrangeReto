package orangehrm.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import orangehrm.models.LoginDates;
import static orangehrm.userinterfaces.Login.*;
import net.serenitybdd.screenplay.Task;
import orangehrm.userinterfaces.GoToRecruitmentAndAdd;

import java.util.List;


public class WriteAllField implements Task {
    private List<LoginDates> dates;

    public WriteAllField(List<LoginDates> dates) {
        this.dates = dates;
    }
    public static WriteAllField login(List<LoginDates> dates){
            return Tasks.instrumented(WriteAllField.class,dates);
    }
    @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
            Enter.theValue(dates.get(0).getUserNameField()).into(USERNAME_FIELD),
            Enter.theValue(dates.get(0).getPasswordField()).into(PASSWORD_FIELD),
            Click.on(LOGIN_BUTTON),
            WaitUntil.the(GoToRecruitmentAndAdd.RECRUITMENT_MENU_ITEM, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
            Click.on(GoToRecruitmentAndAdd.RECRUITMENT_MENU_ITEM),
            Click.on(GoToRecruitmentAndAdd.BUTTON_ADD)
    );
}
}
