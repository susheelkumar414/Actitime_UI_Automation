package com.actitime.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.actitime.page.LoginPage;

public class SigninTest extends BaseClass {
	
	@Parameters({"browserType"})
	@Test
	
	public void signInTest(String sBrowserType){
		String browserType= sBrowserType;
		String os="mac";
		if(browserType.equalsIgnoreCase("firefox") && (os.equalsIgnoreCase("mac")))
		{
			System.setProperty("webdriver.gecko.driver","/Users/swadageri/Actitime_UI_Automation/src/test/resources/geckodriver");
			WebDriver driver=new FirefoxDriver();
			this.driver=driver;

		}
		
		else if(browserType.equalsIgnoreCase("chrome") && (os.equalsIgnoreCase("mac")))
		{
			System.setProperty("webdriver.chrome.driver","/Users/swadageri/Actitime_UI_Automation/src/test/resources/chromedriver");
			WebDriver driver=new ChromeDriver();
			this.driver=driver;
		}

		
		driver.get("https://online.actitime.com/some/login.do");
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		LoginPage lp=new LoginPage(driver);
		lp.signin("susheelkumar414","QUbaguDu");
		System.out.println("signin has been done successfully");
		

	}

	}
