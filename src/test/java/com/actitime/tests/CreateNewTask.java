package com.actitime.tests;


import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.actitime.page.LoginPage;
import com.actitime.page.TasksPage;

public class CreateNewTask extends BaseClass {
	
	String custName;

	
	@Parameters({"browserType"})
	@Test
	public void createTaskTest(String sBrowserType ) throws InterruptedException{
		String browserType= sBrowserType;
		String os="mac";
		if(browserType.equalsIgnoreCase("firefox") && (os.equalsIgnoreCase("mac")))
		{
			//System.setProperty("webdriver.gecko.driver","/Users/swadageri/Actitime_UI_Automation/src/test/resources/geckodriver");
			WebDriver driver=new FirefoxDriver();
			this.driver=driver;

		}
		
		else if(browserType.equalsIgnoreCase("chrome") && (os.equalsIgnoreCase("mac")))
		{
			//System.setProperty("webdriver.chrome.driver","/Users/swadageri/Actitime_UI_Automation/src/test/resources/chromedriver");
			WebDriver driver=new ChromeDriver();
			this.driver=driver;
		}
		driver.get("https://online.actitime.com/some/login.do");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		LoginPage lp=new LoginPage(driver);
		lp.signin("susheelkumar414","QUbaguDu");
		System.out.println("signin has been done successfully");
		TasksPage tp=new TasksPage(driver);
		tp.taskButton();
		
		custName=randomName();
		//tp.createNewTask("c" + custName, "obill");
		
		}
	
		  
		  public String randomName(){
		    //generate random UUIDs
		    UUID idOne = UUID.randomUUID();
		    //UUID idTwo = UUID.randomUUID();
		    //log("UUID Two: " + idTwo);
		    System.out.println(idOne);
		    String customName=String.valueOf(idOne);
		    return customName;
		  }
		  
		 
		} 




