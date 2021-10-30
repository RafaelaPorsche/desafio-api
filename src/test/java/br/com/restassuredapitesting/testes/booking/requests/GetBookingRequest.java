package br.com.restassuredapitesting.testes.booking.requests;

import io.qameta.allure.Step;
import io.restassured.response.Response;

import java.util.Date;

import static io.restassured.RestAssured.given;


public class GetBookingRequest {
    @Step("Retorna Ids da Listagem de Reservas")
    public Response bookingReturnIds() {
        return given()
                .when()
                .get("booking");

    }

    @Step("Retorna uma reserva especifica")
    public Response bookingReturnbooking(int val) {
        return given()
                .when()
                .get("booking/" + val);

    }

    @Step("Retorna uma reserva especifica com filtro")
    public Response bookingReturnFiltro(String firstname, String lastname, Date checkin, Date checkout) {
        return given()
                .queryParam(firstname, lastname, checkin, checkout)
                .when()
                .get("booking");

    }
}
