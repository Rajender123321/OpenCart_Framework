package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import pageObjects.OrangeHRMLogin;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC_003_LoginDataDrivenTest extends BaseClass {

	@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class)
	public void test_LoginDDT(String email, String pwd, String exp) {
		logger.info(" Starting TC_003_LoginDataDrivenTest ");

		try {
			OrangeHRMLogin Orhrm = new OrangeHRMLogin(driver);
			
			logger.info("Entered Username");
			Orhrm.Loginnameee(email);//Orhrm.Loginnameee(rb.getString("username"));
			
			logger.info("Entered password");
			Orhrm.Loginpasswordff(pwd);//Orhrm.Loginpasswordff(rb.getString("password"));
			
			logger.info("Login button clicked");
			Orhrm.Loginbuttonjkjjj();

			boolean targetpage= Orhrm.isgetConfirmationmsgExists();
			

		if (exp.equals("Valid")) 
			{
				if (targetpage == true) 
				{
					OrangeHRMLogin Orhrm1 = new OrangeHRMLogin(driver);
					Orhrm1.Logoutdrop();
					Orhrm1.Logoutbutton();
					
					Assert.assertTrue(true);
				} 
				else 
				{
					Assert.assertTrue(false);
				}
			}

			if (exp.equals("Invalid")) 
			{
				if (targetpage == true) 
				{
					OrangeHRMLogin Orhrm1 = new OrangeHRMLogin(driver);
					Orhrm1.Logoutdrop();
					Orhrm1.Logoutbutton();
					Assert.assertTrue(false);
				}
                 else 
                {
					Assert.assertTrue(true);
				}
			}
		}
		catch (Exception e) 
			{
		Assert.fail();
		}

		logger.info(" Finished TC_003_LoginDataDrivenTest");

	}

}
