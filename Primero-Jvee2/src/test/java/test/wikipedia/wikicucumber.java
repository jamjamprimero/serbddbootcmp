package test.wikipedia;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.wikipedia.NavigateWiki;
import starter.wikipedia.ValidationActions;

public class wikicucumber {
	@Steps
	NavigateWiki nav;
	@Steps
	ValidationActions vac;
	
	
	@Given("^Wiki page is opened$")
	public void wiki_page_is_opened() {
		nav.go_to_wikipedia();	
	}

	@When("^Page information is clicked$")
	public void page_information_is_clicked() {
		nav.click_page_information();
	}
	@Then("^Validate Page content language is \"(.*)\"$")
	public void is_page_language_set_to(String sLang) {
		vac.isLanguageInfoEqualTo(sLang);
	}
	
	@And("^User navigates back to Main Page$")
	public void navigate_back() {
		nav.navigate_back();
	}
	
	@When("^\"(.*)\" \"(.*)\" is clicked under Languages section$")
	public void lang_link_is_clicked(String sLang,String sLCode) {
		nav.select_language(sLCode, sLang);
	}
	
	@Then("^User is redirected to \"(.*)\"")
	public void user_is_redirected_to(String sURL) {
		vac.isRedirected_to(sURL);
	}
}
