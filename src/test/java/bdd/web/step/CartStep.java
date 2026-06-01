package bdd.web.step;

import bdd.web.page.CartPage;
import net.serenitybdd.annotations.Step;

public class CartStep {

    CartPage cartPage;

    @Step
    public void clickBtnPlaceOrder() {
        cartPage.clickBtnPlaceOrder();
    }

    @Step
    public void llenarFormulario(String campo, String valor) {
        cartPage.llenarFormulario(campo, valor);
    }

    @Step
    public void clickBtnPurchase() {
        cartPage.clickBtnPurchase();
    }

    @Step
    public boolean compraExitosa(String msg) {
       return cartPage.compraexitosa(msg);
    }
}
