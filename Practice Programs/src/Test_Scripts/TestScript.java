package Test_Scripts;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic.BaseClass;
import Generic.Generic_Excel;
import Generic.Utility_Methods;
import POM_Scripts.PomClass;

public class TestScript extends BaseClass
{

	@Test
	public void test() throws EncryptedDocumentException, IOException, AWTException, InterruptedException
	{
		
		
		
		String fname=Generic_Excel.getData("Sheet1", 0, 0);
		String mail=Generic_Excel.getData("Sheet1", 1, 0);	
		String mbl=Generic_Excel.getData("Sheet1", 2, 0);
		String passw=Generic_Excel.getData("Sheet1", 3, 0);
		
		PomClass pc=new PomClass(driver);
		
		pc.singup();
		Thread.sleep(2000);		
		
		pc.userType();
		Utility_Methods.keyboard_function().keyPress(KeyEvent.VK_DOWN);
		Utility_Methods.keyboard_function().keyRelease(KeyEvent.VK_DOWN);
		Utility_Methods.keyboard_function().keyPress(KeyEvent.VK_TAB);
		Utility_Methods.keyboard_function().keyRelease(KeyEvent.VK_TAB);
		
		pc.uname(fname);
		Thread.sleep(2000);
			
		pc.cname();
		Thread.sleep(2000);
			
		pc.uploadpic();
		Thread.sleep(2000);
		
		pc.email(mail);
		Thread.sleep(2000);
		
		pc.phone(mbl);
		Thread.sleep(2000);
		
		pc.password(passw);
		Thread.sleep(2000);	
		
		pc.pincode();
		Thread.sleep(2000);
		
		pc.address();
		Thread.sleep(2000);
		
		pc.state();
		WebElement ele=driver.findElement(By.xpath("//select[@id='State']"));
		Utility_Methods.select_class(ele).selectByValue("17");
		/*Utility_Methods.keyboard_function().keyPress(KeyEvent.VK_DOWN);
		Utility_Methods.keyboard_function().keyRelease(KeyEvent.VK_DOWN);
		Utility_Methods.keyboard_function().keyPress(KeyEvent.VK_TAB);
		Utility_Methods.keyboard_function().keyRelease(KeyEvent.VK_TAB);*/
		Thread.sleep(2000);
		
		Utility_Methods.javascriptexecutor(driver).executeScript("window.scrollBy(0,500)");
		
		pc.city();
		Utility_Methods.keyboard_function().keyPress(KeyEvent.VK_DOWN);
		Utility_Methods.keyboard_function().keyRelease(KeyEvent.VK_DOWN);
		Utility_Methods.keyboard_function().keyPress(KeyEvent.VK_TAB);
		Utility_Methods.keyboard_function().keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		
		pc.gstno();
		Thread.sleep(2000);
		
		pc.register();
		Thread.sleep(2000);
	}

}
