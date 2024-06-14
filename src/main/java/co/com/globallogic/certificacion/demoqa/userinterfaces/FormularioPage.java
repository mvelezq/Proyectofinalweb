package co.com.globallogic.certificacion.demoqa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormularioPage {

    public static final Target FIRST_NAME_INPUT = Target.the("firstname").located(By.id("firstName"));
    public static final Target LAST_NAME_INPUT = Target.the("lastName").located(By.id("lastName"));
    public static final Target EMAIL_INPUT = Target.the("userEmail").located(By.id("userEmail"));
    public static final Target GENDER_CHECK = Target.the("gender").located(By.xpath("//label[contains(text(),'Male')]"));
    public static final Target MOBILE_INPUT = Target.the("mobile").located(By.id("userNumber"));
    public static final Target DATE_OF_BIRTH_INPUT = Target.the("birth").located(By.id("dateOfBirthInput"));
    public static final Target MONTH_OF_BIRTH_INPUT = Target.the("month").located(By.xpath("//select[@class='react-datepicker__month-select']"));
    public static final Target YEAR_OF_BIRTH_INPUT = Target.the("year").located(By.xpath("//select[@class='react-datepicker__year-select']"));
    public static final Target DAY_OF_BIRTH_INPUT = Target.the("day").located(By.xpath("//div[@class=\"react-datepicker__week\"]/div[contains(text(),'24')]"));
    public static final Target SUBJECT_INPUT = Target.the("subject").located(By.id("subjectsInput"));
    public static final Target HOBBIE_CHECK = Target.the("hobbie").located(By.xpath("//label[contains(text(),'Music')]"));
    public static final Target CURRENT_ADDRESS_INPUT = Target.the("address").located(By.id("currentAddress"));
    public static final Target STATE_INPUT = Target.the("state").located(By.id("react-select-3-input"));
    public static final Target CITY_INPUT = Target.the("city").located(By.id("react-select-4-input"));
    public static final Target SUBMIT_BTN = Target.the("submit").located(By.id("submit"));

}
