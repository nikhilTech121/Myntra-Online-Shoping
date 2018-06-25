package Script;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Generic.Baase_Test;
import Generic.Excel;
import Pom.ContactUs;
import Pom.LoginPage;
import Pom.logOut;

public class TestCase4 extends Baase_Test 
{
	@Test
	public void login() throws InterruptedException
	{
		LoginPage p = new LoginPage(driver);
		 
		 String us = Excel.ExcelSheet(PATH,"Sheet1",1, 0);
		 String pw = Excel.ExcelSheet(PATH,"Sheet1",2, 0);
		 p.loginclk();
		 
		 p.loginclick();
		 
		 p.Username(us);
		 
		  p.Password(pw);
		
		 p.LoginBtn();
	//clicking on Contact us
		 ContactUs c = new ContactUs(driver);
		c.contact();
		Thread.sleep(2000);
		 logOut l = new logOut(driver);
		 l.SignOut();
		
		
		 
	}
}
