package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.sun.media.jfxmedia.logging.Logger;

public class ELearning_UserList_ELTC_019_POM {
	
private WebDriver driver; 
	
	public ELearning_UserList_ELTC_019_POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);

}
	
	@FindBy(xpath="//a[contains(text(),'Administration')]")
	private WebElement loginAdmin; 
	
	public void clickAdministration() {
		this.loginAdmin.click(); 
	}
	
	
	@FindBy(xpath="//div[@class='panel panel-default block-admin-users']//a[contains(text(),'User list')]")
	private WebElement loginUserList;
	
	
	public void clickUserList()
	{
		this.loginUserList.click();
	}
	
	@FindBy(xpath="//input[@value=17]")
	private WebElement SelectUser;
	
	public void Selectuser()
	{
	this.SelectUser.click();	
	}
	
	
	@FindBy(xpath="//tr[3]//td[11]//a[5]//img[1]")
	private WebElement ClickEdit;
	
	public void ClickEdit()
	{
		this.ClickEdit.click();
	}
	
	
	
		
	}
	
	

