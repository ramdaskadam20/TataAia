package com.inetbanking.testCases;

import org.testng.annotations.Test;

import com.inetbanking.pageobject.LoginPage;

import junit.framework.Assert;

public class TC_LoginTest_001 extends BaseClass{
	
@Test
public void loginTest() throws InterruptedException
{
	driver.get(baseURL);
	Thread.sleep(2000);
	LoginPage lp=new LoginPage(driver);
	lp.setUserName(userName);
	lp.setUserPassword(password);
	lp.clickSubmit();
	if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
	{
		Assert.assertTrue(true);
	}
	else
	{
		Assert.assertTrue(false);
	}
	
}
}

