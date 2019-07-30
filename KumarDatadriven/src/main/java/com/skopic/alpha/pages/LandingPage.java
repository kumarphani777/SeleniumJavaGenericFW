package com.skopic.alpha.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.skopic.alpha.base.BasePage;

public class LandingPage extends BasePage {
	
	public LandingPage(WebDriver driver) {
		super(driver);
	
	}
	By emailId = By.id("si_txt_email");
	By password = By.id("si_txt_pwd");
	By loginButton = By.id("signIn");

	//page actions:
		public String getLoginPageTitle(){
			return driver.getTitle();
		}
		
		public void doLogin(String username, String pwd){
			doSendKeys(emailId, username);
			doSendKeys(password, pwd);
			doClick(loginButton);
			
		}
		
}
