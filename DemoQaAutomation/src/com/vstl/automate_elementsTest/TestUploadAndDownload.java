package com.vstl.automate_elementsTest;

import com.vstl.automate_elements.UploadAndDownload;
import com.vstl.generics.BaseTest;

public class TestUploadAndDownload {
public static void main(String[] args) {
	UploadAndDownload objUploadAndDownload = new UploadAndDownload();
	BaseTest.initializeWebdriver("https://demoqa.com/upload-download");
	objUploadAndDownload.uploadFile();
	objUploadAndDownload.downloadFile();
}
}
