package com.vstl.automate_elementsTest;

import com.vstl.automate_elements.AutomateBrokenLinks;
import com.vstl.generics.BaseTest;

public class TestAutomateBrokenLinks {
public static void main(String[] args) {
	AutomateBrokenLinks objAutomateBrokenLinks = new AutomateBrokenLinks();
	BaseTest.initializeWebdriver("https://demoqa.com/broken");
	objAutomateBrokenLinks.getBrokenLinks();
	System.out.println("===========================================================");
	objAutomateBrokenLinks.getBrokenImages();

}
}
