package steps;

import utils.driverManager;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.*;
import pages.searchResultPage;

public class searchResultSteps {
	
	WebDriver driver = driverManager.getDriver();
	searchResultPage searchPage = new searchResultPage(driver);
	String search;
	
	Actions actions = new Actions(driver);

	@When("I should see search result for {string}")
	public void i_should_see_search_result_for(String string) {
	    searchPage.checkTitle(string);
	    
	    search = string;
	}

	@When("I should see sorting selection")
	public void i_should_see_sorting_selection() {
	    searchPage.checkSorting();
	}

	@When("I should see product list")
	public void i_should_see_product_list() throws IOException {
	    searchPage.checkProductList();
	    searchPage.imageValidation();
	}

	@When("I should see product items")
	public void i_should_see_product_items() {
	    searchPage.checkProductItem();
	}

	@When("I should see add to cart button on product items")
	public void i_should_see_add_to_cart_button_on_product_items() {
		actions.moveToElement(searchPage.productItemInfo()).build().perform();
		searchPage.atcButton().isDisplayed();
	}
	
	@When("I click on add to cart button")
	public void i_click_on_add_to_cart_button() {
		searchPage.atcButton().click();
	}
	
	@When("I click on product {string}")
	public void i_click_on_product(String string) {
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.partialLinkText(string)));
		actions.perform();
		driver.findElement(By.partialLinkText(string)).click();;
	}
	
}
