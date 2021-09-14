package StepDefinitions;

import PageActions.FlipkartPageActions;
import Resource.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlipkartStepDef {

	Base flipBase = new Base();
	FlipkartPageActions flipAction = new FlipkartPageActions();

	@Given("^The URL and I launch$")
	public void the_URL_and_I_launch() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		flipBase.brwoserinit();
		Base.driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
	}

	@When("^I search for flower pot$")
	public void i_search_for_flower_pot() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		flipAction.searchProduct();

	}

	@And("^I click on AGAMI Plant Container Set and verify the price$")
	public void i_click_on_AGAMI_Plant_Container_Set_and_verify_the_price() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		flipAction.clickOnProduct();

	}

	@Then("^Price should dislpay$")
	public void price_should_dislpay() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Given("^Product AGAMI Plant Container Set$")
	public void product_AGAMI_Plant_Container_Set() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@When("^I click on Add to cart$")
	public void i_click_on_Add_to_cart() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		flipAction.addToCart();
	}

	@When("^I click \\+ button to increase item and verify the price$")
	public void i_click_button_to_increase_item_and_verify_the_price() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		flipAction.increaseProd();
	}

	@Then("^Price of the product should display$")
	public void price_of_the_product_should_display() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Given("^The Add Cart link$")
	public void the_Add_Cart_link() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@When("^I navigate to home page$")
	public void i_navigate_to_home_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		flipAction.navigateHomePage();
	}

	@And("^I mouse hover on Appliances>Home appliances and select Air purifire$")
	public void i_mouse_hover_on_Appliances_Home_appliances_and_select_Air_purifire() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		flipAction.mousehover();
	}

	@And("^Clcik on Low to High sort$")
	public void clcik_on_Low_to_High_sort() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		flipAction.LowToHigh();

	}

	@Then("^All items should diplay with the price low to high$")
	public void all_items_should_diplay_with_the_price_low_to_high() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Given("^The flipkart URL and I launch$")
	public void the_flipkart_URL_and_I_launch() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@When("^I click on Loign button$")
	public void i_click_on_Loign_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		flipAction.login();

	}

	@And("^I enter Invalid username,password and click on Login button$")
	public void i_enter_Invalid_username_password_and_click_on_Login_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^Error message should display$")
	public void error_message_should_display() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		flipAction.catchLoginError();

	}

}
