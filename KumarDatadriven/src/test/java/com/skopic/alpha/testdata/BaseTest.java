package com.skopic.alpha.testdata;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.skopic.alpha.base.Page;



public class BaseTest {

	public WebDriver driver;
	public WebDriverWait wait;
	public Page page;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\kalyan's\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		wait = new WebDriverWait(driver, 15);
		driver.manage().window().fullscreen();
		driver.get("http://alpha.skopic.com/index/login.html ");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// create the object of page class: Instantiate Page Class
		page = new Page(driver);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}



}
