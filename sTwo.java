package com.SampleT.One;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class sTwo extends samOne  {
	
@Test
public void textInput() throws InterruptedException{
	System.out.println("ok");
	//Name Locater
	//driver.findElement(By.name("vfb-5")).sendKeys("Geo");
	
	WebElement firstName = driver.findElement(By.name("vfb-5"));
	//verify if fN is displayed
	if(firstName.isDisplayed()){
		System.out.println("first name is displayed");
	}
	else{
		System.out.println("first name is not displayed");
	}
	
	//verify FN is enabled.
	if(firstName.isEnabled()) {
		firstName.sendKeys("Geo");
		System.out.println("FN is enabled.");
	}
	else {
		System.out.println("FN is Disabled");
	}
Thread.sleep(3000);
	//get the value of the FN in edit box
	String fneditbox = firstName.getAttribute("type");
	System.out.println(" the FN value is: " + fneditbox);
	// clear cmd
	firstName.clear();
	firstName.sendKeys("Geo" );
	String fneditbox1 = firstName.getAttribute("type");
	System.out.println(" The value present is " + fneditbox1);
	//xpath locater
	driver.findElement(By.xpath("//input[@id='vfb-7']")).sendKeys("mariyan");
	//name locater
	driver.findElement(By.name("vfb-13[address]")).sendKeys("ratnagiri");
	Thread.sleep(2000);
	//id locater
	driver.findElement(By.id("vfb-13-address-2")).sendKeys("landmark");
	
	//css selector
	
	driver.findElement(By.cssSelector("#vfb-13-zip")).sendKeys("Nachane");
	
}

@Test
public void validEmail(){
	driver.findElement(By.cssSelector("#vfb-14")).sendKeys("geo@mailinator.com");
	
	//driver.findElement(By.xpath("//button[contains(text(),'Multiple Windows')]")).click();
}
	//checkbox selection




@Test(priority=3)
	public void handleCheckbox() throws InterruptedException{
	WebElement checkboxes = driver.findElement(By.xpath("//input[@id='vfb-20-0']"));
	if(checkboxes.isDisplayed()){
		System.out.println("Checkbox is displayed" + checkboxes);
	} else
	{
		System.out.println("Checkbox not displayed");
	}
	Thread.sleep(3000);
	if(checkboxes.isSelected()){
		System.out.println("it is selected");
	} else {
		System.out.println("It is not selected.");
		checkboxes.click();
		
	}
	
	//Uncheck the selected value
	Thread.sleep(3000);
	if(checkboxes.isSelected()){
		checkboxes.click();
		System.out.println("checkbox unselected");
	}
	else {
		System.out.println("checkbox NOT selected ");
	}
	
	}
	
	@Test(priority=4)
	
	public void handleRadio(){
	WebElement radioButton = driver.findElement(By.id("vfb-8-1"));
	radioButton.click();
	if(radioButton.isSelected()){
		System.out.println("radio button is selected");
	}
	else{
		System.out.println(" radio button is not selected");
	
	}}
	
	// Dropdown selection
	@Test(priority=5)
	public void dropDown(){
	WebElement countryDropdown = driver.findElement(By.id("vfb-13-country"));
	if(countryDropdown.isDisplayed()){
		System.out.println("Country is displayed");
	} else {
		System.out.println("No Country");
	}
	//selecting the object
	}

	@Test(priority=6)
//Submit button:
	public void submitButton(){
	WebElement submitButton = driver.findElement(By.name("vfb-submit"));
	//verify the submit button is displayed
	if(submitButton.isDisplayed()){
		System.out.println("button is displayed.");
	}
	else {
		System.out.println("Button not visible");
	}
	if(submitButton.isEnabled()){
		submitButton.click();
		System.out.println("Submit button is clicked");
	}
}
}
