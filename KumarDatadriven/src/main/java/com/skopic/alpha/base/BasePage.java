package com.skopic.alpha.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends Page{

	public BasePage(WebDriver driver) {
		super(driver);
	
	}
	
	//Click 
	public void doClick(By locator) {
		driver.findElement(locator).click();
	}
	
	//Input
	public void doSendKeys(By locator, String text) {
		
		driver.findElement(locator).clear();
		driver.findElement(locator).sendKeys(text);
	}
	
	// Get Text
	public String doGetText(By locator) {
		return driver.findElement(locator).getText();
	}
	
	// Alert commands 
	public String alertText() {
		String alertcontent = driver.switchTo().alert().getText();
		
		return alertcontent;
	}
	public void alertAccept() {
		driver.switchTo().alert().accept();
		
	}
	public void alertReject() {
		
	driver.switchTo().alert().dismiss();
	}
	
	//Verification commands (isSelected / isEnabled / isDisplayed)
	
	public boolean elementSelected(By locator) {
		
		boolean flag = driver.findElement(locator).isSelected();	
		return flag;
	}
	public boolean elementDisplayed(By locator) {
		
		boolean flag = driver.findElement(locator).isDisplayed();	
		return flag;
	}
	public boolean elementEnabled(By locator) {
		
		boolean flag = driver.findElement(locator).isEnabled();
		return flag;
	}
	
	// check/ uncheck the checkbox functionality
	
	public void checkBox(By locator) {
		
		if (!driver.findElement(locator).isSelected()) {
			driver.findElement(locator).click();
		}
	}
	
	public void UncheckBox(By locator) {
		
		if (driver.findElement(locator).isSelected()) {
			driver.findElement(locator).click();
		}
	}
	
	//for messages edit / delete/ report/ send message to users it will use full
	public void hiddenElement(By locator) {
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		
		WebElement hiddenButton = driver.findElement(locator);
		String script = "arguments[0].click();";
		js.executeScript(script, hiddenButton);
	}
	
	
	
	
	
	//List of elements
	public List<WebElement> listOfElements(By locator){
		
		List <WebElement> linkList = driver.findElements(locator);
		
		/*  //for verification or set condition tester can use this text functionality
		for(int i=0; i<linkList.size(); i++){
			String linkText = linkList.get(i).getText();
		System.out.println(linkText);	
		}*/
		return linkList;
	}
	
	
}
