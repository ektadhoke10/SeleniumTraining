package com.vstl.automate_demoqaTest;

import com.vstl.demoqa.AutomateDropDown;
import com.vstl.generics.BaseTest;

public class TestAutomateDropDown {
	public static void main(String[] args) {
		AutomateDropDown objAutomateDropDown = new AutomateDropDown();
		BaseTest.initializeWebdriver("https://demoqa.com/select-menu");
		objAutomateDropDown.getDropDownMenuUsingLoop();
		objAutomateDropDown.selectOptionFromDropDownByIndex();
		objAutomateDropDown.selectOptionFromDropDownByText();
		objAutomateDropDown.selectOptionFromDropDownByValue();
		objAutomateDropDown.multiSelectDropDwon();
		objAutomateDropDown.diselectDropDownOption();
	}
	
}
