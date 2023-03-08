package step_definitions;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import utilities.Driver;
import utilities.HelperMethods;

public class RemoveFavListStepDef {

	HomePage homepage = new HomePage();

	@Given("^the user on the favorite list page$")
	public void the_user_on_the_favorite_list_page() throws Throwable {
		String url = Driver.getDriver().getCurrentUrl();
		Assert.assertEquals("https://www.koctas.com.tr/my-account/lists", url);
	}

	@When("^the user click on favorite list$")
	public void the_user_click_on_favorite_list() throws Throwable {
		homepage.favoriteItems.click();
	}

	@When("^the user click on product$")
	public void the_user_click_on_product() throws Throwable {
		homepage.favoriteProduct.click();
	}

	@When("^the user click button as favorilerimden kaldir$")
	public void the_user_click_button_as_favorilerimden_kaldir() throws Throwable {
		HelperMethods.scrollIntoView(homepage.removeIconHeart);
		homepage.removeIconHeart.click();
	}

	@Then("^the user able to verify product removed from the list$")
	public void the_user_able_to_verify_product_removed_from_the_list() throws Throwable {
		String actualNumber = homepage.numberOfProducts.getText();
		Assert.assertTrue(actualNumber.contains("0"));
		Driver.getDriver().quit();
	}
}
