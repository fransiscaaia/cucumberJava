package steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import pages.productPage;
import utils.driverManager;

public class productSteps {
	
	WebDriver driver = driverManager.getDriver();
	productPage productPage = new productPage(driver);
	
	@Then("I should see shop by option")
	public void i_should_see_shop_by_option() {
		productPage.shopBy().isDisplayed();
	}

	@When("I shop by {string}")
	public void i_shop_by(String string) {
		productPage.openSubMenu(string);
	}

	@Then("I should see filter option")
	public void i_should_see_filter_option() {
	    productPage.filterSection().isDisplayed();
	}

	@When("I filter by category {string}")
	public void i_filter_by_category(String string) {
	    productPage.filterByCategory(string);
	}

	@Then("I should see product list has been filtered by {string}")
	public void i_should_see_product_list_has_been_filtered_by(String string) {
	    productPage.filterValueValidation(string);
	}
}
