package spicejettest;

import org.testng.annotations.Test;

import Base.BaseClass;
import guvi.SJProPageObject.LoginPage;

public class LoginTest extends BaseClass
{

	@Test
	public void LoginwithValidCredentials() 
	{
		LoginPage login=new LoginPage(driver);
		login.Login();
		login.EmailButton();
		login.EmailId(prop.getProperty("Email"));
		login.Password(prop.getProperty("Password"));
		login.loginButton();
	}
	
	@Test
	public void LoginwithInValidCredentials() 
	{
		LoginPage login=new LoginPage(driver);
		login.Login();
		login.EmailButton();
		login.EmailId(prop.getProperty("Email"));
		login.Password(prop.getProperty("InvalidPass"));
		login.loginButton();
	}

}
