package bdd.runner;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = {"pretty"},
        features = {"src/test/resources/features/web"},
        stepNotifications = true,
        glue = {"bdd.web.stepdefinition"}
)

public class RunnerWebTest {

}
