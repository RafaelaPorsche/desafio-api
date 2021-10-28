package br.com.restassuredapitesting.testes.ping.requests;

import io.qameta.allure.Step;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class GetPingRequest {
    @Step("Retorna api online")
    public Response pingReturnApi() {
        return given()
                .header("Content-Type: application/json", "application/json")
                .when()
                .get("ping");
    }
}
