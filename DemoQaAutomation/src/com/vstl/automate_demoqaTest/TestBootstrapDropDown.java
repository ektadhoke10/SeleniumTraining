package com.vstl.automate_demoqaTest;

import com.vstl.demoqa.BootstrapDropDown;
import com.vstl.generics.BaseTest;

public class TestBootstrapDropDown {
	public static void main(String[] args) {
		BootstrapDropDown objBootstrapDropDown = new BootstrapDropDown();
		BaseTest.initializeWebdriver("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");
		objBootstrapDropDown.selectBootstrapDropdown("JavaScript");
	}
	
}
