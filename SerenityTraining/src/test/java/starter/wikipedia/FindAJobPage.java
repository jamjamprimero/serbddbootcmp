package starter.wikipedia;

import java.util.List;
import java.util.stream.Collectors;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://localhost:9000/somepage")
public class FindAJobPage extends PageObject {
	
	WebElementFacade keywords;
	WebElementFacade searchButton;
	
	public void look_for_jobs_with_keywords(String values) {
		typeInto(keywords, values);
		searchButton.click();
	}
	
	public List<String> getJobTabs(){
		return findAll("//div[@id='tabs']//a").stream()
				.map(WebElementFacade::getText)
				.collect(Collectors.toList());
	}

}
