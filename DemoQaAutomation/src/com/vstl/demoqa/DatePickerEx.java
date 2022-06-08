package com.vstl.demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import com.vstl.generics.BaseTest;

public class DatePickerEx extends BaseTest{
	public void openCalendar() {
		WebElement Calendar = driver.findElement(By.xpath("//input[@id='datePickerMonthYearInput']"));
		Calendar.click();
	}
	
	public void selectMonth(String strMonth) {
		WebElement MonthDropdown = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Select Month = new Select(MonthDropdown);
		Month.selectByVisibleText(strMonth);
	}
	
	public void selectYear(String strYear) {
		WebElement YearDropdown = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		Select Year = new Select(YearDropdown);
		Year.selectByVisibleText(strYear);
	}
	
	public void selectDate(String strDate) {
		WebElement selectDate = driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--0"+strDate+"']"));
		selectDate.click();
	}
	
	public void selectdatePicker(String strMonth, String strYear, String strDate) {
		this.selectMonth(strMonth);
		this.selectYear(strYear);
		this.selectDate(strDate);
	}

}
