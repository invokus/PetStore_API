package com.everis.base.stepDefinitions;

import com.everis.base.StoreStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class StoreStepDF {

    @Steps
    StoreStep Store;

    @Given("dado que estoy en la tienda")
    public void dadoQueEstoyEnLaTienda() {
    }



    @Then("valido el codigo de respuesta {int}")
    public void validoElCodigoDeRespuesta(int arg0) {
    }


    @And("hago una solicitud POST con los siguientes datos")
    public void hagoUnaSolicitudPOSTConLosSiguientesDatos() {
    }
    

    @And("inserto el id del producto {string}")
    public void insertoElIdDelProducto(String id) {
        Store.ConsultarStore(id);
    }

    @When("creo una orden")
    public void creoUnaOrden() {
        
    }


    @When("hago una consulta con ID")
    public void hagoUnaConsultaConID() {
    }

    @When("creo una orden con id {string}, petId {string}, cantidad {int}, envio {string}, estado {string}, completo {string}")
    public void creoUnaOrdenConIdPetIdCantidadEnvioEstadoCompleto(String id, String petId, int quantity, String shipDate, String status, String complete) {
        Store.creoUnaOrdenConIdPetIdCantidadEnvioEstadoEstadoString(id, petId, quantity, shipDate, status, complete);
    }
}
