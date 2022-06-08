package com.vstl.TestmouseAction;

import com.vstl.demoqa.MouseEventEx;
import com.vstl.generics.BaseTest;

public class TestMouseHoverEx {
public static void main(String[] args) {
	MouseEventEx objMouseEventEx = new MouseEventEx();
	BaseTest.initializeWebdriver("https://demoqa.com/menu/");
	objMouseEventEx.mouseHover();
	BaseTest.initializeWebdriver("https://demoqa.com/resizable");
	objMouseEventEx.checkeResizableBox();
}
}
