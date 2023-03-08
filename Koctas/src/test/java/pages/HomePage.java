package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;
import utilities.WaitHelper;

public class HomePage {
	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(css = ".open-member[aria-label=\"‹yelik\"]")
	public WebElement iconMember;

	@FindBy(xpath = "//ul//a[@href=\"/login\"]")
	public WebElement loginSelect;

	@FindBy(id = "autocomplete-0-input")
	public WebElement placeHolder;

	@FindBy(css = "button[class='aa-SubmitButton']")
	public WebElement submitButton;

	//	@FindBy(xpath = "//a[text()='2']")
	@FindBy(xpath = "(//li[contains(@class,\"page-item\")])[3]")
	public WebElement secondPage;

	@FindBy(xpath = "//*[normalize-space()='Gardiroplar']")
	public WebElement gardiropTitle;

	@FindBy(css = "li[data-position='3']")
	public WebElement thirdProduct;

	@FindBy(css = "div a.addToFavoritesButton")
	public WebElement iconHeart;

	@FindBy(id = "whishlist-list")
	public WebElement myFavoritesButton;

	@FindBy(css = ".wishlist-product-add-button")
	public WebElement saveButton;

	@FindBy(css = "a[title='Favori Listem']")
	public WebElement favoriteListSelect;

	@FindBy(css = ".wishlist-wrap-item")
	public WebElement favoriteItems;

	@FindBy(css = "h6[class^='font-size-4']")
	public WebElement myFavoriteHeader;

	@FindBy(xpath = "//div[@class='row']//div[@class='col-12']")
	public WebElement numberOfProducts;

	@FindBy(css = "svg[class='icon-heart mb-5 fav-icon-color']")
	//	@FindBy(xpath = "//span[text()='Favorilerimden Kald√Ωr']")
	public WebElement removeIconHeart;

	@FindBy(css = "li[data-position='1']")
	public WebElement favoriteProduct;

	@FindBy(css = "p[class='px-10']")
	public WebElement listIsEmpty;

	public void iconButtonClick() {
		WaitHelper.waitForElement(iconMember, 10);
		iconMember.click();
	}
}
