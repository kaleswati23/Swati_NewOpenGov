package Test;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.HomePage;
import Pages.Viewopenposition;
import Pages.CarrersPage;
import Pages.Currentopenings;


public class MyTest  extends BaseTest
{
	
	
	
@Test
public void verifyvalid() throws InterruptedException
{
	
	
	HomePage hp=new HomePage(driver);
	hp.company_Cli();
	CarrersPage cp=new CarrersPage(driver);
	cp.carrer_Cli();
	Viewopenposition vp=new Viewopenposition(driver);
	vp.pos_Cli();
	Currentopenings co=new Currentopenings(driver);
	co.viewPos_button_Cli();
	
		
		

}



	

}
