package applicationpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage 
{
	WebDriver driver;
	public HomePage(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	
	@FindBy(xpath = "//a[@href='http://fashiontrend.myavactis.com/index.php']/span[text()='Home']")
	WebElement myHome;
	
	@FindBy(xpath = "/html/body/header/div[1]/div/div/div/ul/li[2]/a/span")
	WebElement myaccountLink;
	
	@FindBy(xpath="//span[text()=' Log In']")
	WebElement clickLogin;
	
	@FindBy(xpath="//span[text()='Wishlist']")
	WebElement my_wishlist;
	
	@FindBy(xpath ="//span[text()='My Cart']")
	WebElement my_cart;
	
	public void clickOnlogin()
	{
		clickLogin.click();
	}
	public void clickOnWishlist()
	{
		my_wishlist.click();
	}
	public void clickOnMyAccount()
	{
		myaccountLink.click();
	}
	
	public void clickOnMyCart()
	{
		my_cart.click();
	}
	
	 public String getApplicationTitle()
	 {
	    return (driver.getTitle());
	 }

}
