import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoQa {
	public static WebDriver driver =null;

	@BeforeTest
	public void initializeWebdriver() {
		System.out.println("launching Chrome browser");
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
	}

	@Test
	public void clickDoubbleClickButton() {
		Actions actions = new Actions(driver); 
		WebElement btnElement = driver.findElement(By.id("doubleClickBtn")); 
		//Double Click the button 
		actions.doubleClick(btnElement).perform(); 
		System.out.println("Button is double clicked"); 
	}

	@Test
	public void clickRightButton() {
		//Instantiate Action Class
		Actions actions = new Actions(driver);
		WebElement btnElement = driver.findElement(By.id("rightClickBtn"));
		//Right Click the button 
		actions.contextClick(btnElement).perform();
		System.out.println("Right click");
	}
	
	@AfterTest
	public static void tearDown() {
		System.out.println("After test");
		driver.close();
	}
}
