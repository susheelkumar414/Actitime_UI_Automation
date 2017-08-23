package com.actitime.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.actitime.page.LoginPage;

public class SigninTest extends BaseClass {
	
	@Test
	public void SignInTest(){
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1/login.do;jsessionid=6r8m2oa9c5t8k");
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		LoginPage lp=new LoginPage(driver);
		lp.signin("admin","manager");
		
	}

}
