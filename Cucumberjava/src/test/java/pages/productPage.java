package pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class productPage {

	WebDriver driver;
	String filterLabel;
	
	By filter_section = By.className("filter-content");
	By filter_label = By.className("filter-label");
	By filter_value = By.className("filter-value");
	By shopBySection = By.id("narrow-by-list2");
	By category = By.xpath("//div[text()='Category']");
	
	
	public productPage (WebDriver driver) {
		this.driver = driver;
	}

	
	public WebElement filterSection () {
		return driver.findElement(filter_section);
	}
	
	public WebElement shopBy () {
		return driver.findElement(shopBySection);
	}
	
	public void openSubMenu(String menu) {
		driver.findElement(By.xpath("//a[contains(text(), '" + menu + "')]")).click();
	}
	
	
	public void filterByCategory(String cat) {
		driver.findElement(category).click();
		driver.findElement(By.xpath("//a[contains(text(), '" + cat + "')]")).click();
		filterLabel = cat;
	}
	
	public void filterValueValidation(String value) {
		assertTrue(driver.findElement(filter_value).getText().contains(value));
	}
	
}
