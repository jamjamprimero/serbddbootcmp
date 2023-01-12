package starter.common;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
	
	protected WebDriver driver;
	protected WebDriverWait wait;
	protected int waitTime = 10;
	
	public BasePage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(waitTime));
	}

	
	public void click(By by) {
//		WebElement btn = driver.findElement(by);
		WebElement btn = null;
		btn = wait.until(ExpectedConditions.elementToBeClickable(by));
        btn.click(); 
	}
	
	public String getText(By by) {
//		WebElement confirm = driver.findElement(by);
		WebElement confirm = null;
		confirm = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		return confirm.getText();
	}


}
