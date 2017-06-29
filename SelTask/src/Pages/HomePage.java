package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


	

//@swati kale
//This is HomePage page which extends BasePage
	public class HomePage extends BasePage
	{
		
	
		

	  
	  By ele=By.xpath("//*[@class='navPrimary__hd'][contains(text(),'Company')]");

	  public HomePage(WebDriver driver)
	  {
		  super(driver);
		  
	  }
	 public  void company_Cli()
	 {

		 driver.findElement(ele).click();
	   
	    }

	
	}
	
	
	


