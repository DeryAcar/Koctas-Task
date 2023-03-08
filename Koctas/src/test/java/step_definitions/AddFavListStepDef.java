package step_definitions;

import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import utilities.Driver;
import utilities.HelperMethods;
import utilities.WaitHelper;

public class AddFavListStepDef {
	HomePage homepage = new HomePage();
	Actions actions = new Actions(Driver.getDriver());

	@When("^the user types \"([^\"]*)\" in the search bar$")
	public void the_user_types_in_the_search_bar(String product) throws Throwable {
		homepage.placeHolder.sendKeys(product);
	}

	@When("^the user click search button$")
	public void the_user_click_search_button() throws Throwable {
		homepage.submitButton.click();
	}

	@Then("^the user able to see open page$")
	public void the_user_able_to_see_open_page() throws Throwable {
		homepage.gardiropTitle.isDisplayed();
	}

	@When("^the user click on second page$")
	public void the_user_click_on_second_page() throws Throwable {
		HelperMethods.scrollIntoView(homepage.secondPage);
		homepage.secondPage.click();
	}

	@Then("^the user able to see open second page$")
	public void the_user_able_to_see_open_second_page() throws Throwable {
		String url = Driver.getDriver().getCurrentUrl();
		Assert.assertEquals("https://www.koctas.com.tr/search?q=Gardiroplar:relevance&page=2", url);
	}

	@When("^the user click button the third product$")
	public void the_user_click_button_the_third_product() throws Throwable {
		homepage.thirdProduct.click();
	}

	@When("^the user click favorilerime ekle$")
	public void the_user_click_favorilerime_ekle() throws Throwable {
		HelperMethods.scrollIntoView(homepage.iconHeart);
		homepage.iconHeart.click();
	}

	@When("^the user click button my favorites in the open popup$")
	public void the_user_click_button_my_favorites_in_the_open_popup() throws Throwable {
		WaitHelper.waitForElementToBeClickable(homepage.myFavoritesButton, 10);
		homepage.myFavoritesButton.click();
	}

	@When("^the user click save button$")
	public void the_user_click_save_button() throws Throwable {
		homepage.saveButton.click();
	}

	@When("^the user click on the hesabim button$")
	public void the_user_click_on_the_hesabim_button() throws Throwable {
		Thread.sleep(6000);
		HelperMethods.scrollIntoView(homepage.iconMember);
		homepage.iconMember.click();
	}

	@When("^the user click on the my favorite list link$")
	public void the_user_click_on_the_my_favorite_list_link() throws Throwable {
		homepage.favoriteListSelect.click();
	}

	@Then("^the user able to verify newly added products in the list$")
	public void the_user_able_to_verify_newly_added_products_in_the_list() throws Throwable {
		String actualNumber = homepage.numberOfProducts.getText();
		Assert.assertTrue(actualNumber.contains("1"));
	}

	@Then("^the user able to see name of the list$")
	public void the_user_able_to_see_name_of_the_list() throws Throwable {
		String actualHeader = homepage.myFavoriteHeader.getText();
		Assert.assertEquals(actualHeader, "Favorilerim");
	}

}
