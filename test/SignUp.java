import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUp {
	final String CHROMEDRIVER_LOCATION = "/Users/zangrazyjatt/Desktop/chromedriver";
	final String URL_TO_Test ="https://www.mcdonalds.com/ca/en-ca.html";
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver",CHROMEDRIVER_LOCATION);
		 driver = new ChromeDriver();
			String baseUrl = URL_TO_Test;
			driver.get(baseUrl);
			Thread.sleep(1000);
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
		firstName.sendKeys("Amrik");
		
		WebElement emailID = driver.findElement(By.id("email2"));
		emailID.sendKeys("Amrik@y7mail.com");
		
		WebElement postalCode = driver.findElement(By.id("postalcode2"));
		postalCode.click();

		Thread.sleep(1000);
		postalCode.sendKeys("L6Y");
		
			Thread.sleep(10000);
			
			WebElement button = driver.findElement(By.id("g-recaptcha-btn-2"));
			button.click();
			
			
			Thread.sleep(10000);
			
		
	driver.close();
		
	
	}
		

}
