package br.com.restassuredapitesting.runners;

import br.com.restassuredapitesting.testes.ping.testes.GetPingTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(br.com.restassuredapitesting.suites.SecurityTests.class)
@Suite.SuiteClasses({
        GetPingTest.class

})

public class SecurityTests {
}
