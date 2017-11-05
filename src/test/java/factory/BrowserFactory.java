package factory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory 
{
	static WebDriver driver;
	public static WebDriver getBrowser(String browserName)
	{
		if(browserName.equalsIgnoreCase("firefix"))
		{
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("Chrome"))
		{
			try 
			{
				System.setProperty("webdriver.chrome.driver", DataProviderFactory.getConfig().getURl());
			} 
			catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
	}
	
	public static void closeBrowser(WebDriver ldriver)
	{
		ldriver.quit();
	}

}
