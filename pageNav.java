package com.SampleT.One;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class pageNav extends samOne{
		
	@Test(enabled=false)
	
	public void navigation(){
		//click on link
		driver.findElement(By.xpath("//span[contains(text(),'Python For Data Science')]")).click();
		//naviagate back
		
		driver.navigate().back();
		//navigate forward
		driver.navigate().forward();
		//refresh the browser
		driver.navigate().refresh();
		//navigate to other page
		driver.navigate().to("https://nxtgenaiacademy.com/numpy/");
		
	}
	
	@Test(dependsOnMethods={"navigation"})
	public void failTest(){
		Assert.assertEquals("Geo","Geo");
		
		Assert.assertEquals(1, 2);
		Assert.assertTrue(1>3);
		Assert.assertFalse(1<3);
		
	}
}
