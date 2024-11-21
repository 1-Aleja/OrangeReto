package orangehrm.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class AddNewRecord {
    public static final Target FIRSTNAME_FIELD = Target.the("pasword field")
            .locatedBy("[name='firstName']");
    public static final Target MIDDLE_NAME_FIELD = Target.the("pasword field")
            .locatedBy("[name='middleName']");
    public static final Target LASTNAME_FIELD = Target.the("pasword field")
            .locatedBy("[name='lastName']");
    public static final Target VACANCY_FIELD = Target.the("pasword field")
            .locatedBy("//div[@class='oxd-select-text-input']");
    public static final Target EMAIL_FIELD = Target.the("pasword field")
            .located(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/input[1]"));
    public static final Target GETCONTACNUMBER_FIELD = Target.the("pasword field")
            .located(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/div[2]/div[1]/div[2]/input[1]"));
    public static final Target FILE_UPLOAD = Target.the("File input field")
            .located(By.xpath("//input[@Type='file']"));
    public static final Target KEYWORDS_FIELD = Target.the("pasword field")
            .located(By.xpath("//input[@placeholder='Enter comma seperated words...']"));
    public static final Target NOTES_FIELD = Target.the("pasword field")
            .located(By.xpath("//textarea[@placeholder='Type here']"));
    public static final Target CONSENT_FIELD = Target.the("pasword field")
            .locatedBy("//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']");
    public static final Target BUTTON_SUBMIT= Target.the("pasword field")
            .locatedBy("//button[@type='submit']");
    public static final Target BUTTON_SHORTLIST= Target.the("pasword field")
            .locatedBy("//button[normalize-space()='Shortlist']");



}
