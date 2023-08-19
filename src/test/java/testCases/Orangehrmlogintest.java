package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.OrangeHRMLogin;
import testBase.BaseClass;

public class Orangehrmlogintest extends BaseClass {
 
	@Test(groups = {"Sanity","Master"})
	public void Loginnntest()
	{
		
		logger.debug("application logs......");
		logger.info("***  Starting TC_001_AccountRegistrationTest ***");
		try
		{
		OrangeHRMLogin Orhrm = new OrangeHRMLogin(driver);
		
		logger.info("Entered Username");
		Orhrm.Loginnameee("Admin");//Orhrm.Loginnameee(rb.getString("username"));
		
		logger.info("Entered password");
		Orhrm.Loginpasswordff("admin123");//Orhrm.Loginpasswordff(rb.getString("password"));
		
		logger.info("Login button clicked");
		Orhrm.Loginbuttonjkjjj();
		
		logger.info("Validation");
		String act_label= Orhrm.getConfirmationMsg();
		String exp_label="Dashboard";
		Assert.assertEquals(act_label,exp_label);
		
		
		Orhrm.Logoutdrop();
		logger.info("Logout");
		
		Orhrm.Logoutbutton();
		
		}
		catch(Exception e)
		{
			Assert.fail();
		}
	
	}
	
 
}
