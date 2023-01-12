package starter.wikipedia;

import static org.assertj.core.api.Assertions.assertThat;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;
import pageobjects.wikipedia.WikiElements;

public class ValidationActions extends UIInteractions {
	WikiElements wk;
	
	@Step("Validate Page Content Language is {0}")
	public void isLanguageInfoEqualTo(String sLang) {
		Serenity.reportThat("Page Content Language is \""+sLang+"\"",
				() -> assertThat(wk.getLangInfo()).isEqualTo(sLang));	
	}
	
	@Step("Validate Wiki Language is {0}")
	public void isWikipageLanguageEqualTo(String sLang) {
		Serenity.reportThat("Wiki Page Language Code is \""+sLang+"\"",
				() -> assertThat(wk.getLangPAttrib()).isEqualTo(sLang));	
	}
	
	@Step("Validate user is redirected to {0}")
	public void isRedirected_to(String sURL) {
		Serenity.reportThat("User is redirected to \""+sURL+"\"",
				() -> assertThat(wk.currentURL()).isEqualTo(sURL));
	}
}
