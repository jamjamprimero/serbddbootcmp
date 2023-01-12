package starter.google;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;

public class NavigateActions {
	
	@Step("Navigate to the home page")
	public void toTheHomePage() {
		openUrl("http://google.com/");
	}

	private void openUrl(String string) {
		// TODO Auto-generated method stub
		
	}

}
