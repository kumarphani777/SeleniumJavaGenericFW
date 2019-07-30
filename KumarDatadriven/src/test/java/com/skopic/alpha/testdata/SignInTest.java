package com.skopic.alpha.testdata;

import org.testng.Assert;
import org.testng.annotations.Test;


import com.skopic.alpha.pages.LandingPage;

public class SignInTest extends BaseTest {
	
	

	
	
	@Test(priority=1)
	public void verifySTitleTest(){
		String title = page.getInstance(LandingPage.class).getLoginPageTitle();
		System.out.println("login page title is: "+ title);
		Assert.assertEquals(title, ".:: Skopic ::.");
	}
	
	@Test(priority=2)
	public void loginTest(){
		page.getInstance(LandingPage.class).doLogin("chelluboyinaphanikumar@gmail.com", "9700740034");
	}
	



}
