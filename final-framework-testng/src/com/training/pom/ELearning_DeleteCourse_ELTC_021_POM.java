package com.training.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ELearning_DeleteCourse_ELTC_021_POM {
	
private WebDriver driver; 
	
	public ELearning_DeleteCourse_ELTC_021_POM(WebDriver driver)
	{
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[contains(text(),'Administration')]")
	private WebElement loginAdmin; 
	
	public void clickAdministration() {
		this.loginAdmin.click(); 
	}
	
	
	@FindBy(xpath="//a[contains(text(),'Course list')]")
	private WebElement CourseList;
	
	public void ClickCourseList()
	{
		this.CourseList.click();
	}
	
	@FindBy(xpath="//tr[5]//td[8]//a[6]//img[1]")
	private WebElement clickdeleteicon;
	
	public void ClickDeleteIcon()
	{
		this.clickdeleteicon.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}
	
}
