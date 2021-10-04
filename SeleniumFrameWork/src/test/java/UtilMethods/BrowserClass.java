package UtilMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserClass {
	static WebDriver driver;

	public WebDriver ChromeBrowserLaunch(String URL)
	{

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		return driver;
	}
	public WebDriver FireFoxBrowserLaunch(String URL)
	{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		return driver;
	}

	public WebDriver EdgeBrowserLaunch(String URL)
	{

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		return driver;
	}

	public  WebElement WaitUntilElementLoad(By Locator)
	{
		return new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(Locator));

	}

	




}
