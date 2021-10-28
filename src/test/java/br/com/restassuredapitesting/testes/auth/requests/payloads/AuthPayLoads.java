package br.com.restassuredapitesting.testes.auth.requests.payloads;

import org.json.JSONObject;

public class AuthPayLoads {
    public JSONObject jsonAuthLogin(){

        JSONObject payloadLogin = new JSONObject();
        payloadLogin.put("username", "admin");
        payloadLogin.put("password", "password123");

        return payloadLogin;

    }


}
