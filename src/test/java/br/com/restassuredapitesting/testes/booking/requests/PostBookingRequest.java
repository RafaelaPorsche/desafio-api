package br.com.restassuredapitesting.testes.booking.requests;

import br.com.restassuredapitesting.utils.Utils;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.json.JSONObject;

import java.io.File;
import java.util.Date;

import static io.restassured.RestAssured.given;

public class PostBookingRequest {


    @Step("Deletar uma reserva")
    public Response bookingPostBooking() {
        return given()
                .when()
                .post("booking");

    }
}
