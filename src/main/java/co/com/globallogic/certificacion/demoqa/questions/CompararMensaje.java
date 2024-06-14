package co.com.globallogic.certificacion.demoqa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class CompararMensaje implements Question<Boolean> {

    private String mensaje;
    private Target target;

    public CompararMensaje(String mensaje, Target target){
        this.mensaje=mensaje;
        this.target=target;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        System.out.println("Mensaje de contante "+mensaje);
        System.out.println("Mensaje del target "+ target.resolveFor(actor).getText());
        return target.resolveFor(actor).getText().equals(mensaje);
    }

    public static CompararMensaje conTarget(String mensaje, Target target){
        return new CompararMensaje(mensaje,target);
    }
}