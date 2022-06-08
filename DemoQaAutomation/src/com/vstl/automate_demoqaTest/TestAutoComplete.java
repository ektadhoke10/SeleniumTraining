package com.vstl.automate_demoqaTest;

import com.vstl.demoqa.AutoComplete;
import com.vstl.generics.BaseTest;

public class TestAutoComplete {
	public static void main(String[] args) throws InterruptedException {
		AutoComplete objAutoComplete = new AutoComplete();
		BaseTest.initializeWebdriver("https://www.google.co.in/");
		objAutoComplete.autoCompleteText();
	}
}
