package com.SampleT.One;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ImageCheck extends samOne{

	@Test(priority=7)
	public void img(){
		WebElement stableImg = driver.findElement(By.xpath("//body/div[@id='outer-wrap']/div[@id='wrap']/main[@id='main']/div[@id='content-wrap']/div[@id='primary']/div[@id='content']/article[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/img[1]"));
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
		public void imgLink1(){
			WebElement imgLink = driver.findElement(By.xpath("//header/div[@id='site-header-inner']/div[@id='site-logo']/div[@id='site-logo-inner']/a[1]/img[1]"));
			if (imgLink.isEnabled()){
				System.out.println("Sign In image is enabled");
				imgLink.click();
			}
			else {
				System.out.println("Not clicked on link");
			}
		}
		
		
		//Navigate to new page
		@Test
		public void newpageRedirect() throws InterruptedException{
			driver.navigate().to("https://www.java.com/en/");
			Thread.sleep(7000);
			driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]")).click();
			Thread.sleep(3000);
		}
		
}
