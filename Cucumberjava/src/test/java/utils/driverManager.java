package utils;
import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverManager {
	    private static WebDriver driver;

	    @Before
	    public static WebDriver getDriver() {
	        if (driver == null) {
	            // You can add code here to set up the driver with DesiredCapabilities
	    		System.getProperty("webdriver.chrome.driver", "/Cucumberjava/src/test/resources/drivers/chromedriver.exe");
	            driver = new ChromeDriver();
	            driver.manage().window().maximize();
	            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       
	        }
	        return driver;
	    }

	    @After
	    public static void quitDriver() {
	        if (driver != null) {
	            driver.quit();
	            driver = null;
	        }
	    }
}
