package com.vstl.automate_demoqaTest;

import com.vstl.demoqa.DatePickerEx;
import com.vstl.generics.BaseTest;

public class TestDatePickerEx {
	public static void main(String[] args) {
		DatePickerEx objDatePikerEx = new DatePickerEx();
		BaseTest.initializeWebdriver("https://demoqa.com/date-picker");
		objDatePikerEx.openCalendar();
		objDatePikerEx.selectdatePicker("August", "1999", "02");
	}
} 
