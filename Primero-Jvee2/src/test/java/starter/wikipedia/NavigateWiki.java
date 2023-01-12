package starter.wikipedia;

import static org.assertj.core.api.Assertions.assertThat;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;
import pageobjects.wikipedia.WikiElements;

public class NavigateWiki extends UIInteractions {
	WikiElements wk;
	String sWikiURL = "https://en.wikipedia.org/wiki/Main_Page";
	
	@Step("Navigate to Wikipedia website")
	public void go_to_wikipedia() {
		openUrl(sWikiURL);
		Serenity.reportThat("Navigated to Main Page", () -> assertThat(getDriver().getCurrentUrl().equals(sWikiURL)));	
	}
	
	@Step("Click Page Information hyperlink")
	public void click_page_information() {
		wk.bPInfoHLink.click();	
	}
	
	@Step("Navigate back to Previous Page")
	public void navigate_back() {
		getDriver().navigate().back();
	}
	
	@Step("Select {1} under Language section")
	public void select_language(String sLang, String sLang2) {
		wk.setLangLink(sLang);
		wk.bLangLink.click();
	}
}