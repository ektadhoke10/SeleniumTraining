package com.vstl.demoqa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.vstl.generics.BaseTest;

public class AutoComplete extends BaseTest {

	public void autoCompleteText() {
		driver.findElement(By.name("q")).sendKeys("selenium");

		List<WebElement> autoSuggest = driver.findElements(By.className("UUbT9"));

		// print the auto suggest
		for (WebElement webElement : autoSuggest)
		{
			System.out.println("Values are = " + webElement.getText());
			if (webElement.getText().equalsIgnoreCase("selenium webdriver"));
			webElement.click();
			break;
		}

	}

}