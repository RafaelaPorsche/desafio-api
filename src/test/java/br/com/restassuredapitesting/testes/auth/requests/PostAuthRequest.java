package br.com.restassuredapitesting.testes.auth.requests;

import br.com.restassuredapitesting.testes.auth.requests.payloads.AuthPayLoads;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.json.JSONObject;


import static io.restassured.RestAssured.given;

public class PostAuthRequest {

    AuthPayLoads authPayLoads = new AuthPayLoads();

    @Step("Retorna token")
    public Response tokenReturn() {

        return given()
                .header("Content-Type", "application/json")
                .when()
                .body(authPayLoads.jsonAuthLogin().toString())
                .post("auth");
    }

    @Step("Busca token")
    public String getToken() {
        return "token=" + this.tokenReturn()
                .then()
                .statusCode(200)
                .extract()
                .path("token");
    }


}
