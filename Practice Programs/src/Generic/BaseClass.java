package Generic;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass implements Framework_Constant
{
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	@BeforeMethod
	public static void openapp()
	{
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		wait=new WebDriverWait(driver,10);
		driver.get(URL);	
	}
	
	@AfterMethod
	public static void closeapp()
	{
		driver.close();
	}

}
