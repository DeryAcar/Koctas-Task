package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class LoginPage {
	public LoginPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(id = "j_username")
	public WebElement eMailBox;

	@FindBy(id = "j_password")
	public WebElement passwordBox;

	@FindBy(id = "loginButton")
	public WebElement loginButton;

	@FindBy(css = "span[class='d-block font-size-2 text-c4']")
	public WebElement UserNameText;
}
