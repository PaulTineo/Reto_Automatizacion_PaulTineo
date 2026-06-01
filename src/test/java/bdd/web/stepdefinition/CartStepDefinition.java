package bdd.web.stepdefinition;

import bdd.web.page.HomePage;
import bdd.web.step.CartStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

public class CartStepDefinition {

    @Steps
    CartStep cartStep;
    HomePage homePage;

    @And("visualizo mi carrito de compras")
    public void visualizoMiCarritoDeCompras() {
        homePage.seleccionarOpcionNavegacion("Cart");
        cartStep.clickBtnPlaceOrder();
    }

    @And("lleno mis datos de compra con name {string}, Country {string}, City {string}, Month {string}, Year {string}")
    public void llenoMisDatosDeCompra(String name, String country, String city, String month, String year) {
        cartStep.llenarFormulario("Name:", name);
        cartStep.llenarFormulario("Country:", country);
        cartStep.llenarFormulario("City:", city);
        cartStep.llenarFormulario("Credit card:", System.getProperty("numberCard"));
        cartStep.llenarFormulario("Month:", month);
        cartStep.llenarFormulario("Year:", year);
        cartStep.clickBtnPurchase();
    }

    @Then("valido que la compra se haya realizado correctamente con el mensaje {string}")
    public void validoQueLaCompraSeHayaRealizadoCorrectamente(String msg) {
        Assert.assertTrue(cartStep.compraExitosa(msg));
    }
}
