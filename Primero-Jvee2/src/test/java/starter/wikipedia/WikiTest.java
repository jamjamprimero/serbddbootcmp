package starter.wikipedia;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Managed;
import pageobjects.wikipedia.NavigateWiki;

@ExtendWith(SerenityJUnit5Extension.class)
public class WikiTest {
	@Managed(driver = "chrome")
	WebDriver driver;
	
	NavigateWiki nav;
	ValidationActions vac;
	
	@Test
	public void changeLanguage() {
		nav.go_to_wikipedia();
		nav.click_page_information();	
		Serenity.reportThat("Validate Page Content Language is \"en - English\"",
				() -> assertThat(vac.isLanguageInfoEqualTo("en - English")));	
		nav.navigate_back(driver);	
		Serenity.reportThat("Validate user is redirected back to Wiki Main page",
				() -> assertThat(driver.getCurrentUrl()).isEqualTo("https://en.wikipedia.org/wiki/Main_Page"));	
		nav.select_es_language();		
		Serenity.reportThat("Validate user is redirected to Spanish Wiki page",
				() -> assertThat(driver.getCurrentUrl()).isEqualTo("https://es.wikipedia.org/wiki/Wikipedia:Portada"));
		nav.click_page_information();
		Serenity.reportThat("Validate Page Content Language is \"es - español\"",
				() -> assertThat(vac.isLanguageInfoEqualTo("es - español")));	
	}
}
