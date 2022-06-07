package com.vstl.automate_elementsTest;

import com.vstl.automate_elements.AutomateButtons;
import com.vstl.generics.BaseTest;

public class TestAutomateButtons {
public static void main(String[] args) {
	AutomateButtons objAutomateButtons =new AutomateButtons();
	BaseTest.initializeWebdriver("https://demoqa.com/buttons");
	objAutomateButtons.clickDoubbleClickButton();
	objAutomateButtons.clickRightButton();
//	objAutomateButtons.clickButton();
	
	
}
}
