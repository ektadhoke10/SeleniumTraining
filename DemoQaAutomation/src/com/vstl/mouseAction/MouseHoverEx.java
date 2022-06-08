package com.vstl.mouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.vstl.generics.BaseTest;

public class MouseHoverEx extends BaseTest {
	public void mouseHover() {
		Actions actions = new Actions(driver);

		WebElement HoverActionOnMainItem1Option = driver.findElement(By.xpath("//*[@id='nav']/li[1]/a"));
		//Mouse hover on 'main item 1'
		actions.moveToElement(HoverActionOnMainItem1Option).perform();
		System.out.println("Done Mouse hover on 'Main Item 1' from Menu");


		WebElement HoverActionOnMainItem2Option = driver.findElement(By.xpath("//*[@id='nav']/li[2]/a")); 
		//Mouse hover menuOption 'main item 2'
		actions.moveToElement(HoverActionOnMainItem2Option).perform();
		System.out.println("Done Mouse hover on 'Main Item 2' from Menu");

		WebElement hoverActionOnSubSubListOption = driver.findElement(By.xpath("//*[@id='nav']/li[2]/ul/li[3]/a"));
		actions.moveToElement(hoverActionOnSubSubListOption).perform();
		System.out.println("Done Mouse hover on 'sub sub list' from Menu");	
	}
	
}
