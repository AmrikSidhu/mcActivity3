import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class emptyData {

	final String CHROMEDRIVER_LOCATION = "/Users/zangrazyjatt/Desktop/chromedriver";
	final String URL_TO_Test ="https://www.mcdonalds.com/ca/en-ca.html";
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver",CHROMEDRIVER_LOCATION);
		 driver = new ChromeDriver();
			String baseUrl = URL_TO_Test;
			driver.get(baseUrl);
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		//driver.close();
	}

	@Test
	public void mcSignUP() throws InterruptedException
	{
		WebElement firstName = driver.findElement(By.id("firstname2"));
		firstName.sendKeys(" ");
		
		WebElement emailID = driver.findElement(By.id("email2"));
		emailID.sendKeys(" ");
		
		WebElement postalCode = driver.findElement(By.id("postalcode2"));
			postalCode.sendKeys(" ");
			
			Thread.sleep(1000);
		WebElement button = driver.findElement(By.id("g-recaptcha-btn-2"));
		button.click();
		Thread.sleep(20000);
		driver.close();
	
	}

}
