package spicejettest;


Run All
public class validateurltest extends BaseClass
{
	
@Test(priority=0)
 public void BrokenURL()
 {
	ValidateURL validurl = new validateURL(driver);
	validurl.verifyTitle();
	system.out.println("given link is not a Broken URL");
 }
}