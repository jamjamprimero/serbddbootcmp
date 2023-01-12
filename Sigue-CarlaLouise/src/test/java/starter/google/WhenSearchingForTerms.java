package starter.google;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.SingleBrowser;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
class WhenSearchingForTerms {
	
	@Managed(driver = "chrome", options = "headless")
	WebDriver driver;
	NavigateActions navigate;
	SearchActions search;
	DisplayedArticle displayedArticle;
	
	@Test
	void searchBySingleKeyWord() {
		navigate.toTheHomePage();
		search.searchBy("Carla Sigue");
		Serenity.reportThat("The first heading should bE Carla Sigue",
				() -> assertThat(displayedArticle.getFirstHeading()).isEqualTo("Carla Sigue")
		);
	}

}
