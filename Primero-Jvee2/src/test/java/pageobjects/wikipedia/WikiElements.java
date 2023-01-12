package pageobjects.wikipedia;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageComponent;
import net.serenitybdd.core.pages.WebElementFacade;

public class WikiElements extends PageComponent {
	@FindBy(xpath="//li[@id='t-info']//a")
	public WebElementFacade bPInfoHLink;
	
	@FindBy(xpath="//tr[@id='mw-pageinfo-article-id']/following-sibling::tr[1]/td[2]")
	public WebElementFacade pInfoLang;
	
	@FindBy(id="firstHeading")
	public WebElementFacade pHeading;
	
	@FindBy(tagName="html")
	public WebElementFacade pageTag;

	public WebElementFacade bLangLink;
	public void setLangLink(String sLCode) {
		bLangLink = $(By.cssSelector("a[lang="+sLCode+"]"));
	}
	
	public String getLangInfo() {
		return $(pInfoLang).getText();
	}
	
	public String getLangPAttrib() {
		return $(pageTag).getAttribute("lang");
	}
	
	public String currentURL() {
		return getDriver().getCurrentUrl();
	}
}
