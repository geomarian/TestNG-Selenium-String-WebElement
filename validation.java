package com.SampleT.One;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class validation extends samOne {
	@Test
	public void sSubmit(){
	WebElement submitButton1 = driver.findElement(By.name("vfb-submit"));
	//verify the submit button is displayed
	if(submitButton1.isDisplayed()){
		System.out.println("button is displayed.");
	}
	else {
		System.out.println("Button not visible");
	}
	if(submitButton1.isEnabled()){
		submitButton1.click();
		System.out.println("Submit button is clicked");
	}
	}
	@Test
	public void valid(){
		WebElement nameErrMsg = driver.findElement(By.cssSelector("#vfb-4"));
		
			
		//validating sec
		
		String expectedText = "This field is required.";
		String actualText= nameErrMsg.getText();
		
		if(actualText.equals(expectedText)){
			System.out.println("Yes warning"+ actualText);
		} else
		{
			System.out.println("NOPE" + actualText);
		}
	}
}
