package Pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//@swati kale
//This is carrerer page which extends BasePage

public class CarrersPage extends BasePage
{

  By ele1=By.xpath(".//*[@id='companyDropdown']/div/div/div[1]/div/ul/li[3]/a/span[1]");
		
		  
	public CarrersPage(WebDriver driver)
	  {
		super(driver);
		  
	  }
	  
	  
		  public void carrer_Cli() 
		 {

			 driver.findElement(ele1).click();
		    			
           }
		
	
	

}
