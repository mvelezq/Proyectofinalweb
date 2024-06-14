package co.com.globallogic.certificacion.demoqa.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.Keys;

public class PressEnter implements Interaction {

    private final Target target;

    public PressEnter(Target target) {
        this.target = target;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        target.resolveFor(actor).sendKeys(Keys.ENTER);
    }

    public static PressEnter on(Target target) {
        return new PressEnter(target);

    }
}
