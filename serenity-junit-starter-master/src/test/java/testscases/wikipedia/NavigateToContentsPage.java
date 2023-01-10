package testscases.wikipedia;



import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import element_repositories.wikipedia.ContentsPage;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import starter.wikipedia.NavigateActions;

@ExtendWith(SerenityJUnit5Extension.class)
public class NavigateToContentsPage  {

	
@Managed(driver = "chrome")
    
    WebDriver driver;

    @Steps
	NavigateActions navigate;
    
    @Steps
	ContentsPage contentPage;


	
	@Test
	void clickContents() {
		
		navigate.toTheHomePage();
		contentPage.clickContents();
		contentPage.clickVitalArticles();
		contentPage.clickFeaturedContent();
		contentPage.clickGoodArticles();
		contentPage.clickOverviews();
		contentPage.clickOutlines();
		contentPage.clickLists();
		contentPage.clickPortals();
		contentPage.clickGlossaries();
		contentPage.clickCategories();
		contentPage.clickIndices();
		contentPage.clickAZindices();	
	}
	
	
}
