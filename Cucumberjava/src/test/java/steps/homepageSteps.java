package steps;

import pages.homepage;
import utils.driverManager;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;

public class homepageSteps {
	
	WebDriver driver = driverManager.getDriver();
	homepage home;
	
	@Given("I am on the homepage")
	public void i_am_on_the_homepage() {
		home = new homepage(driver);
		driver.navigate().to("https://magento.softwaretestingboard.com");
	}
	
	@When("I should see logo")
	public void i_should_see_logo() {
	    home.checkLogo();
	}

	@When("I should see search bar")
	public void i_should_see_search_bar() {
	    home.checkSignIn();
	}
	
	@Then("I should see sign in text")
	public void i_should_see_sign_in_text() {
	    home.checkSignIn();
	}

	@Then("I should see create account text")
	public void i_should_see_create_account_text() {
	    home.checkCreateAccount();
	}

	@Then("I should see cart icon")
	public void i_should_see_cart_icon() {
	    
	}

	@Then("I should see promo section")
	public void i_should_see_promo_section() {
	    
	}

	@Then("I should see hot seller items")
	public void i_should_see_hot_seller_items() {
	    
	}
	
	@When("I click on the search bar")
	public void i_click_on_the_search_bar() {
	    home.search_input().click();
	}
	
	@Then("I search for {string}")
	public void i_search_for(String string) {
	    home.search_input().sendKeys(string);
	    home.search_input().sendKeys(Keys.ENTER);
	}
	
	@When("I click on {string} Tab")
	public void i_click_on_woman_tab(String string) {
	    home.openTab(string);
	}
}
