package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homepage {
	
	WebDriver driver;
	
	By txt_signIn = By.xpath("//*[contains(text(), 'Sign In')]");
	By txt_create_account = By.xpath("//*[contains(text(), 'Account')]");
	By logo = By.className("logo");
	By promo = By.className("blocks-promo");
	By txt_search_input = By.id("search");
	By btn_search = By.xpath("//button[@title='Search']");
	By cart_icon = By.className("minicart-wrapper");
	By hot_product_items = By.className("block-products-list");
	
	public homepage (WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void inputSearch(String text) {
		driver.findElement(txt_search_input).sendKeys(text);
	}
	
	public void clickSearch() {
		driver.findElement(btn_search).click();
	}
	
	public void checkSignIn() {
		driver.findElement(txt_signIn).isDisplayed();
	}

	public void checkCreateAccount() {
		driver.findElement(txt_create_account).isDisplayed();
	}
	
	public void checkLogo() {
		driver.findElement(logo).isDisplayed();
	}
	
	public WebElement search_input() {
		return driver.findElement(txt_search_input);
	}
}
