package steps;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.*;
import pages.productDetailPage;
import utils.driverManager;

public class productDetailSteps {
	
	WebDriver driver = driverManager.getDriver();
	productDetailPage productPage;
	
	
	@Then("I should direct to product detail")
	public void i_should_direct_to_product_detail() {
		productPage = new productDetailPage(driver);
	    productPage.productName().isDisplayed();
	}

	@Then("I should direct to product detail of {string}")
	public void i_should_direct_to_product_detail_of(String string) {
		productPage = new productDetailPage(driver);
	    assertTrue(productPage.productName().getText().contains(string));
	}

	@Then("I should see product image")
	public void i_should_see_product_image() {
	    productPage.image().isDisplayed();
	}

	@Then("I should see product price")
	public void i_should_see_product_price() {
		productPage.checkProductPrice();
	}

	@Then("I should see add to cart button")
	public void i_should_see_add_to_cart_button() {
		productPage.btnAtc().isDisplayed();
	}

	@Then("I should see product detail and information")
	public void i_should_see_product_detail_and_information() {
		productPage.checkproductDetail();
	}

	@Then("I should see related product section")
	public void i_should_see_related_product_section() {
		productPage.checkProductRelated();
	}

	@When("I click on product image")
	public void i_click_on_product_image() {
		productPage.image().click();
	}

	@Then("I should see product image becomes full screen")
	public void i_should_see_product_image_becomes_full_screen() {
	    productPage.fullImage().isDisplayed();
	    WebElement image = driver.findElement(By.className("fotorama__grab"));
	    Actions actions = new Actions(driver);
	    actions.clickAndHold(productPage.image());
	    image.sendKeys(Keys.chord(Keys.COMMAND, Keys.ADD));
	    
	}
	
	@And("I am zoom in zoom out the image")
	public void i_am_zoom_in_zoom_out_the_image() {
	    JavascriptExecutor executor = (JavascriptExecutor)driver;
	    //zoom in
	    executor.executeScript("document.body.style.zoom = '100%'");
	    //zoom put
	    executor.executeScript("document.body.style.zoom = '75%'");
	}
	
}
