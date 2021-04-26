package com.SampleT.One;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BrowserCmd extends sTwo {
	
	@Test(priority=8)
	public void cmd(){
		//storing title name in string variable
		String actualTitle = driver.getTitle();
	
		//storing expected title in string variable
		String expectedTitle = "Demo Site – Registration Form – NxtGen A.I Academy";
		//verification
		if(actualTitle.equals(expectedTitle)){
			System.out.println("The title of the page is:" + actualTitle);
		}
		else{
			System.out.println("No title available");
			System.out.println("Actual title is:" + actualTitle);
			System.out.println("Expected title is:" + expectedTitle);
		}
	}
		
	//navigate to new screen
	@Test
		public void sourceLength(){
			//storing page source in string variable
			String pageSource = driver.getPageSource();
			//printing length of page source
			int pagesourcelength = pageSource.length();
			System.out.println(" The total length is" + pagesourcelength);
			}
		}
