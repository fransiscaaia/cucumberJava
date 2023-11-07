package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class productDetailPage {

	WebDriver driver;
	
	By product_info = By.className("product-info-main");
	By product_title = By.className("page-title");
	By image = By.className("fotorama-item");
	By product_price = By.className("product-info-price");
	By atc_button = By.id("product-addtocart-button");
	By product_detail = By.cssSelector("div.product.info.detailed");
	By product_related = By.className("products-related");
	By image_full = By.className("fotorama--fullscreen");
	
	public productDetailPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement image () {
		return driver.findElement(image);
	}
	
	public WebElement productName () {
		return driver.findElement(product_title);
	}
	
	public WebElement btnAtc() {
		return driver.findElement(atc_button);
	}
	
	public WebElement fullImage() {
		return driver.findElement(image_full);
	}
	
	public WebElement productRelated() {
		return driver.findElement(product_related);
	}
	
	public void checkProductPrice() {
		driver.findElement(product_price).isDisplayed();
	}
	
	public void checkProductInfo() {
		driver.findElement(product_info).isDisplayed();
	}
	
	public void checkproductDetail() {
		driver.findElement(product_detail).isDisplayed();
	}
	
	public void checkProductRelated() {
		driver.findElement(product_related).isDisplayed();
	}
	
}
