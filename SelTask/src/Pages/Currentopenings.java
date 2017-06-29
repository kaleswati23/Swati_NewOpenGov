package Pages;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.util.StringUtils;

import junit.framework.Assert;

//@swati kale
//This is  Currentopenings page which extends BasePage
public class Currentopenings extends BasePage
{


	  By ele3=By.xpath(".//*[@id='currentOpenings']/div/div/div/div[2]/div/div/div[1]/ul/li[1]/div/div/div/select");

	
	public Currentopenings(WebDriver driver) 
	{
		super(driver);
	}
	
	 public  void viewPos_button_Cli()
	 {

		 
			
			Select dp=new Select(driver.findElement(ele3));
			dp.selectByVisibleText("Engineering");
			

			List<WebElement> links = driver.findElements(By.tagName("a"));
	 
			for (int i = 1; i<links.size(); i++)
	 
			  {
				
			   String s=links.get(i).getText();
				String s1="RedWood City";
				issubstring(s,s1);
				//assertEquals(s1, s);
				//assertEquals("Redwood City", driver.findElement(By.xpath("//div[@id='currentOpenings']/div/div/div/div[2]/div/div/div[2]/div/div/div/div/div[2]/ul/li[2]/a/div[2]/span")).getText());
				
			  }
				
			//System.out.println(count);	
	    }

	
	private void issubstring(String s, String s1) 
	{
		
		//int count=0;
		
		/*Pattern p = Pattern.compile("RedWood City");
		Matcher m=p.matcher(s);
		int count=0;
		while(m.find())
		{
		count=count+1;	
		break;
			
		}*/
		
		
		//String findStr = "hello";
		int lastIndex = 0;
		int count = 0;
		while((lastIndex = s.indexOf(s1, lastIndex)) != -1) {
		     count++;
		     lastIndex += s1.length() - 1;
		}
		System.out.println(count);
		
		
		
		
		
	}


}
