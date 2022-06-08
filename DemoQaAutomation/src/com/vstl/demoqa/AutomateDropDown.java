package com.vstl.demoqa;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import com.vstl.generics.BaseTest;

public class AutomateDropDown extends BaseTest{

	public void getDropDownMenuUsingLoop() {
		Select select = new Select(driver.findElement(By.id("oldSelectMenu")));
		//Get list of web elements
		List<WebElement> lst = select.getOptions();
		System.out.println("The dropdown options are:");
		for(WebElement options: lst)
			System.out.println(options.getText());
	}
	public void selectOptionFromDropDownByIndex() {
		System.out.println("----------------------------------------------");
		Select select = new Select(driver.findElement(By.id("oldSelectMenu")));
		System.out.println("Select the Option by Index 4");
		select.selectByIndex(4);
		System.out.println("Select value is: " + select.getFirstSelectedOption().getText());
	}
	public void selectOptionFromDropDownByText() {
		System.out.println("----------------------------------------------");
		Select select = new Select(driver.findElement(By.id("oldSelectMenu")));
		System.out.println("Select the Option by Text Magenta");
		select.selectByVisibleText("Magenta");
		System.out.println("Select value is: " + select.getFirstSelectedOption().getText());
	}
	public void selectOptionFromDropDownByValue() {
		System.out.println("----------------------------------------------");
		Select select = new Select(driver.findElement(By.id("oldSelectMenu")));
		System.out.println("Select the Option by value 6");
		select.selectByValue("6");
		System.out.println("Select value is: " + select.getFirstSelectedOption().getText());
	}

	public void multiSelectDropDwon() {
		System.out.println("------------------------------------------------");
		Select select = new Select(driver.findElement(By.id("cars")));

		//Get the list of all the options
		System.out.println("The dropdown options are -");

		List<WebElement> options = select.getOptions();

		for(WebElement option: options)
			System.out.println(option.getText());

		//Using isMultiple() method to verify if the element is multi-select, if yes go onto next steps else eit
		if(select.isMultiple()){

			//Selecting option as 'Volvo'-- ByIndex
			select.selectByIndex(0);

			//Selecting the option as 'Saab'-- ByValue
			select.selectByValue("saab");

			// Selecting the option by text
			select.selectByVisibleText("Audi");

			//Get the list of selected options
			System.out.println("-----------------------------------------");
			System.out.println("The selected values in the dropdown options are -");

			List<WebElement> selectedOptions = select.getAllSelectedOptions();

			for(WebElement selectedOption: selectedOptions)
				System.out.println(selectedOption.getText());
		}

	}
	public void diselectDropDownOption() {
		Select select = new Select(driver.findElement(By.id("cars")));
		// Deselect the value "Audi" by Index
		System.out.println("Deselect option Audi by Index");
		select.deselectByIndex(3);
		System.out.println("-----------------------------------------");
		//Deselect the value "Opel" by visible text
		System.out.println("Deselect option Opel by Text");
		select.deselectByVisibleText("Opel");
		System.out.println("-----------------------------------------");
		//Validate that both the values are deselected
		System.out.println("The selected values after deselect in the dropdown options are -");
		List<WebElement> selectedOptionsAfterDeselect = select.getAllSelectedOptions();

		for(WebElement selectedOptionAfterDeselect: selectedOptionsAfterDeselect)
			System.out.println(selectedOptionAfterDeselect.getText());

		// Deselect all values
		//select.deselectAll();
	}


}

