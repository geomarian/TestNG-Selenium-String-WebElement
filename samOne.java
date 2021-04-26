package com.SampleT.One;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class samOne {
	 
	WebDriver driver;
		@BeforeSuite(alwaysRun = true)
	
		public void setUp(){
			
			System.out.println("1");
			System.setProperty("webdriver.chrome.driver", "E:\\GEO\\Selenium Sample\\One\\chromedriver.exe");
			
		}
		@BeforeTest
		public void launchBrowser(){
			
			 
			 //storing the variable in datatype
			
			
		}
		
		@BeforeClass
		public void dataEnter(){
			
			System.out.println("enetr dummmy");
		}
		
		@BeforeMethod
		public void enterURL(){
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
			String url = "http://aiforevery1.com/demo-site//";
			driver.get(url);
			
		}
			

	@AfterMethod
	public void tearDown(){
		driver.quit();
		System.out.println("Quitting the browser");
	}
	@AfterClass
	public void closeBrowser(){
		
		System.out.println("Closing the browser");
	}
	
	
	@AfterTest
	public void deleteAllCookies(){
		System.out.println("All cookies deleted");
	}

	
	
	
/*	@AfterSuite
	public void generateTestReport(){
	System.out.println("8");


	} */
	}


