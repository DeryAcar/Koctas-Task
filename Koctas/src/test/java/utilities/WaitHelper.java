package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {
	static WebDriverWait wait;

	public static void waitForElement(WebElement element, long timeOutInSecond) {
		wait = new WebDriverWait(Driver.getDriver(), timeOutInSecond);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void waitForElementToBeClickable(WebElement locator, long timeOutInSecond) {
		wait = new WebDriverWait(Driver.getDriver(), timeOutInSecond);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
}
