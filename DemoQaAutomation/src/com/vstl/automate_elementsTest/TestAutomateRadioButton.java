package com.vstl.automate_elementsTest;

import com.vstl.automate_elements.AutomateRadioButton;
import com.vstl.generics.BaseTest;

public class TestAutomateRadioButton {
public static void main(String[] args) {
	AutomateRadioButton objAutomateRadioButton =new AutomateRadioButton();
	BaseTest.initializeWebdriver("https://demoqa.com/radio-button");
	objAutomateRadioButton.clickYesRadioButton();
	objAutomateRadioButton.clickImpressiveRadioButton();
	
}
}
