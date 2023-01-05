package pageobjects.wikipedia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;

public class NavigateWiki extends UIInteractions {
	
	private static final By bPInfoHLink = By.xpath("//li[@id='t-info']//a");
	private static final By bSpanishLink = By.xpath("//a[@lang='es']");
	
	
	@Step("Navigate to Wikipedia website")
	public void go_to_wikipedia() {
		openUrl("https://en.wikipedia.org/wiki/Main_Page");
		
		
	}
	
	@Step("Click Page Information hyperlink")
	public void click_page_information() {
		$(bPInfoHLink).click();
	}
	
	@Step("Navigate back to Main Page")
	public void navigate_back(WebDriver dr) {
		dr.navigate().back();
	}
	
	@Step("Click Español under Language section")
	public void select_es_language() {
		$(bSpanishLink).click();
	}
}