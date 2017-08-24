package com.actitime.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.actitime.page.LoginPage;

public class SigninTest extends BaseClass {
	
	@Test
	public void signInTest(){
		String browserType="chrome";
		String os="mac";
		
		if(browserType.equalsIgnoreCase("Chrome") && (os.equalsIgnoreCase("mac")))
		{
		System.setProperty("webdriver.chrome.driver","/Users/swadageri/Actitime_UI_Automation/src/test/resources/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://online.actitime.com/some/login.do");
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		LoginPage lp=new LoginPage(driver);
		lp.signin("susheelkumar414","QUbaguDu");
		System.out.println("signin has been done successfully");
		

	}

	}}
