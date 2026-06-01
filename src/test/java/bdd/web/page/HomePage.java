package bdd.web.page;


import net.serenitybdd.core.Serenity;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage {

    private final String btnProduct = "//a[text()='%s']";

    @FindBy(xpath = "//a[text()='Add to cart']")
    private WebElement btnAddToCart;

    public void seleccionarProducto(String producto) {
        buscarProducto(producto).click();
        btnAddToCart.click();
        Serenity.takeScreenshot();
        try {
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
            wait.until(ExpectedConditions.alertIsPresent()).accept();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void seleccionarOpcionNavegacion(String opcion) {
        buscarOpcionNavegacion(opcion).click();
    }

    private WebElement buscarProducto(String producto) {
        return getDriver().findElement(By.xpath(String.format(btnProduct, producto)));
    }

    private WebElement buscarOpcionNavegacion(String opcion) {
        return getDriver().findElement(By.xpath(String.format(btnProduct, opcion)));
    }
}
