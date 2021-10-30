package br.com.restassuredapitesting.runners;

import br.com.restassuredapitesting.testes.booking.testes.DeleteBookingTest;
import br.com.restassuredapitesting.testes.booking.testes.GetBookingTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(br.com.restassuredapitesting.suites.AcceptanceTests.class)
@Suite.SuiteClasses({
        AcceptanceTest.class,
        DeleteBookingTest.class,
        GetBookingTest.class,

})

public class AcceptanceTest {
}
