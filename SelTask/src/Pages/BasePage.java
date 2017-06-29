package Pages;

//@swati kale
//This is base page for all pages we can inherit for other pages
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	
		protected WebDriver driver;
		protected WebDriverWait wait;
		protected String pageUrl = "https://opengov.com/";

		public BasePage(WebDriver driver) {
			this.driver = driver;
			wait = new WebDriverWait(driver, 5);
		}
		
		
		public void load() {
			driver.get(pageUrl);
		}

}
