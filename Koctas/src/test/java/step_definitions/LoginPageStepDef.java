package step_definitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.Keys;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import utilities.Config;
import utilities.Driver;
import utilities.WaitHelper;

public class LoginPageStepDef {
	HomePage homePage = new HomePage();
	LoginPage loginPage = new LoginPage();

	@Given("^the user on the koctas homepage$")
	public void the_user_on_the_koctas_homepage() throws Throwable {
		Driver.getDriver().get(Config.getProperties("url"));
		Driver.getDriver().manage().window().maximize();

	}

	@Then("^the user able to see open homepage$")
	public void the_user_able_to_see_open_homepage() throws Throwable {
		String url = Driver.getDriver().getCurrentUrl();
		Assert.assertEquals("https://www.koctas.com.tr/", url);

	}

	@When("^the user click on the icon member$")
	public void the_user_click_on_the_icon_member() throws Throwable {
		homePage.iconButtonClick();
	}

	@When("^the user click login title$")
	public void the_user_click_login_title() throws Throwable {
		WaitHelper.waitForElement(homePage.loginSelect, 10);
		homePage.loginSelect.click();
	}

	@When("^the user enter valid email as \"([^\"]*)\"$")
	public void the_user_enter_valid_email_as(String email) throws Throwable {
		//		WaitHelper.waitForElement(loginPage.eMailBox, 10);
		loginPage.eMailBox.sendKeys(email);
	}

	@When("^the user enter valid password as \"([^\"]*)\"$")
	public void the_user_enter_valid_password_as(String password) throws Throwable {
		loginPage.passwordBox.sendKeys(password);
	}

	@When("^the user click giris yap button$")
	public void the_user_click_giris_yap_button() throws Throwable {
		Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage.loginButton.sendKeys(Keys.ENTER);
	}

	@Then("^the user able to see logged in$")
	public void the_user_able_to_see_logged_in() throws Throwable {
		String userName = loginPage.UserNameText.getText();
		Assert.assertEquals("Quality Engineer", userName);
	}
}
