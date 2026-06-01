package bdd.web.step;


import bdd.web.page.HomePage;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.annotations.Step;

public class HomePageStep {


    HomePage homePage;

    @Step()
    public void iniciarPagina() {
        homePage.abrirPaginaBase();

    }
    @Step()
    public void agregarProductos(DataTable dataTable) {
        dataTable.asList().forEach(producto -> {
            homePage.seleccionarProducto(producto);
            homePage.seleccionarOpcionNavegacion("Home ");
        });
    }
    @Step()
    public void seleccionarOpcionNavegacion(String opcion) {
        homePage.seleccionarOpcionNavegacion(opcion);
    }
}