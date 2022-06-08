package com.vstl.TestmouseAction;
import com.vstl.generics.BaseTest;
import com.vstl.mouseAction.ScrollUpAndDown;

public class TestScrollUpAndDown {
	public static void main(String[] args) {
		ScrollUpAndDown objScrollUpAndDown = new ScrollUpAndDown();
		BaseTest.initializeWebdriver("https://www.w3schools.com/"); 
		objScrollUpAndDown.scrollDown();
		//objScrollUpAndDown.scrollUp();
	}
}
