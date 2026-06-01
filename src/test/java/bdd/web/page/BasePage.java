package bdd.web.page;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;

import java.time.Duration;


public class BasePage extends PageObject {
    public void abrirPaginaBase() {
        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        getDriver().manage().deleteAllCookies();
        String url = EnvironmentSpecificConfiguration
                .from(Serenity.environmentVariables())
                .getProperty("url");

        getDriver().get(url);
    }
}


