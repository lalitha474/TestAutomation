package GotPhotoobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.testng.Assert;

import UtilMethods.BrowserClass;

public class NewLoginPageObjects {
	private WebDriver driver = null;
	WebElement element = null;
	static BrowserClass browser = new BrowserClass();

	By textbox_AccessCode = By.id("accessCode");
	By button_login = By.xpath("//button/span[text()='Login']");
	By icon_Menu = By.xpath("//span[@class='anticon anticon-menu Header_Icon__3YNjj']");
	By textbox_firstname = By.id("firstname");
	By textbox_Lastname = By.id("lastname");
	By textbox_Email = By.id("email");
	By textbox_mobilenumber = By.id("mobile_phone");
	By Heading_personnel = By.xpath("//h1[text()='Personal information']");
	By lable_contactdetails = By.xpath("//span[text()='Please enter your contact details.']");
	By Heading_childinfo = By.xpath("//h1[text()='Child information']");
	By Heading_UserInfoDisplayname = By.xpath("//img[@class='Header_HeaderImage__394NU']/../h2");
	By button_logout = By.xpath("//span[@aria-label='logout']");
	By orders = By.xpath("//span[@aria-label='shop']");
	By contacts = By.xpath("//span[@aria-label='message']");
	

	public NewLoginPageObjects(WebDriver driver)
	{
		this.driver=driver;
	}


	public void setAccessCode(String AccessCode)

	{
		browser.WaitUntilElementLoad(textbox_AccessCode);

		driver.findElement(textbox_AccessCode).clear();
		driver.findElement(textbox_AccessCode).sendKeys(AccessCode);


	}
	public void setFirstname(String Firstname)
	{

		browser.WaitUntilElementLoad(textbox_firstname);
		driver.findElement(textbox_firstname).clear();
		driver.findElement(textbox_firstname).sendKeys(Firstname);

	}
	public void setLastname(String Lastname)
	{

		browser.WaitUntilElementLoad(textbox_Lastname);
		driver.findElement(textbox_Lastname).clear();
		driver.findElement(textbox_Lastname).sendKeys(Lastname);

	}

	public void setEmail(String Email)
	{
		browser.WaitUntilElementLoad(textbox_Email);
		driver.findElement(textbox_Email).clear();
		driver.findElement(textbox_Email).sendKeys(Email);

	}
	public void setMobilenumber(String setMobilenumber)
	{
		browser.WaitUntilElementLoad(textbox_mobilenumber);
		driver.findElement(textbox_mobilenumber).clear();
		driver.findElement(textbox_mobilenumber).sendKeys(setMobilenumber);

	}

	public void ClickLogin()
	{
		browser.WaitUntilElementLoad(button_login);
		driver.findElement(button_login).click();
	}
	public void ClickMenu()
	{
		browser.WaitUntilElementLoad(icon_Menu);
		driver.findElement(icon_Menu).click();
	}

	public void VerifyCustomerDisplayname(String ExpectedName)
	{
		browser.WaitUntilElementLoad(Heading_UserInfoDisplayname);
		String DisplayName =driver.findElement(Heading_UserInfoDisplayname).getText();
		Assert.assertEquals(DisplayName, ExpectedName);
	}
	public void ClickLogout()
	{
		browser.WaitUntilElementLoad(button_logout);
		driver.findElement(button_logout).click();
	}

	public void VerifyMenuElements()
	{
		browser.WaitUntilElementLoad(button_logout);
		
		browser.WaitUntilElementLoad(contacts);
		driver.findElement(button_logout).isDisplayed();
		driver.findElement(contacts).isDisplayed();
		System.out.println("verified menu elemets");
		
	}

}
