package com.vstl.automate_demoqaTest;

import com.vstl.demoqa.WebTable;
import com.vstl.generics.BaseTest;

public class TestWebTable {

	public static void main(String[] args) {
		WebTable objWebTable = new WebTable();
		BaseTest.initializeWebdriver("https://demoqa.com/webtables");

		objWebTable.clickAddButton();
		objWebTable.getFirstNameForAddingNewRecord("Ekta");
		objWebTable.getLastNameForAddingNewRecord("Dhoke");
		objWebTable.getEmailForNewRecord("ekta@vervesquare.com");
		objWebTable.getAgeForNewRecord("23");
		objWebTable.getSalaryForNewRecord("10000");
		objWebTable.getDepartmentForNewRecord("Testing");
		objWebTable.clickOnSubmitButton("ekta@vervesquare.com");

		System.out.println("==============================");

		objWebTable.deleteRecord(2);
		
		System.out.println("Record deleted..");
		System.out.println("==============================");

		objWebTable.verifyRecordAddedOrNot();
	}
}


