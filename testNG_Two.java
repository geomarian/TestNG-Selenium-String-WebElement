package com.testNg.test1;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testNG_Two extends tNG_One {
	
	
	@Parameters("email")
	@Test
	public void checkParameter(String email){
		System.out.println(email);
	}
	

	 

	
	
/*	@Test
		public void homeImageBottom(){
			WebElement stableImg = driver.findElement(By.xpath("//body/div[@id='pagewrap']/div[@id='footerwrap']/footer[@id='footer']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]"));
			if(stableImg.isDisplayed()){
				System.out.println("image is displayed");
				//verify the value
				System.out.println(" Image text is " + stableImg.getAttribute("alt"));
			}
			else {
				System.out.println("Image is not displayed");
			
		} 
			
	}	
		
		
		@Test
		public void countLinks(){
			List<WebElement> links = driver.findElements(By.xpath("//*"));
					//driver.findElement(By.xpath("//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/img[1]"));
			int linkCount=links.size();
			  System.out.println("Total Number of link count on webpage = "  + linkCount);    //Print the total count of links on webpage
		
			  List<WebElement> allElements = driver.findElements(By.xpath("//*"));      //Identify all the elements on web page
	          
	          int elementsCount = allElements.size();     //Count the total all element on web page
	          
	          System.out.println("Total Number of All Element on webpage = "  + elementsCount);         //Print the total count of all element on webpage
		
		}
	*/
	
	
}

