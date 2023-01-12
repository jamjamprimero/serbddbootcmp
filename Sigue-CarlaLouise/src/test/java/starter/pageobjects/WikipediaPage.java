package starter.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;
import starter.common.BasePage;

public class WikipediaPage extends BasePage {
	
	public WikipediaPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	By clickLogIn = By.xpath("//*[@id=\"pt-login\"]/a/span");
	By checkLogIn = By.tagName("h1");
	
	public void clickLogIn() {
		click(clickLogIn);
	}
	
	@SuppressWarnings("deprecation")
	public void checkLogIn(String sConfirm) {
		Assert.assertTrue(getText(checkLogIn).contains(sConfirm));
	}
	


}
