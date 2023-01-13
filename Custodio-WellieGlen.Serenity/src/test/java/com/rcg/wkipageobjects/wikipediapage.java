package com.rcg.wkipageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.rcg.wikipedia.common.basewiki;

public class wikipediapage extends basewiki {
	
	public wikipediapage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	By createaccount = By.id("pt-createaccount");
	public void clickcreateaccount() {
		click(createaccount);	
	}
	By uname = By.id("wpName2");
	public void wpusername (String wpuName) {
		setText(uname, wpuName);
	}
	By wppassword = By.id("wpPassword2");
	public void wikipass (String wpPass) {
		setText(wppassword, wpPass);
	}
	By wprepassword = By.id("wpRetype");
	public void wikirepass (String wprePass) {
		setText(wprepassword, wprePass);
	}
	By wpinputemail = By.id("wpEmail");
	public void wikiemail (String wpemailad) {
		setText(wpinputemail, wpemailad);
	}
	By wpclickcreateaccount = By.id("wpCreateaccount");
	public void wpcreateacct() {
		click(wpclickcreateaccount);
	}
	
	
}
