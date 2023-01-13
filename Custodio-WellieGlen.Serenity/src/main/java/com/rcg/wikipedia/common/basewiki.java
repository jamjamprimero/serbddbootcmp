package com.rcg.wikipedia.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class basewiki {
	
	protected WebDriver driver;
	
	public basewiki(WebDriver driver) {
		this.driver = driver;	
	}
	
	
	public void click(By by) {
		WebElement element = driver.findElement(by);
		element.click();
	}
	public void setText (By by, String value) {
		WebElement element = driver.findElement(by);
		element.sendKeys(value);
	}
	

}
