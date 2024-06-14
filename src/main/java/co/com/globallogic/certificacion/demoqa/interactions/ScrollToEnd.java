package co.com.globallogic.certificacion.demoqa.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.JavascriptExecutor;

public class ScrollToEnd implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
  /*      JavascriptExecutor js = (JavascriptExecutor) actor.getDriver();
        js.executeScript("arguments[0].scrollIntoView(false)", driver.findElement(By.tagName("body")));*/
    }


}