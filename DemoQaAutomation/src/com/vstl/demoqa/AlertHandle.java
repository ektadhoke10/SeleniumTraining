package com.vstl.demoqa;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.vstl.generics.BaseTest;

public class AlertHandle extends BaseTest {
	public void simpleAlert() {
		driver.findElement(By.id("alertButton")).click();
		Alert simpleAlert = driver.switchTo().alert();
		simpleAlert.accept();

	}

	public void acceptConformationAlert() {
		driver.findElement(By.id("confirmButton")).click();
		Alert confirmationAlert = driver.switchTo().alert();
		String alertText = confirmationAlert.getText();
		System.out.println("Alert text is: " + alertText);
		confirmationAlert.accept();
	}
	
	public void dismissConformationAlert() {
		driver.findElement(By.id("confirmButton")).click();
		Alert confirmationAlert = driver.switchTo().alert();
		String alertText = confirmationAlert.getText();
		System.out.println("Alert text is: " + alertText);
		confirmationAlert.dismiss();
	}
	
	public void timerAlert() {
		try {
			driver.findElement(By.id("timerAlertButton")).click();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.alertIsPresent());
			Alert simpleAlert = driver.switchTo().alert();
			simpleAlert.accept();
			System.out.println("Unexpected alert accepted");
		} catch (Exception e) {
			System.out.println("unexpected alert not present");
		}
	}
	
	public void promptAlert() {
		driver.findElement(By.id("promtButton")).click();
		Alert promptAlert  = driver.switchTo().alert();
		String alertText = promptAlert.getText();
		System.out.println("Alert text is: " + alertText);
		//Send some text to the alert
		promptAlert.sendKeys("VSTL");
		promptAlert.accept();
	}


}
