package starter.wikipedia;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;

public class NavigateActions extends UIInteractions {
	
	@Step("Navigate to the home page")
    public void toTheHomePage() {
        openUrl("https://en.wikipedia.org/wiki/Main_Page/"); 
		
    }
}
