package com.vstl.generics;

import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	public static WebDriver driver =null;

	public static void initializeWebdriver(String strUrl) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(strUrl);
		driver.manage().window().maximize();
	}

	public static void tearDown() {
		driver.quit();
	}
	
	public void verifyLinks(String linkUrl) {
		 try
	        {
	            URL url = new URL(linkUrl);

	            //Now we will be creating url connection and getting the response code
	            HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
	            httpURLConnect.setConnectTimeout(5000);
	            httpURLConnect.connect();
	            if(httpURLConnect.getResponseCode()>=400)
	            {
	            	System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage()+"is a broken link");
	            }    
	       
	            //Fetching and Printing the response code obtained
	            else{
	                System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
	            }
	        }catch (Exception e) {
	      }
	}
}
