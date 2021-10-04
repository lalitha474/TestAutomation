package GotPhotoTest;


import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GotPhotoobjects.NewLoginPageObjects;
import UtilMethods.BrowserClass;



public class GotPhoto_TESTNG {
	static WebDriver driver = null;
	static BrowserClass browser = new BrowserClass();	


	@BeforeTest
	public static void LaunchBrowser()
	{
		driver = browser.ChromeBrowserLaunch("https://testaccus.gotphoto.com/prepay/login");
		System.out.println("Browser launched successfully");
	}


	@Test

	public static void LoginShopApathoke()
	{
		NewLoginPageObjects LoginPageobj = new NewLoginPageObjects(driver);
		LoginPageobj.setAccessCode("Q9L47Q");
		LoginPageobj.ClickLogin();
		LoginPageobj.setFirstname("Lalitha");
		LoginPageobj.setLastname("Dumpeta");
		LoginPageobj.setEmail("lalitha.dumpeta@gmail.com");
		LoginPageobj.setMobilenumber("+1 1234567899");
		LoginPageobj.ClickLogin();
		LoginPageobj.ClickMenu();
		LoginPageobj.VerifyCustomerDisplayname("Hello lalitha!");
		LoginPageobj.VerifyMenuElements();
	}


	@AfterTest

	public static void CloseBrowser()
	{

		driver.close();
		System.out.println("test completed successfully");
		driver.quit();

	}

}
