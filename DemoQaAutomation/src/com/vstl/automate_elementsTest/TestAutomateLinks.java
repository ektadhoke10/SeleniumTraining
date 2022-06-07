package com.vstl.automate_elementsTest;

import com.vstl.automate_elements.AutomateLinks;
import com.vstl.generics.BaseTest;

public class TestAutomateLinks {
	public static void main(String[] args) {
		AutomateLinks objAutomateLinks = new AutomateLinks();
		BaseTest.initializeWebdriver("https://demoqa.com/links");
		objAutomateLinks.getAllLinks();
	}
	}
