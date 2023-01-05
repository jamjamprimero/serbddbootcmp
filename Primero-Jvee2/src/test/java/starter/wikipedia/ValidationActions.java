package starter.wikipedia;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageComponent;

public class ValidationActions extends PageComponent {
	private static final By bPInfoLang = By.xpath("//tr[@id='mw-pageinfo-article-id']/following-sibling::tr[1]/td[2]");
	
	public boolean isLanguageInfoEqualTo(String sLang) {
		return $(bPInfoLang).getText().contains(sLang);
	}
}
