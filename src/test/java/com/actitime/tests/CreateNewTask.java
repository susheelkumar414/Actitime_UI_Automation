package com.actitime.tests;


import java.util.Date;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.actitime.page.LoginPage;
import com.actitime.page.TasksPage;

public class CreateNewTask extends BaseClass {
	String browserType="Firefox";
	String custName;
	@Test
	public void createTaskTest(){
		/*if(browserType.equalsIgnoreCase("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver","C:\\selenium drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		}*/
		//else{
		System.setProperty("webdriver.gecko.driver","C:\\selenium drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();	
		
		driver.get("http://127.0.0.1/login.do;jsessionid=6r8m2oa9c5t8k");
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		LoginPage lp=new LoginPage(driver);
		lp.signin("admin","manager");
		
		TasksPage tp=new TasksPage(driver);
		tp.taskButton();
		
		custName=randomName();
		tp.createNewTask("c" + custName, "obill");
		
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




