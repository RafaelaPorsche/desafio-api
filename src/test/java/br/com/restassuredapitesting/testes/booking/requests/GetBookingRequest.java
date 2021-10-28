package br.com.restassuredapitesting.testes.booking.requests;

import io.qameta.allure.Step;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;


public class GetBookingRequest {
    @Step("Retorna Ids da Listagem de Reservas")
    public Response bookingReturnIds() {
        return given()
                .when()
                .get("booking");

    }
}
