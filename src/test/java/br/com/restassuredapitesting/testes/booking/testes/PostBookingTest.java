package br.com.restassuredapitesting.testes.booking.testes;

import br.com.restassuredapitesting.base.BaseTest;
import br.com.restassuredapitesting.runners.AcceptanceTest;
import br.com.restassuredapitesting.suites.AllTests;
import br.com.restassuredapitesting.testes.booking.requests.DeleteBookingRequest;
import br.com.restassuredapitesting.testes.booking.requests.PostBookingRequest;
import br.com.restassuredapitesting.utils.Utils;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.io.File;
import java.util.Date;

import static org.hamcrest.Matchers.greaterThan;

@Feature("Feature - Criar Reserva")
public class PostBookingTest extends BaseTest {

    PostBookingRequest postBookingRequest = new PostBookingRequest();

    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Category({AllTests.class, AcceptanceTest.class})
    @DisplayName("Valida criação de uma reserva")
    public void validaCriacaoReserva() {
        postBookingRequest.bookingPostBooking()
                .then()
                .statusCode(200)
                .body("size()", greaterThan(0));


    }
}
