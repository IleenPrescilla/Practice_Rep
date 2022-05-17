package Generic;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility_Methods 
{
	public static WebDriver driver;
	public static Select select_class(WebElement ele)
	{
		Select sel=new Select(ele);
		return sel;	
	}
	
	public static Robot keyboard_function() throws AWTException
	{
		Robot rbt=new Robot();
		return rbt;
	}
	
	public static Actions action_class(WebDriver driver)
	{
		Actions act=new Actions(driver);
		return act;
	}
	
	public static JavascriptExecutor javascriptexecutor(WebDriver driver)
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		return jse;		
	}
	
	public static String title_of_page(WebDriver driver)
	{
		String title = driver.getTitle();
		return title;
	}
	

}
