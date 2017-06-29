package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//@swati kale
//This is  Viewopenposition page which extends BasePage
public class Viewopenposition extends BasePage
{

	public Viewopenposition(WebDriver driver)
	{
	
		 super(driver);
	}
	
	By pos=By.xpath(".//*[@id='pageContent']/main/div[1]/div/div[1]/div/div/div/div/div/div[3]/ul/li/a/span[1]");

		 
		 public  void pos_Cli()
		 {

			 driver.findElement(pos).click();
		   
		    }
	}


