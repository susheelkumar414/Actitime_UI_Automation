package com.actitime.tests;


import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.actitime.page.LoginPage;
import com.actitime.page.TasksPage;

public class CreateNewTask extends BaseClass {
	String browserType="Chrome";
	String custName;
	String os="mac";
	@Test
	public void createTaskTest(){
		//if(browserType.equalsIgnoreCase("Chrome") && (os.equalsIgnoreCase("windows")))
		//{
		//System.setProperty("webdriver.chrome.driver","C:\\selenium drivers\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		//}
		//else{
		/*System.setProperty("webdriver.gecko.driver","C:\\selenium drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();	*/
		/*		TasksPage tp=new TasksPage(driver);
		tp.taskButton();
		
		custName=randomName();
		tp.createNewTask("c" + custName, "obill");
		
		}*/
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




