package com.vstl.automate_demoqaTest;

import com.vstl.demoqa.AlertHandle;
import com.vstl.generics.BaseTest;

public class TestAlertHandle {
public static void main(String[] args) {
	AlertHandle objAlertHandle = new AlertHandle();
	BaseTest.initializeWebdriver("https://demoqa.com/alerts");
	objAlertHandle.simpleAlert();
	objAlertHandle.timerAlert();
	objAlertHandle.acceptConformationAlert();
	objAlertHandle.dismissConformationAlert();
	objAlertHandle.promptAlert();
	
}
}
