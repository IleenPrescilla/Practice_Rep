package POM_Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass 
{
	@FindBy(xpath="//div[.='Sign up']")
	private WebElement sign;
	
	@FindBy(id="user_type")
	private WebElement utype;
	
	@FindBy(id="u_name")
	private WebElement name;
	
	@FindBy(id="u_name1")
	private WebElement name2;
	
	@FindBy(id="u_picture")
	private WebElement pic;
	
	@FindBy(id="u_id")
	private WebElement id;
	
	@FindBy(id="u_phone")
	private WebElement phn;
	
	@FindBy(id="u_password")
	private WebElement pass;
	
	@FindBy(id="u_pincode")
	private WebElement pin;
	
	@FindBy(id="u_address")
	private WebElement addr;
	
	@FindBy(id="State")
	private WebElement sts;
	
	@FindBy(xpath="//select[@id='city']")
	private WebElement cty;
	
	@FindBy(id="gst_no")
	private WebElement gst;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement reg;
	
	public PomClass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void singup()
	{
		sign.click();
	}
	
	public void userType()
	{
		utype.click();
	}
	
	public void uname(String fname)
	{
		name.sendKeys(fname);
	}
	
	public void cname()
	{
		name2.sendKeys("Ileen");
	}
	
	public void uploadpic()
	{
		pic.sendKeys("C:\\Users\\Ileen Prescilla\\Documents\\Wallpaper\\210939.png");
	}
	
	public void email(String mail)
	{
		id.sendKeys(mail);
	}
	
	public void phone(String mbl)
	{
		phn.sendKeys(mbl);
	}
	
	public void password(String passw)
	{
		pass.sendKeys(passw);
	}
	
	public void pincode()
	{
		pin.sendKeys("560091");
	}
	public void address()
	{
		addr.sendKeys("Malleshwaram");
	}
	
	public void state()
	{
		sts.click();
	}
	public void city()
	{
		cty.click();
	}
	
	public void gstno()
	{
		gst.sendKeys("hgsdfg563564");
	}
	
	public void register()
	{
		reg.click();
	}

}
