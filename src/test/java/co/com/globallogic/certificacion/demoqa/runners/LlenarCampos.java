package co.com.globallogic.certificacion.demoqa.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(

        features = "src/test/resources/features/fill_fields.feature",
        glue = "co/com/globallogic/certificacion/demoqa/stepsdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)


public class LlenarCampos {
}
