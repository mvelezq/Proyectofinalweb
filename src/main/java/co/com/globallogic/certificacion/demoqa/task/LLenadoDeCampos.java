package co.com.globallogic.certificacion.demoqa.task;

import co.com.globallogic.certificacion.demoqa.interactions.PressEnter;
import co.com.globallogic.certificacion.demoqa.userinterfaces.FormularioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.ui.Select;

public class LLenadoDeCampos implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Miguel").into(FormularioPage.FIRST_NAME_INPUT),
                Enter.theValue("Velez").into(FormularioPage.LAST_NAME_INPUT),
                Enter.theValue("miguel@gl.com").into(FormularioPage.EMAIL_INPUT),
                Click.on(FormularioPage.GENDER_CHECK),
                Enter.theValue("3000001111").into(FormularioPage.MOBILE_INPUT),
                Click.on(FormularioPage.DATE_OF_BIRTH_INPUT),
                Select.option("July").from(FormularioPage.MONTH_OF_BIRTH_INPUT),
                Select.option("2010").from(FormularioPage.YEAR_OF_BIRTH_INPUT),
                Click.on(FormularioPage.DAY_OF_BIRTH_INPUT),
                Enter.theValue("Maths").into(FormularioPage.SUBJECT_INPUT),
                PressEnter.on(FormularioPage.SUBJECT_INPUT),
                Click.on(FormularioPage.HOBBIE_CHECK),
                Enter.theValue("cl 33 # 33-17").into(FormularioPage.CURRENT_ADDRESS_INPUT),
                Enter.theValue("NCR").into(FormularioPage.STATE_INPUT),
                PressEnter.on(FormularioPage.STATE_INPUT),
                Enter.theValue("Delhi").into(FormularioPage.CITY_INPUT),
                PressEnter.on(FormularioPage.CITY_INPUT),
                Click.on(FormularioPage.SUBMIT_BTN)

        );
    }
    public static LLenadoDeCampos enFormulario(){
        return Tasks.instrumented(LLenadoDeCampos.class);
    }

}
