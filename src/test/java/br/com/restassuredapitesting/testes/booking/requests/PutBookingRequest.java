package br.com.restassuredapitesting.testes.booking.requests;

import br.com.restassuredapitesting.testes.booking.payloads.BookingsPayloads;
import io.qameta.allure.Step;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class PutBookingRequest {

    BookingsPayloads bookingsPayloads = new BookingsPayloads();

    @Step("Atualiza uma Reserva específica com o parâmetro token")
    public Response updateBookingToken(int id, String token) {
        return given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("Cookie", token)
                .when()
                .body(bookingsPayloads.payloadValidBooking().toString())
                .put("booking/" + id);

    }

}
