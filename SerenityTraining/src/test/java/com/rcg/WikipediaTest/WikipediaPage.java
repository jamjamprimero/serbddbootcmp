// Alforte, Ryan Mark - Changing WINDOW from Wikipedia to View History Page


package com.rcg.WikipediaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WikipediaPage {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); //open Chrome
		driver.manage().window().maximize();
		
		
		driver.get("https://en.wikipedia.org/wiki/Main_Page"); // Navigate to Website
//		Select select = new Select(driver.findElement(By.linkText("mw-list-item collapsible")));
//		select.selectByVisibleText("mw-list-item collapsible"); // Select from drop down using text
		
		driver.switchTo().newWindow(WindowType.WINDOW).get("https://en.wikipedia.org/w/index.php?title=Main_Page&action=history");
		
		
//		driver.quit();
	}

}
