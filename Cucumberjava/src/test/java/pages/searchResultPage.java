package pages;

import static org.junit.Assert.assertTrue;

import java.awt.image.BufferedImage;
import javax.imageio.*;
import java.io.File;
import java.io.IOException;
import ru.yandex.qatools.ashot.comparison.*;

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
	By img1 = By.xpath("(//img[@class='product-image-photo'])[1]");
	By img2 = By.xpath("(//img[@class='product-image-photo'])[2]");

	public searchResultPage(WebDriver driver) {
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

	public WebElement image1() {
		return driver.findElement(img1);
	}

	public WebElement image2() {
		return driver.findElement(img2);
	}

	//image compare
	public void imageValidation() throws IOException {
		String image1 = driver.findElement(img1).getAttribute("scr");
		String image2 = driver.findElement(img1).getAttribute("scr");

		BufferedImage expectedImage = ImageIO.read(new File(image1));
		BufferedImage actualImage = ImageIO.read(new File(image2));

		ImageDiffer imgDiff = new ImageDiffer();
		ImageDiff diff = imgDiff.makeDiff(actualImage, expectedImage);
		if (diff.hasDiff()) {
			System.out.println("Image is different by method 2.");
		} else {
			System.out.println("Image is same by method 2.");
		}
	}
}
