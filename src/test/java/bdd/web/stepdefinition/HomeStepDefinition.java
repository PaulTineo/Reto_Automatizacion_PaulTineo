package bdd.web.stepdefinition;


import bdd.web.step.HomePageStep;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;


public class HomeStepDefinition {

    @Steps
    HomePageStep homePageStep;

    @Given("ingreso a la pagina web DemoBlaze")
    public void ingresoALaPaginaWebDemoBlaze() {
        homePageStep.iniciarPagina();
    }

    @When("selecciono los productos al carrito:")
    public void seleccionoLosProductosAlCarrito(DataTable dataTable) {
        homePageStep.agregarProductos(dataTable);
    }

    @And("selecciono el producto al carrito")
    public void seleccionoElProductoAlCarrito() {
        homePageStep.seleccionarOpcionNavegacion("Cart");
    }
}
