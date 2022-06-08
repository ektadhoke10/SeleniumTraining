package com.vstl.demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.vstl.generics.BaseTest;

public class Frames extends BaseTest{
	public void getTotalIFramesOnPage() {
		int totalIFramesOnPage = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Number of Frames on a Page:" + totalIFramesOnPage);
	}
	public void getHeadingOfFrame() {
		//Locate the frame1 on the webPage
		WebElement frame1=driver.findElement(By.id("frame1")); 
		//Switch to Frame1
		driver.switchTo().frame(frame1);

		//Locate the Element inside the Frame1
		WebElement frame1Element= driver.findElement(By.tagName("body"));

		//Get the text for frame1 element
		String frame1Text=frame1Element.getText();
		System.out.println("Frame1 Heading is :"+frame1Text);

		//Number of Frames on a Frame1
		int countIframesInFrame1 =driver.findElements(By.tagName("iframe")).size();
		System.out.println("Number of iFrames inside the Frame1:" + countIframesInFrame1); 
	}

	public void nastedFrame() {
		WebElement pageHeadingElement=driver.findElement(By.xpath("//div[@class='main-header']"));
		String pageHeading=pageHeadingElement.getText();
		System.out.println("Page Heading is :"+pageHeading);

		//Switch to Parent frame
		WebElement frame1=driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame1);
		WebElement frame1Element= driver.findElement(By.tagName("body"));
		String frame1Text=frame1Element.getText();
		System.out.println("Frame1 is :"+frame1Text);

		//Switch to child frame
		driver.switchTo().frame(0);
		WebElement frame2Element= driver.findElement(By.tagName("p"));
		String frame2Text=frame2Element.getText();
		System.out.println("Frame2 is :"+frame2Text);

		//Switch to default content
		driver.switchTo().defaultContent();

		//Try to print the heading of the main page without swithcing
		WebElement mainPageText=driver.findElement(By.xpath("//*[@id='framesWrapper']/div[1]"));
		System.out.println(mainPageText.getText());
	}

}
