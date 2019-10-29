package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ELearning_AddUser_ELTC_020_POM {

	
private WebDriver driver; 
	
	public ELearning_AddUser_ELTC_020_POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);

}
	
	@FindBy(xpath="//a[contains(text(),'Administration')]")
	private WebElement loginAdmin; 
	
	public void clickAdministration() {
		this.loginAdmin.click(); 
	}
	
	@FindBy(xpath="//a[contains(text(),'Add a user')]")
	private WebElement AddUser;
	
	public void ClickAddUser()
	{
		this.AddUser.click();
	}
	
	@FindBy(id="firstname")
	private WebElement FirstName;
	
	public void AddFirstName()
	{
		this.FirstName.sendKeys("reva");
	}
	
	
	@FindBy(id="lastname")
	private WebElement LastName;
	
	public void AddLastName()
	{
		this.LastName.sendKeys("sharma");
	}
	
	
	@FindBy(id="email")
	private WebElement Email;
	
	public void AddEmail()
	{
		this.Email.sendKeys("revasharma@gmail.com");
	}
	
	
	
	@FindBy(id="phone")
	private WebElement Phone;
	
	public void AddPhone()
	{
		this.Phone.sendKeys("9876543210");
	}
	
	
	
	@FindBy(id="username")
	private WebElement UserName;
	
	public void AddUserName()
	{
		this.UserName.sendKeys("reva");
	}
	
	
	@FindBy(xpath="//label[contains(text(),'Enter password')]")
	private WebElement Password;
	
	public void AddPassword()
	{
		this.Password.click();
	}
	
	
	@FindBy(id="password")
	private WebElement Enterpassword;
	
	public void EnterPassword()
	{
		this.Enterpassword.sendKeys("reva321");
	}
	
	
		
	@FindBy(id="status_select")
	private WebElement Selectprofile;
	
	public void SelectProfile()
	{
		
		new Select (Selectprofile).selectByVisibleText("Trainer");
		
	}
	
	
	
	@FindBy(xpath="//button[@name='submit']")
	private WebElement Clickadd;
	
	public void ClickAdd()
	{
		this.Clickadd.click();
		
	}
	
	
}
