package br.com.restassuredapitesting.testes.booking.requests;

import io.qameta.allure.Step;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class DeleteBookingRequest {

    @Step("Deletar uma reserva")
    public Response bookingDeleteBooking(int val) {
        return given()
                .when()
                .delete("booking/" + val);

    }
}
