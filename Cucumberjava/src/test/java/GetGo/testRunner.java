package GetGo;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import utils.driverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features", glue= {"steps"})
public class testRunner {
	@BeforeClass
    public static void setup() {
		driverManager.getDriver();
    }

    @AfterClass
    public static void teardown() {
        driverManager.quitDriver();
    }
}
