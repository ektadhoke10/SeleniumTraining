package com.vstl.automate_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.vstl.generics.BaseTest;

public class AutomateRadioButton extends BaseTest{
	public void clickYesRadioButton() {
		WebElement rbutton = driver.findElement(By.xpath("//*[contains(text(),'Yes')]"));
		rbutton.click();
		if (rbutton.isSelected()) {
			System.out.println("RadioButton is selected");
		} else 
			System.out.println("RadioButton is not selected");
	}
	public void clickImpressiveRadioButton() {
		WebElement radioButton = driver.findElement(By.xpath("//*[contains(text(),'Impressive')]"));
		radioButton.click();
		if (radioButton.isSelected()) {
			System.out.println("RadioButton is selected");
		} else 
			System.out.println("RadioButton is not selected");
	}
	
	
}
