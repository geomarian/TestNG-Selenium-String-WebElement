package com.testNg.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class dashboard extends tNG_One {
	//edit form
	@Test
	public void myInfo() throws InterruptedException{
		 String url1 = "https://opensource-demo.orangehrmlive.com/index.php/pim/viewMyDetails";
			driver.get(url1);
		Thread.sleep(1000);
		WebElement clickEdit = driver.findElement(By.id("btnSave"));
		clickEdit.click();
	}
// add details
	@Test
	public void addDetails(){
		WebElement fname =  driver.findElement(By.id("personal_txtEmpFirstName"));
		if(fname.isEnabled()){
			fname.clear();
			fname.sendKeys("Geo");
		} else {
			System.out.println("No name added");
			}
		
		WebElement mname = driver.findElement(By.id("personal_txtEmpMiddleName"));
		if(mname.isEnabled()){
			mname.clear();
			mname.sendKeys("S");
		}
		else{
			System.out.println("No middle name");
		}
		
		
		}
	}

