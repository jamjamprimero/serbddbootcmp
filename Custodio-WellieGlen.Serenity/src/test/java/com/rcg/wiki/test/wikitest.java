package com.rcg.wiki.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Test;


import com.rcg.wikipedia.common.wikipediatest;
import com.rcg.wkipageobjects.wikipediapage;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;


public class wikitest extends wikipediatest{
	
	@Test
	public void wikipedia() throws Exception {
		openBrowser("CHROME");
		openURL("https://en.wikipedia.org/wiki/Main_Page");
		
	wikipediapage wpact = new wikipediapage(driver);
		wpact.clickcreateaccount();
		wpact.wpusername("sample100001");
		wpact.wikipass("@Asample000001");
		wpact.wikirepass("@Asample000001");
		wpact.wikiemail("sample123450@gmail.com");
		wpact.wpcreateacct();
	}
	
	@After
	public void tearDown() {
		endTest();
		System.out.println("awitggwp");
		
		

}
}
