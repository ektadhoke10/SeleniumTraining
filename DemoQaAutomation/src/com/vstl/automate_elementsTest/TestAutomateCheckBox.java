package com.vstl.automate_elementsTest;

import com.vstl.automate_elements.AutomateCheckBox;
import com.vstl.generics.BaseTest;

public class TestAutomateCheckBox {
public static void main(String[] args) {
	AutomateCheckBox objAutomateCheckBox =new AutomateCheckBox();
	BaseTest.initializeWebdriver("https://demoqa.com/checkbox");
	objAutomateCheckBox.clickSvgToggleIcon();
	objAutomateCheckBox.clickDesktopCheckBox();
}
}
