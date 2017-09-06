package com.actitime.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TasksPage {
WebDriver driver;
	
	public TasksPage(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}

	@FindBy(css=".tasks")
	private WebElement tasksButton;
	
	@FindBy(css=".addNewTaskButtonContainer > div:nth-child(1) > div:nth-child(2)")
	private WebElement addNewtasksButto;
	

	@FindBy(css="#ext-gen23")
	private WebElement enableCustomersDropdown;
	
	
	@FindBy(css="#ext-gen23")
	private WebElement selectNewCustomerTab;
	

	@FindBy(css=".createNewTask")
	private WebElement createNewtasksButto;
	
	@FindBy(name="customerId")
	private WebElement customer;

	@FindBy(name="customerName")
	private WebElement customerName;
	
	@FindBy(name="projectName")
	private WebElement projectName;
	
	@FindBy(name="task[0].name")
	private WebElement taskName;
	

	@FindBy(name="task[0].deadline")
	private WebElement deadLine;
	
	@FindBy(name="task[0].markedToBeAddedToUserTasks")
	private WebElement addinguserchckbox;

	@FindBy(xpath=".//*[@id='container']/form[1]/table/tbody/tr/td/table/tbody/tr[5]/td/table/tbody/tr/td/input[1]")
	private WebElement createTasks;

	


	public void taskButton() throws InterruptedException{
		tasksButton.click();
		Thread.sleep(10000);
		addNewtasksButto.click();
		Thread.sleep(5000);

		createNewtasksButto.click();
		
		
	}
	public void createNewTask(String custName,String projName){
		//Select sl=new Select(customer);
		//sl.selectByIndex(1);
		enableCustomersDropdown.click();
		selectNewCustomerTab.click();
		
		customerName.sendKeys(custName);
		projectName.sendKeys(projName);
		taskName.sendKeys("developing");
		deadLine.sendKeys("Apr 15,2017");
		addinguserchckbox.click();
		createTasks.click();
		
		
		
	}
	
	
	
}
