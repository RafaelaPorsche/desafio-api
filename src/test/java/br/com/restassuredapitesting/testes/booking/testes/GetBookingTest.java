package br.com.restassuredapitesting.testes.booking.testes;

import br.com.restassuredapitesting.base.BaseTest;
import br.com.restassuredapitesting.suites.AcceptanceTests;
import br.com.restassuredapitesting.suites.AllTests;

import br.com.restassuredapitesting.suites.ContractTests;
import br.com.restassuredapitesting.testes.booking.requests.GetBookingRequest;
import br.com.restassuredapitesting.utils.Utils;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.io.File;
import java.time.LocalDate;
import java.util.Date;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static org.hamcrest.Matchers.greaterThan;


@Feature("Feature - Retorno de Reservas")
public class GetBookingTest extends BaseTest {

    GetBookingRequest getBookingRequest = new GetBookingRequest();

    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Category({AllTests.class, AcceptanceTests.class})
    @DisplayName("Listar Ids de reservas")
    public void validaListagemDeIdsDasReservas() {

        getBookingRequest.bookingReturnIds()
                .then()
                .statusCode(200)
                .body("size()", greaterThan(0));
    }

    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Category({AllTests.class, ContractTests.class})
    @DisplayName("Garantir o Schema do retorno da listagem de reservas")
    public void validaSchemaDaListagemDeReservas() {

        getBookingRequest.bookingReturnIds()
                .then()
                .statusCode(200)
                .body(matchesJsonSchema(new File(Utils.getSchemaBasePath("booking", "bookings"))));

    }

    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Category({AllTests.class, ContractTests.class, AcceptanceTests.class})
    @DisplayName("Garantir o Schema do retorno de uma reserva especifica")
    public void validaSchemaDaReserva() {
        getBookingRequest.bookingReturnbooking(1)
                .then()
                .statusCode(200)
                .body(matchesJsonSchema(new File(Utils.getSchemaBasePath("booking", "reservaEspecifica"))));

    }

    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Category({AllTests.class, AcceptanceTests.class})
    @DisplayName("Retorna Ids com filtros")
    public void RetornaReservaFiltroFirstName() {
        getBookingRequest.bookingReturnFiltro("Sally", "Ericsson",new Date(), new Date())
                .then()
                .statusCode(200)
                .body("size()", greaterThan(0));
    }
}
