package br.com.restassuredapitesting.testes.ping.testes;

import br.com.restassuredapitesting.base.BaseTest;
import br.com.restassuredapitesting.suites.AllTests;
import br.com.restassuredapitesting.testes.ping.requests.GetPingRequest;
import io.restassured.response.Response;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.Matchers.lessThan;


public class GetPingTest extends BaseTest {

    GetPingRequest getPingRequest = new GetPingRequest();

    @Test
    @Category({AllTests.class})
    public void validaApiOnline() {

        getPingRequest.pingReturnApi()
                .then()
                .statusCode(201)
                .time(lessThan(10L), TimeUnit.SECONDS);
    }

}
