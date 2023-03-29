package com.sofkau.stepdefinitions;


import com.sofkau.setup.ApiSetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import org.apache.log4j.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.junit.jupiter.api.Assertions;

import static com.sofkau.tasks.DoGet.doGet;
import static com.sofkau.utils.StarWarsResources.REQRES_BASE_URL_STAR_WARS;
import static com.sofkau.utils.StarWarsResources.RESOURCE_STAR_WARS;

public class PlanetsStepDefinition extends ApiSetUp {
    public static final Logger LOGGER = Logger.getLogger(PlanetsStepDefinition.class);

    JSONObject responseBody = null;
    JSONParser parser = new JSONParser();
    @Given("el usuario esta en la pagina de busqueda")
    public void elUsuarioEstaEnLaPaginaDeBusqueda() {
        try {
            setUp(REQRES_BASE_URL_STAR_WARS.getValue()+RESOURCE_STAR_WARS.getValue());
            LOGGER.info("INICIA LA AUTOMATIZACION");
            System.out.println(SerenityRest.lastResponse().body().asString());

        } catch (Exception e) {
            LOGGER.info(" fallo la configuracion inicial");
            LOGGER.warn(e.getMessage());
            Assertions.fail();
        }
    }

    @When("cuando el usuario envia solicitud de busqueda  por id {int}")
    public void cuandoElUsuarioEnviaSolicitudDeBusquedaPorId(Integer id) {
   int valor =1;
        actor.attemptsTo(
                doGet().withTheResource(String.valueOf(id))
          );
    }

    @Then("la pagina retornara un estatus con codigo {int}")
    public void laPaginaRetornaraUnEstatusConCodigo(Integer int1) {

    }

    @Then("nombre {string} periodo de rotacion {string} clima {string}")
    public void nombrePeriodoDeRotacionClima(String string, String string2, String string3) {

    }

}
