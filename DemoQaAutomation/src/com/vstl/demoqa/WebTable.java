package com.vstl.demoqa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.vstl.generics.BaseTest;

public class WebTable extends BaseTest {
	String strFirstName;
	String strLastName;
	public void clickAddButton() {
		WebElement addButton = driver.findElement(By.xpath("//button[@id='addNewRecordButton']"));
		addButton.click();
	}

	public void getFirstNameForAddingNewRecord(String strFirstName) {
		WebElement setFirstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		setFirstName.sendKeys(strFirstName);
		this.strFirstName=strFirstName;
	}

	public void getLastNameForAddingNewRecord(String strLastName) {
		WebElement setLastName = driver.findElement(By.xpath("//input[@id='lastName']"));
		setLastName.sendKeys(strLastName);
		this.strLastName=strLastName;
	}

	public void getEmailForNewRecord(String strEmail) {
		WebElement setEmail = driver.findElement(By.xpath("//input[@id='userEmail']"));
		setEmail.sendKeys(strEmail);
	}

	public void getAgeForNewRecord(String strAge) {
		WebElement setAge = driver.findElement(By.xpath("//input[@id='age']"));
		setAge.sendKeys(strAge);
	}

	public void getSalaryForNewRecord(String strSalary) {
		WebElement setSalary = driver.findElement(By.xpath("//input[@id='salary']"));
		setSalary.sendKeys(strSalary);
	}

	public void getDepartmentForNewRecord(String strDept) {
		WebElement setDepartment = driver.findElement(By.xpath("//input[@id='department']"));
		setDepartment.sendKeys(strDept);
	}

	public void clickOnSubmitButton(String strEmailId) {
		WebElement submitButton = driver.findElement(By.xpath("//button[@id='submit']"));
		submitButton.click();

		//verify record is added or not using email id
		WebElement TableData = driver.findElement(By.xpath("//div[@class='rt-table']"));
		String strTableData = TableData.getText();
		
		//System.out.println(strTableData);
		
		if(strTableData.contains(strEmailId)) {
			System.out.println("Record is added Successfully");
		}else {
			System.out.println("Record not found");
		}

	}

	public void deleteRecord(int intRecordNumber) {
		driver.findElement(By.xpath("//span[@id='delete-record-"+intRecordNumber+"']")).click();
	}
	
	//verify record is present or not using text
	public void verifyRecordAddedOrNot() {
		List<WebElement> tableData= driver.findElements(By.xpath("//*[contains(text(),'Ekta')]"));
		if ( tableData.size() > 0){
			System.out.println("Record is added successfully");
		} else {
			System.out.println("Record is not added");
		}

	}

}
