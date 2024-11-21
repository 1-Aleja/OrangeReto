package orangehrm.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class GoToRecruitmentAndAdd {
    public static final Target RECRUITMENT_MENU_ITEM = Target.the("Recruitment menu item")
            .locatedBy("//span[normalize-space()='Recruitment']");
    public static final Target BUTTON_ADD = Target.the("Recruitment menu item")
            .locatedBy("//i[@class='oxd-icon bi-plus oxd-button-icon']");

}
