package com.vstl.automate_elements;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.vstl.generics.BaseTest;

public class AutomateButtons extends BaseTest {

	public void clickDoubbleClickButton() {
		Actions actions = new Actions(driver); 
		
		//Retrieve WebElement to perform double click WebElement
		WebElement btnElement = driver.findElement(By.id("doubleClickBtn")); 
		
		//Double Click the button 
		actions.doubleClick(btnElement).perform(); 
		
		System.out.println("Button is double clicked"); 
		
	}
	
	public void clickRightButton() {
		//Instantiate Action Class
		Actions actions = new Actions(driver);
		
		WebElement btnElement = driver.findElement(By.id("rightClickBtn"));

		//Right Click the button 
		actions.contextClick(btnElement).perform();
		System.out.println("Right click");

	}
	
//	public void clickButton() {
//		driver.findElement(By.id("HxAFr")).click();
//		System.out.println("click done");
//	}
}

