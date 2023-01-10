package element_repositories.wikipedia;


import static org.assertj.core.api.Assertions.assertThat;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageComponent;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class ContentsPage extends PageComponent {
	
	
	@FindBy(id="firstHeading")
    public WebElementFacade firstHeading;
	
	@FindBy(linkText="Contents")
	public WebElementFacade contents;
	
	@FindBy(linkText="Vital articles")
	public WebElementFacade vitalArticle;
	
	@FindBy(linkText="Featured content")
	public WebElementFacade featuredContent;
	
	@FindBy(linkText="Good articles")
	public WebElementFacade goodArticles;
	
	@FindBy(linkText="Overviews")
	public WebElementFacade overviews;
	
	@FindBy(linkText="Outlines")
	public WebElementFacade outlines;
	
	@FindBy(linkText="Lists")
	public WebElementFacade lists;
	
	@FindBy(linkText="Portals")
	public WebElementFacade portals;
	
	@FindBy(linkText="Glossaries")
	public WebElementFacade glossaries;
	
	@FindBy(linkText="Categories")
	public WebElementFacade categories;
	
	@FindBy(linkText="Indices")
	public WebElementFacade indices;
	
	@FindBy(linkText="A–Z index")
	public WebElementFacade AZindex;
	
     
    @Step("This step will click on contents tab")
    public void clickContents() {
    	contents.click(); 
    	Serenity.reportThat("The heading should contains 'Contents' text", 
    	() -> assertThat(firstHeading.getText().contains("Contents")));
    	
    }
    
    @Step("This step will click on Vital articles")
    public void clickVitalArticles() {
    	vitalArticle.click(); 
    	Serenity.reportThat("The heading should contains 'Vital articles' text", 
    	() -> assertThat(firstHeading.getText().contains("Vital articles")));
    	
    	getDriver().navigate().back();
    }
    @Step("This step will click on Featured content")
    public void clickFeaturedContent() {
    	featuredContent.click(); 
    	Serenity.reportThat("The heading should contains 'Featured content' text", 
    	() -> assertThat(firstHeading.getText().contains("Featured content")));
    	
    	getDriver().navigate().back();
    }
    @Step("This step will click on Good articles")
    public void clickGoodArticles() {
    	goodArticles.click();
    	Serenity.reportThat("The heading should contains 'Good articles' text", 
    	() -> assertThat(firstHeading.getText().contains("Good articles")));
    	
    	getDriver().navigate().back();
    }
    
    @Step("This step will click on Overviews")
    public void clickOverviews() {
    	overviews.click();
    	Serenity.reportThat("The heading should contains 'Overviews' text", 
    	() -> assertThat(firstHeading.getText().contains("Overviews")));
    	
    	getDriver().navigate().back();
    }
    
    @Step("This step will click on Outlines")
    public void clickOutlines() {
    	outlines.click(); 
    	Serenity.reportThat("The heading should contains 'Outlines' text", 
    	() -> assertThat(firstHeading.getText().contains("Outlines")));
    	
    	getDriver().navigate().back();
    }
    
    @Step("This step will click on Lists")
    public void clickLists() {
    	lists.click(); 
    	Serenity.reportThat("The heading should contains 'Lists' text", 
    	() -> assertThat(firstHeading.getText().contains("Lists")));
    	
    	getDriver().navigate().back();
    }
    
    @Step("This step will click on Portals")
    public void clickPortals() {
    	portals.click();
    	Serenity.reportThat("The heading should contains 'Portals' text", 
    	() -> assertThat(firstHeading.getText().contains("Portals")));
    	
    	getDriver().navigate().back();
    }
    
    @Step("This step will click on Glossaries")
    public void clickGlossaries() {
    	glossaries.click();
    	Serenity.reportThat("The heading should contains 'Glossaries' text", 
    	() -> assertThat(firstHeading.getText().contains("Glossaries")));
    	
    	getDriver().navigate().back();
    }
    
    @Step("This step will click on Categories")
    public void clickCategories() {
    	categories.click(); 
    	Serenity.reportThat("The heading should contains 'Categories' text", 
    	() -> assertThat(firstHeading.getText().contains("Categories")));
    	
    	getDriver().navigate().back();
    }
    
    @Step("This step will click on Indices")
    public void clickIndices() {
    	indices.click(); 
    	Serenity.reportThat("The heading should contains 'Indices' text", 
    	() -> assertThat(firstHeading.getText().contains("Indices")));
    	
    	getDriver().navigate().back();
    }
    
    @Step("This step will click on A-Z indices")
    public void clickAZindices() {
    	AZindex.click(); 
    	Serenity.reportThat("The heading should contains 'A–Z index' text", 
    	() -> assertThat(firstHeading.getText().contains("A–Z index")));
    	
    	getDriver().navigate().back();
    }
    
}
