package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.pom.ELearning_AddUser_ELTC_020_POM;
import com.training.pom.ELearning_DeleteCourse_ELTC_021_POM;
import com.training.pom.ELearning_UserList_ELTC_019_POM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELearning_DeleteCourse_ELTC_021 {
	
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private ELearning_DeleteCourse_ELTC_021_POM DeleteCoursePOM;
	private static Properties properties;



@BeforeClass
	public static void setUpBeforeClass() throws IOException {
	properties = new Properties();
	FileInputStream inStream = new FileInputStream("./resources/others.properties");
	properties.load(inStream);
}
@BeforeMethod
	public void setUp() throws Exception {
	driver = DriverFactory.getDriver(DriverNames.CHROME);
	loginPOM = new LoginPOM(driver); 
	DeleteCoursePOM = new ELearning_DeleteCourse_ELTC_021_POM(driver);
	baseUrl = properties.getProperty("baseURL");
	driver.get(baseUrl);
}

@AfterMethod
public void tearDown() throws Exception {
	Thread.sleep(1000);
	driver.quit();
}


@Test
public void validLoginTest() {
	loginPOM.sendUserName("admin");
	loginPOM.sendPassword("admin@123");
	loginPOM.clickLoginBtn(); 
	
	DeleteCoursePOM.clickAdministration();
	System.out.println("administration link clicked");
	DeleteCoursePOM.ClickCourseList();
	System.out.println("ClickCourseList link clicked");
	DeleteCoursePOM.ClickDeleteIcon();
	System.out.println("click delete icon clicked");
	driver.close();
}



}