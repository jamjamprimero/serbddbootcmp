package test.wikipedia;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.openqa.selenium.WebDriver;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import starter.wikipedia.NavigateWiki;
import starter.wikipedia.ValidationActions;

@ExtendWith(SerenityJUnit5Extension.class)
public class ChangeLanguage {
	@Managed(driver = "chrome")
	WebDriver driver;
	
	@Steps
	NavigateWiki nav;
	@Steps
	ValidationActions vac;
	
	@Test
	public void change_language_to_es() {
		nav.go_to_wikipedia();
		vac.isWikipageLanguageEqualTo("en");
		nav.click_page_information();
		vac.isLanguageInfoEqualTo("en - English");
		nav.navigate_back();
		nav.select_language("es", "Español");
		vac.isWikipageLanguageEqualTo("es");
		nav.click_page_information();
		vac.isLanguageInfoEqualTo("es - español");
	}
	
	
}
