package com.everis.base;

import com.everis.base.models.Store;
import com.google.gson.JsonObject;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import net.serenitybdd.rest.SerenityRest;

import static net.serenitybdd.rest.SerenityRest.given;

public class StoreStep {

    private String URL_BASE = "https://petstore.swagger.io/v2/store/";

    //Creacion de Store
    public void creoUnaOrdenConIdPetIdCantidadEnvioEstadoEstadoString (String id,
                                                                       String petId,
                                                                       int quantity,
                                                                       String shipDate,
                                                                       String status,
                                                                       String complete){
    SerenityRest.given()
            .contentType("application/json")
            .relaxedHTTPSValidation()
            .body("{\n" +
                    "  \"id\": \""+id+"\",\n" +
                    "  \"petId\": \""+petId+"\",\n" +
                    "  \"quantity\": \""+quantity+"\",\n" +
                    "  \"shipDate\": \""+shipDate+"\",\n" +
                    "  \"status\": \""+status+"\",\n" +
                    "  \"complete\": \""+complete+"\",\n" +
                    "}")
            .log().all()
            .post(URL_BASE)
            .then()
            .log().all()
            ;
    }

    //Consulta de Store
    public void ConsultarStore(String id){
        Store store =
        given()
                .baseUri(URL_BASE)
                .log()
                .all()
                .when()
                .get("order/" + id)
                .as(Store.class)
        ;

        System.out.println("OUT: " + store.getId());

    }
}
