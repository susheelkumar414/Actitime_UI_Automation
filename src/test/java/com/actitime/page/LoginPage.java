package com.actitime.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="username")
	private WebElement username;
	
	@FindBy(name="pwd")
	private WebElement password;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;

	
	public void signin(String un,String pw){
		username.sendKeys(un);
		password.sendKeys(pw);
		loginButton.click();               
		
		
	}

}
