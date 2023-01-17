package com.nttdata.stepsdefinitions;

import com.nttdata.screens.ProductScreen;
import com.nttdata.steps.SwagLabSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


public class SwagLabStepDef {
    private WebDriver driver;
    ProductScreen productScreen;
    @Steps
    SwagLabSteps swagLabSteps;

    @Given("que me encuentro en la página de login de Swag Labs")
    public void que_me_encuentro_en_la_página_de_login_de_swag_labs() {

    }
    @When("inicio sesión con las credenciales usuario: {string} y contraseña: {string}")
    public void inicio_sesión_con_las_credenciales_usuario_y_contraseña(String usuario, String password) {
       swagLabSteps.clickRegistrarUsuario(usuario);
       swagLabSteps.clickRegistrarPassword(password);
       swagLabSteps.clickLogin();

    }
    @Then("valido que debería aparecer el título de {string}")
    public void valido_que_debería_aparecer_el_título_de(String expectedTitle) {
        String title = driver.getTitle();
        Assert.assertEquals(expectedTitle, title);

    }
    @And("también valido que al menos exista un item")
    public void también_valido_que_al_menos_exista_un_item() {
        int itemsListSize = productScreen.getItemSize();
        org.junit.jupiter.api.Assertions.assertTrue(itemsListSize > 0, "El tamaño de la lista es: " + itemsListSize);
    }


}
