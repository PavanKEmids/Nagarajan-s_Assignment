package PageActions;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import PageObjects.FlipkartPageObjects;
import Resource.Base;

public class FlipkartPageActions extends Base {

	public void searchProduct() throws InterruptedException {
		driver.findElement(FlipkartPageObjects.closeLoginButton).click();
		driver.findElement(FlipkartPageObjects.searchBar).click();
		driver.findElement(FlipkartPageObjects.searchBar).sendKeys("Flower Pot");
		Thread.sleep(1000);
		driver.findElement(FlipkartPageObjects.searchButton).click();
	}

	public void clickOnProduct() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(FlipkartPageObjects.productAdani).click();
		Thread.sleep(1000);

		String parentFlip = driver.getWindowHandle();

		Set<String> s = driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1 = s.iterator();

		while (I1.hasNext()) {

			String Flipchild_window = I1.next();

			if (!parentFlip.equals(Flipchild_window)) {
				driver.switchTo().window(Flipchild_window);

				// System.out.println(driver.switchTo().window(child_window));
				System.out.println("Price of the AGAMI Plant Container Set is "
						+ driver.findElement(FlipkartPageObjects.priceOfAdniPorduct).getText());
			}

		}
	}

	public void addToCart() throws InterruptedException {
		driver.findElement(FlipkartPageObjects.addtoCart).click();
		Thread.sleep(2000);

	}

	public void increaseProd() throws InterruptedException {
		driver.findElement(FlipkartPageObjects.addPlusButton1).click();
		Thread.sleep(1000);
		System.out.println("Price of product after adding is "
				+ driver.findElement(FlipkartPageObjects.priceOfProdAfterAdd).getText());
		Thread.sleep(1000);
	}

	public void navigateHomePage() throws InterruptedException {
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(FlipkartPageObjects.flipkartDashboard).click();
		Thread.sleep(1000);
		driver.findElement(FlipkartPageObjects.closeLoginButton).click();
	}

	public void mousehover() throws InterruptedException {
		Thread.sleep(2000);
		Actions flipAc = new Actions(driver);
		WebElement applianceElement = driver.findElement(FlipkartPageObjects.appliances);

		flipAc.moveToElement(applianceElement).build().perform();
		Thread.sleep(1000);
		Actions flipHomeApp = new Actions(driver);
		WebElement homApplianceElement = driver.findElement(FlipkartPageObjects.homeAppiance);
		flipHomeApp.moveToElement(homApplianceElement).build().perform();
		Thread.sleep(1000);
		driver.findElement(FlipkartPageObjects.airPurifiers).click();

	}

	public void LowToHigh() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(FlipkartPageObjects.lowToHigh).click();
		Thread.sleep(1000);
		String productNames = "//div[@class='_4rR01T']";
		String priceOfPorduct = "//div[@class='_30jeq3 _1_WHN1']";

		List<WebElement> lists = driver.findElements(By.xpath(productNames));
		List<WebElement> list = driver.findElements(By.xpath(priceOfPorduct));

		for (int i = 0; i < lists.size(); i++) {

			System.out.println(lists.get(i).getText() + "---" + list.get(i).getText());
		}
		Thread.sleep(1000);
	}

	public void login() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(FlipkartPageObjects.loginButton).click();
		driver.findElement(FlipkartPageObjects.userName).sendKeys("1234567890");
		Thread.sleep(1000);
		driver.findElement(FlipkartPageObjects.password).click();
		driver.findElement(FlipkartPageObjects.password).sendKeys("Password123");
		Thread.sleep(1000);
		driver.findElement(FlipkartPageObjects.loginclick).click();
		Thread.sleep(1000);
	}

	public void catchLoginError() {
		System.out.println("Login Error Message is " + driver.findElement(FlipkartPageObjects.errorText).getText());
	}

}
