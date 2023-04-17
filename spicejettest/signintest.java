package spicejettest;

import org.testng.annotations.Test;

import Base.BaseClass;
import guvi.SJProPageObject.SignupPage;

public class SigninTest extends BaseClass
{	
	@Test
	public void Signup() 
	{
		Signin signup=new Signin(driver);
		signup.Signup();
		SwitchWindow();
		signup.SelectTitle();
		signup.Firstname(prop.getProperty("FirstName"));
		signup.Lastname(prop.getProperty("LastName"));
		signup.EnterCountry(prop.getProperty("Country"));
		signup.DateOfBirth(prop.getProperty("DOB"));
		signup.MobileNumber(prop.getProperty("MobileNumber"));
		signup.EmailId(prop.getProperty("Email"));
		signup.EnterPassword(prop.getProperty("Password"));
		signup.ConfirmPassword(prop.getProperty("ConfirmPassword"));
	}
}
