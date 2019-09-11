import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mcdonaldsMain {
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
//		to close all Test_Case windows(one by one), unComment the code below
//		Thread.sleep(1000);
//		driver.close();
		
	}

	@Test
	public void mcTitleTC1() throws InterruptedException
	{
		WebElement close = driver.findElement(By.xpath("//a[@class = 'exit']"));
		close.click();
		String title = driver.findElement(By.className("click-before-outline")).getText();
	System.out.println("title=  " +title);
	assertEquals("Subscribe to My McD’s",title);
//	Thread.sleep(1000);
//	driver.close();
		
	}
	@Test
	public void mcSignUPTC2() throws InterruptedException
	{
		
		WebElement close = driver.findElement(By.xpath("//a[@class = 'exit']"));
		close.click();
		WebElement firstName = driver.findElement(By.id("firstname2"));
		firstName.sendKeys("Amrik");
		
		WebElement emailID = driver.findElement(By.id("email2"));
		emailID.sendKeys("Amrik@y7mail.com");
		
		WebElement postalCode = driver.findElement(By.id("postalcode2"));
		postalCode.click();
		

		Thread.sleep(1000);
		postalCode.sendKeys("L6Y");
		
			Thread.sleep(1000);
			
			WebElement button = driver.findElement(By.id("g-recaptcha-btn-2"));
			button.click();
			Thread.sleep(1000);
//			WebElement verify = driver.findElement(By.id("recaptcha-verify-button"));
//			verify.click();
			WebElement verify = driver.findElement(By.className("class='rc-button-default goog-inline-block"));
			verify.click();
//			
		
	
	}	
	@Test
	public void mcSignUPTC3() throws InterruptedException
	{
		WebElement close = driver.findElement(By.xpath("//a[@class = 'exit']"));
		close.click();
		WebElement firstName = driver.findElement(By.id("firstname2"));
		firstName.sendKeys(" ");
		
		WebElement emailID = driver.findElement(By.id("email2"));
		emailID.sendKeys(" ");
		
		WebElement postalCode = driver.findElement(By.id("postalcode2"));
		postalCode.click();
			postalCode.sendKeys(" ");
			
			Thread.sleep(1000);
		WebElement button = driver.findElement(By.id("g-recaptcha-btn-2"));
		button.click();
//		
	
	}

}


