package com.vstl.automate_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.vstl.generics.BaseTest;

public class AutomateCheckBox extends BaseTest{
	public void clickSvgToggleIcon() {
		driver.findElement(By.xpath("//button[@class='rct-collapse rct-collapse-btn']")).click();
	}

	public void clickDesktopCheckBox() {
		WebElement checkBox= driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[1]/span/label/span[3]"));
		checkBox.click();
		if (checkBox.isSelected()) {
			System.out.println("CheckBox is selected");
		} else 
			System.out.println("CheckBox is not selected");
	}
}






