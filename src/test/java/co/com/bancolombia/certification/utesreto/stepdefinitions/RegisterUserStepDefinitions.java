package co.com.bancolombia.certification.utesreto.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegisterUserStepDefinitions {
    @Managed(driver="chrome")
    WebDriver driver;

    @Before
    public void setThestage(){
        OnStage.setTheStage (new OnlineCast());
        OnStage.theActorCalled("Rafael");
    }

    @Given("^usuario en la página de inicio$")
    public void usuarioEnLaPáginaDeInicio() {

       theActorInTheSpotlight().wasAbleTo(Open.url("https://www.utest.com/"));
    }


    @When("^usuario crea una cuenta llenando todos los campos$")
    public void usuarioCreaUnaCuentaLlenandoTodosLosCampos() {

    }

    @Then("^usuario visuzaliza su nombre de usuario$")
    public void usuarioVisuzalizaSuNombreDeUsuario() {

    }

}
