package pages;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class searchResultPage {
	
	WebDriver driver;
	
	By txt_search_title = By.className("base");
	By sorting_selection = By.id("sorter");
	By product_list = By.className("products-grid");
	By product_items = By.className("product-item");
	By product_item_info = By.className("product-item-info");
	By btn_addToCart = By.className("tocart");
	
	
	public searchResultPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public void checkTitle(String title) {
		assertTrue(driver.findElement(txt_search_title).getText().contains(title));
	}

	public void checkSorting() {
		driver.findElement(sorting_selection).isDisplayed();
	}
	
	public void checkProductList() {
		driver.findElement(product_list).isDisplayed();
	}
	
	public void checkProductItem() {
		driver.findElement(product_items).isDisplayed();
	}
	
	public void checkProductItemInfo() {
		driver.findElement(product_item_info).isDisplayed();
	}
	
	public void checkButtonAddToCart() {
		driver.findElement(btn_addToCart).isDisplayed();
	}
	
	public WebElement atcButton() {
		return driver.findElement(btn_addToCart);
	}
	
	public WebElement productItemInfo() {
		return driver.findElement(product_item_info);
	}
}
