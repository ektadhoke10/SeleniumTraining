package com.vstl.TestmouseAction;

import com.vstl.generics.BaseTest;
import com.vstl.mouseAction.DragAndDrop;

public class TestDragAndDrop {
	public static void main(String[] args) {
		DragAndDrop objDragAndDrop = new DragAndDrop();
		BaseTest.initializeWebdriver("https://demoqa.com/droppable/");
		objDragAndDrop.perfromDragAndDrop();
	}
}
