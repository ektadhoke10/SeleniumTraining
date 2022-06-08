package com.vstl.mouseAction;

import org.openqa.selenium.JavascriptExecutor;

import com.vstl.generics.BaseTest;

public class ScrollUpAndDown extends BaseTest {
	public void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println("Scroll to bottom");
		BaseTest.implicitWait(10);
		js.executeScript("window.scrollTo(0,0)");
        System.out.println("Scroll to Top");
        }
}
