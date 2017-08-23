package com.actitime.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.page.LoginPage;

public class BaseClass {
	
	WebDriver driver;
	String Browser;
	
	
	/*@BeforeClass
	public void launchApplication(){
		System.out.println("open browser and launch application");
		System.setProperty("webdriver.chrome.driver","C:\\selenium drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1/login.do;jsessionid=6r8m2oa9c5t8k");
		
	}
	
	@AfterClass
	public void quitApplication(){
		System.out.println("quit browser and application");
		
	}
	@BeforeMethod
	public void loinApp(){
		LoginPage lp=new LoginPage(driver);
		lp.signin("admin","manager");
		System.out.println("login to the application application");
		

		
	}
	@AfterMethod
	public void logoutApp(){
		
	}*/
   
}

