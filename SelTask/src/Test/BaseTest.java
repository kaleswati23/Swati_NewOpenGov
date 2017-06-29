package Test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

//@swati kale
//This is BaseTest for all pages we can inherit for other test
public class BaseTest {


	public WebDriver driver;
	public 	WebDriverWait wait;
	
	@Before
	public void baseSetUp() throws Exception {
		

		
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
	    String baseUrl = "https://opengov.com/";
		driver.get(baseUrl);
		
	}

	@After
	public void baseTearDown() throws Exception 
	{
		
		
		
		driver.quit();
	}

}
