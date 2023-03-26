package com.inetbanking.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//input[@name='uid']")
	private WebElement txtusername;
	
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement txtpassword;
	
	@FindBy(xpath="//input[@name='btnLogin']")
	private WebElement btnlogin;
	
	public void setUserName(String uname)
	{
		txtusername.sendKeys(uname);
	}
	public void setUserPassword(String pwd)
	{
		txtpassword.sendKeys(pwd);
	}
	public void clickSubmit()
	{
		btnlogin.click();
	}

}
