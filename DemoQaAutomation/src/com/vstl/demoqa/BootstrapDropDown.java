package com.vstl.demoqa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.vstl.generics.BaseTest;

public class BootstrapDropDown extends BaseTest{
	public void selectBootstrapDropdown(String strOption) {

		// click on menu item then only dropdown items will display
		driver.findElement(By.xpath(".//*[@id='menu1']")).click();
		BaseTest.implicitWait(10);
		
		// elements and findElements will return list of WebElements
		List<WebElement> listOfOptionInDropDown = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));
		int intLIstSize =listOfOptionInDropDown.size();
		System.out.println("intLIstSize: "+intLIstSize);
		// We are using enhanced for loop to get the elements
		
		for (WebElement webElement : listOfOptionInDropDown)
		{
			// for every elements it will print the name using innerHTML
			System.out.println("Values: " + webElement.getAttribute("innerHTML"));
			// Here we will verify if link (item) is equal to Java Script
			if (webElement.getText().trim().equals(strOption)) {
				// if yes then click on link (item)
				webElement.click();
				// break the loop or come out of loop
				break;

			}

		}

	}
}
