package com.vstl.automate_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.vstl.generics.BaseTest;

public class AutomateBrokenLinks extends BaseTest {

	public void getBrokenLinks() {
		List<WebElement> links = driver.findElements(By.tagName("a"));

		// This line will print the number of links and the count of links.
		System.out.println("No of links are "+ links.size());  
		//checking the links fetched.
		for(int index=0;index<links.size();index++)
		{
			WebElement element= links.get(index);
			String strUrl= element.getAttribute("href");
			verifyLinks(strUrl);
		}
	}
	
	public void getBrokenImages() {
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Total number of Images on the Page are " + images.size());


		//checking the links fetched.
		for(int index=0;index<images.size();index++)
		{
			WebElement image= images.get(index);
			String imageURL= image.getAttribute("src");
			System.out.println("URL of Image " + (index+1) + " is: " + imageURL);
			verifyLinks(imageURL);
		} 
		//Validate image display using JavaScript executor
		try {
			boolean imageDisplayed = (Boolean) ((JavascriptExecutor) driver).executeScript("return (typeof arguments[0].naturalWidth !=\"undefined\" && arguments[0].naturalWidth > 0);", images);
			if (imageDisplayed) {
				System.out.println("DISPLAY - OK");
			}else {
				System.out.println("DISPLAY - BROKEN");
			}
		} 
		catch (Exception e) {
			System.out.println("Error Occured");
		}
	}


}

