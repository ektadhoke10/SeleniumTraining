package com.vstl.mouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.vstl.generics.BaseTest;

public class DragAndDrop extends BaseTest{
	public void perfromDragAndDrop() {
		Actions builder = new Actions(driver);
		 
		WebElement from = driver.findElement(By.id("draggable"));
		 
		WebElement to = driver.findElement(By.id("droppable"));	 
		//Perform drag and drop
		builder.dragAndDrop(from, to).perform();
		
		//verify text changed in to 'Drop here' to 'Dropped!'
		String textTo = to.getText();

		if(textTo.equals("Dropped!")) {
			System.out.println("PASS: dropped to target as expected");
		}else {
			System.out.println("FAIL: couldn't be dropped to target as expected");
		}
	}
	
}
