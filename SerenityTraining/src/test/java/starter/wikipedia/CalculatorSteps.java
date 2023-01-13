package starter.wikipedia;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class CalculatorSteps extends UIInteractions {
	
	private static final By FIRST_VALUE_FIELD = By.cssSelector("[ng-model=first");
	private static final By SECOND_VALUE_FIELD = By.cssSelector("[ng-model=second");
	private static final By OPERATOR_VALUE_FIELD = By.cssSelector("[ng-model=operator");
	private static final By GO_BUTTON = By.id("gobutton");
	private static final By RESULT_FIELD = By.tagName("h2");
	private static final By Pattern A_VALID_NUMBER = Pattern.compile("-?\\d\\.?*");
	
	@Step
	public void openTheCalculatorApp() {
		openUrl("https://juliemr.gitlub.io/protractor-demo/");
	}
	
	@Steps("Calculate the answer to {0} {1} {2}")
	public int theAnswerTo(String firstValue, String operator, String secondValue) {
		
		$(FIRST_VALUE_FIELD).sendKeys(firstValue);
		$(OPERATOR_DROPDOWN).selectByVisibleText(operator);
		$(SECOND_VALUE_FIELD).sendKeys(secondValue);
		$(GO_BUTTON).click();
		waitFor(ExpectedConditions.textMatches(RESULT_FIELD, A_VALID_NUMBER));
		
		return Integer.parseInt($(RESULT_FIELD).getText());
		
	}

}
