package com.vstl.automate_demoqaTest;

import com.vstl.demoqa.Frames;
import com.vstl.generics.BaseTest;

public class TestFrames {
public static void main(String[] args) {
	Frames objFrames = new Frames();
	BaseTest.initializeWebdriver("https://demoqa.com/frames");
	objFrames.getTotalIFramesOnPage();
	objFrames.getHeadingOfFrame();
	BaseTest.initializeWebdriver("https://demoqa.com/nestedframes");
	objFrames.nastedFrame();
}
}
