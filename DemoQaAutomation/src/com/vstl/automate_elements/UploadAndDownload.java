package com.vstl.automate_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.vstl.generics.BaseTest;

public class UploadAndDownload extends BaseTest{
	public void uploadFile() {
		// Locating upload button
		WebElement upload = driver.findElement(By.id("uploadFile"));
		//Upload the file
		upload.sendKeys("C:\\Users\\HP\\OneDrive\\Desktop\\locators.txt");
		String Message = driver.findElement(By.id("uploadedFilePath")).getText();
		System.out.println("file uploaded :" + Message);

	}

	String strFile;
	public  void downloadFile() {
		driver.findElement(By.xpath("//a[@id=\"downloadButton\"]")).click();
	}
}






