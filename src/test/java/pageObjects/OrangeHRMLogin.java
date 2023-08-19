package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrangeHRMLogin extends BasePage {
	
	WebDriver driver;
	
	public OrangeHRMLogin(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(name = "username")
	WebElement Loginname;
	
	@FindBy(name = "password")
	WebElement LoginPassword;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	WebElement LoginButton;
	
	@FindBy(xpath = "//*[@id='app']/div[1]/div[1]/header/div[1]/div[1]/span/h6")
	WebElement msgConfirmation;
	
	@FindBy(xpath = "//*[@class ='oxd-userdropdown-tab']//p")
	WebElement Logoutdropdo;
	
	@FindBy(xpath = "//*[@class ='oxd-userdropdown-link' and text() = 'Logout']")
	WebElement Logout;
	
	public void Loginnameee(String fname)
	{
		Loginname.sendKeys(fname);
	}
	
	public void Loginpasswordff(String Pwd)
	{
		LoginPassword.sendKeys(Pwd);
	}
	
	public void Loginbuttonjkjjj()
	{
		LoginButton.click();
	}
	public String getConfirmationMsg()
	{
		try
		{
		return(msgConfirmation.getText());
		}
		catch(Exception e)
		{
			return (e.getMessage());
		}
	}
	
	public boolean isgetConfirmationmsgExists()
	{
		try
		{
			return(msgConfirmation.isDisplayed());
		}
		catch(Exception e)
		{
			return (false);
		}
	}
	public void Logoutdrop()
	{
		Logoutdropdo.click();
	}
	
	public void Logoutbutton()
	{
		Logout.click();
	}
	
	
	
}
