package GotPhotoTest;




import org.openqa.selenium.WebDriver;


import GotPhotoobjects.NewLoginPageObjects;
import UtilMethods.BrowserClass;


public class NewLoginPageTest {
	static WebDriver driver ;

	static BrowserClass browser = new BrowserClass();
	

	public static void main(String[] args) {

		LoginPageTestmethod();

	}


	public static void LoginPageTestmethod(){

		driver = browser.ChromeBrowserLaunch("https://testaccus.gotphoto.com/prepay/login");
		NewLoginPageObjects LoginPageobj = new NewLoginPageObjects(driver);
		
		System.out.println("Browser launched successfully");
		
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
		
		driver.close();
		System.out.print("test completed successfully");
		driver.quit();
	}

}
