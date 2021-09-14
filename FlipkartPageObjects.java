package PageObjects;

import org.openqa.selenium.By;

public class FlipkartPageObjects {

	public static By searchBar = By.xpath("//input[@type='text']");
	public static By searchButton = By.xpath("//button[@type='submit']");
	public static By productAdani = By.xpath("//a[@title='AGAMI Plant Container Set']");
	public static By priceOfAdniPorduct = By.xpath("//div[@class='_30jeq3 _16Jk6d']");
	public static By addtoCart = By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']");
	public static By addPlusButton = By.xpath("//button[contains(text(),'+')]");
	public static By addPlusButton1 = By
			.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div[1]/div/button[2]");
	public static By priceOfProdAfterAdd = By.xpath("//span[@class='_2-ut7f _1WpvJ7']");
	public static By loginButton = By.xpath("//a[@class='_1_3w1N' and contains(text(),'Login')]");
	public static By userName = By.xpath("//input[@type='text' and @class='_2IX_2- VJZDxU']");
	public static By password = By.xpath("//input[@type='password' and @class='_2IX_2- _3mctLh VJZDxU']");
	public static By loginclick = By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL' and @type='submit']");
	public static By errorText = By.xpath("//span[contains(text(),'Please enter valid Email ID/Mobile number')]");

	public static By flipkartDashboard = By.xpath("//img[@title='Flipkart' and @class='_2xm1JU']");
	public static By appliances = By.xpath("//div[@class='xtXmba' and contains(text(),'Appliance')]");
	public static By homeAppiance = By.xpath("//a[contains(text(),'Home Appliances')]");
	public static By airPurifiers = By.xpath("//*[ contains(text(),'Air Purifiers')]");
	public static By lowToHigh = By.xpath("//div[@class='_10UF8M' and contains(text(),'Price -- Low to High')]");
	public static By closeLoginButton = By.xpath("//button[@class='_2KpZ6l _2doB4z']");
}
