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

public class Main {

	final String CHROMEDRIVER_LOCATION = "/Users/zangrazyjatt/Desktop/chromedriver";
	final String URL_TO_Test ="https://www.mcdonalds.com/ca/en-ca.html";
	WebDriver driver;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}

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
		driver.close();
		
	}


	@Test
	public void mcTitle()
	{
		String title = driver.findElement(By.className("click-before-outline")).getText();
	System.out.println("title=  " +title);
	assertEquals("Subscribe to My McD’s®",title);
		
	}
	
	

}
