package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.ELearning_AddUser_ELTC_020_POM;
import com.training.pom.ELearning_UserList_ELTC_019_POM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginTests {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private ELearning_UserList_ELTC_019_POM ELearningPOM;
	private ELearning_AddUser_ELTC_020_POM AddUserPOM;
	private static Properties properties;
	//private ScreenShot screenShot;

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
		ELearningPOM=new ELearning_UserList_ELTC_019_POM(driver);
		 AddUserPOM=new ELearning_AddUser_ELTC_020_POM(driver);
		baseUrl = properties.getProperty("baseURL");
	//	screenShot = new ScreenShot(driver); 
		// open the browser 
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
		
		ELearningPOM.clickAdministration();
		System.out.println("administration link clicked");
		ELearningPOM.clickUserList();
		System.out.println("user list link clicked");
		ELearningPOM.Selectuser();
		System.out.println("user checkboxselected");
		ELearningPOM.ClickEdit();
		System.out.println("edit img clicked");
		
		String title=driver.getTitle();
		System.out.println(title);
		//driver.navigate().back();
		//driver.navigate().back();
		//driver.navigate().refresh();
		
		//AddUserPOM.clickAdministration();
		//System.out.println("administration link clicked");
		
		ELearningPOM.clickAdministration();
		System.out.println("administration link clicked");
		loginPOM = new LoginPOM(driver); 
		
		AddUserPOM.ClickAddUser();
		System.out.println("add user link clicked");
		AddUserPOM.AddFirstName();
		System.out.println("first name added");
		AddUserPOM.AddLastName();
		System.out.println("last name added");
		AddUserPOM.AddEmail();
		System.out.println("email added");
		AddUserPOM.AddPhone();
		System.out.println("phone number added");
		AddUserPOM.AddUserName();
		System.out.println("user name added");
		AddUserPOM.AddPassword();
		System.out.println("password added");
		AddUserPOM.EnterPassword();
		System.out.println("password added");
		AddUserPOM.SelectProfile();
		System.out.println("profile added");
		AddUserPOM.ClickAdd();
		System.out.println("user added");
		
		
	}
}
