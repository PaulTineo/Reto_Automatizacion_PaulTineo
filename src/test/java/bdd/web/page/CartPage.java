package bdd.web.page;

import net.serenitybdd.core.Serenity;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {
    @FindBy(xpath = "//button[text()='Place Order']")
    private WebElement btnPlaceOrder;

    private final String txtFormulario = "//label[text()='%s']/following::input[1]";

    @FindBy(xpath = "//button[text()='Purchase']")
    private WebElement btnPurchase;

    @FindBy(xpath = "//h2[text()='Thank you for your purchase!']")
    private WebElement lblThankYou;

    public void clickBtnPlaceOrder() {
        btnPlaceOrder.click();
        Serenity.takeScreenshot();
    }

    public void clickBtnPurchase() {
        btnPurchase.click();
        Serenity.takeScreenshot();
    }

    public void llenarFormulario(String campo, String valor) {
        buscartxtFormulario(campo).sendKeys(valor);
    }

    public boolean compraexitosa(String msg){
        return lblThankYou.getText().equals(msg);
    }

    public WebElement buscartxtFormulario(String campo) {
        return getDriver().findElement(By.xpath(String.format(txtFormulario, campo)));
    }
}
