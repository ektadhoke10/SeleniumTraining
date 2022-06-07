package com.vstl.automate_elements;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.vstl.generics.BaseTest;

public class AutomateLinks extends BaseTest{
	public void getAllLinks() {
		String strlink="";
		List<WebElement> allUrl = driver.findElements(By.tagName("a"));
		System.out.println("Total links on the WebPage: " + allUrl.size());

		//We will iterate through the list and will check the elements in the list.
		Iterator<WebElement> iterator = allUrl.iterator();
		while (iterator.hasNext()) {
			strlink = iterator.next().getText();
			System.out.println(strlink);
		}
	}
	
	
}
