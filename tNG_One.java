package com.testNg.test1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tNG_One {

	public static WebDriver driver;
	
	
	@BeforeSuite //(alwaysRun = true)
	public void startNG() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "E:\\GEO\\Selenium Sample\\test1\\chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().deleteAllCookies();
		System.out.println("Starting Chrome");
	}

	@BeforeTest

	public void initailizeDriver(){



		driver.manage().window().maximize();
		//		 String url = "https://opensource-demo.orangehrmlive.com/";
		//			driver.get(url);

		System.out.println("Driver Initialized");
	}

	@BeforeClass
	public void launchWeb(){
		String url = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";
		driver.get(url);

		System.out.println("Website is open");
	}
	@BeforeMethod
	public void UserCredentials(){

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}



	@Test
	 public void login(){
	 WebElement loginButton = driver.findElement(By.id("btnLogin"));
	 loginButton.click();
	/*   if(loginButton.isDisplayed()){
			System.out.println("button is displayed.");
		}
		else {
			System.out.println("Button not visible");
		}
		if(loginButton.isEnabled()){
			
			System.out.println("Submit button is clicked");  
		} */
	}
	


	//@test cases will run here



	@AfterMethod
	public void screenShot(ITestResult result) throws IOException
	{
		if(ITestResult.FAILURE==result.getStatus()){
			try{
				// To create reference of TakesScreenshot
				TakesScreenshot screenshot=(TakesScreenshot)driver;
				// Call method to capture screenshot
				File src=screenshot.getScreenshotAs(OutputType.FILE);
				// Copy files to specific location 
				// result.getName() will return name of test case so that screenshot name will be same as test case name
				FileUtils.copyFile(src, new File("E:\\GEO\\Selenium Sample\\screeshots"+result.getName()+".png"));
				System.out.println("Successfully captured a screenshot");
			}catch (Exception e){
				System.out.println("Exception while taking screenshot "+e.getMessage());


			}
		}}

	
	@AfterTest
	public void reportReady()
	{
		System.out.println("Report is ready to be shared, with screenshots of tests");
	}

	@AfterClass(description = "close Chrome driver")
	public void close(){
	//	driver.close();
	}



	

	@AfterSuite //(alwaysRun = true)
	public void tearDown(){
		driver.quit();
		System.out.println("Destroy Selenium");
	}

}
