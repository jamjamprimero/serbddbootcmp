package starter.wikipedia;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.common.BaseTest;
import starter.pageobjects.WikipediaPage;

public class BDDWikipedia extends BaseTest{
	
	WikipediaPage wpp;
	
	@After
	public void tearDown() {
		endTest();
	}
	
	@Given("^Browser \"(.*)\" and website \"(.*)\" is open$")
	public void Browser_and_website_is_open (String sBrowser, String sURL) throws Throwable{
		openBrowser(sBrowser);
		openURL(sURL);
	}
	
	@When("^User select log in button$")
	public void User_select_log_in_button () {
		wpp = new WikipediaPage(driver, wait);
		wpp.clickLogIn();
	}
	
	@Then("^User successfully land to log in page$")
	public void User_successfully_land_to_log_in_page() {
		wpp.checkLogIn("Log in");
	}

}
