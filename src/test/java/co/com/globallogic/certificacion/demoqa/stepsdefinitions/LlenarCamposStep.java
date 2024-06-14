package co.com.globallogic.certificacion.demoqa.stepsdefinitions;

import co.com.globallogic.certificacion.demoqa.questions.CompararMensaje;
import co.com.globallogic.certificacion.demoqa.task.LLenadoDeCampos;
import co.com.globallogic.certificacion.demoqa.userinterfaces.ResultadoFormularioPage;
import co.com.globallogic.certificacion.demoqa.utils.Constantes;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import org.openqa.selenium.WebDriver;

public class LlenarCamposStep {

    @Managed
    WebDriver driver;


    @Dado("Ingrese a la pagina de toolqa")
    public void ingreseALaPaginaDeToolqa() {
        OnStage.setTheStage(new Cast());
        OnStage.theActorCalled("Miguel");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(driver));
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://demoqa.com/automation-practice-form"));
        driver.manage().window().maximize();
    }
    @Cuando("llene todos los campos del formulario")
    public void lleneTodosLosCamposDelFormulario() {
        OnStage.theActorInTheSpotlight().attemptsTo(LLenadoDeCampos.enFormulario());
    }
    @Entonces("validar que los campos se guardaron correctamente")
    public void validarQueLosCamposSeGuardaronCorrectamente() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CompararMensaje.conTarget(Constantes.MENSAJE, ResultadoFormularioPage.MESSAGE_TEXT)));
    }
}
