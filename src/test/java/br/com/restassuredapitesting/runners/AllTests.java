package br.com.restassuredapitesting.runners;

import br.com.restassuredapitesting.testes.auth.tests.PostAuthTest;
import br.com.restassuredapitesting.testes.booking.testes.GetBookingTest;
import br.com.restassuredapitesting.testes.booking.testes.PutBookingTest;
import br.com.restassuredapitesting.testes.ping.testes.GetPingTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(br.com.restassuredapitesting.suites.AllTests.class)
@Suite.SuiteClasses({
        GetPingTest.class,
        GetBookingTest.class,
        PostAuthTest.class,
        PutBookingTest.class,

})

public class AllTests {

}
