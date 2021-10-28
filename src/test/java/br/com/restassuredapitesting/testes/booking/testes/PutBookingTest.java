package br.com.restassuredapitesting.testes.booking.testes;

import br.com.restassuredapitesting.base.BaseTest;
import br.com.restassuredapitesting.suites.AllTests;
import br.com.restassuredapitesting.testes.auth.requests.PostAuthRequest;
import br.com.restassuredapitesting.testes.auth.tests.PostAuthTest;
import br.com.restassuredapitesting.testes.booking.requests.GetBookingRequest;
import br.com.restassuredapitesting.testes.booking.requests.PutBookingRequest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.hamcrest.Matchers.greaterThan;

public class PutBookingTest extends BaseTest {
    PutBookingRequest putBookingRequest = new PutBookingRequest();
    GetBookingRequest getBookingRequest = new GetBookingRequest();
    PostAuthRequest postAuthRequest = new PostAuthRequest();

    @Test
    @Category(AllTests.class)
    public void validarAlteracaoDeUmaReservaUtilizandoToken(){
        int primeiroId = getBookingRequest.bookingReturnIds()
                .then()
                .statusCode(200)
                .extract()
                .path("[0].bookingid");

        putBookingRequest.updateBookingToken(primeiroId,postAuthRequest.getToken() )
                .then()
                .statusCode(200)
                .body("size()", greaterThan(0));
    }



}
