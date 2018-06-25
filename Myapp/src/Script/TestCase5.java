package Script;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Generic.Baase_Test;
import Generic.Excel;
import Pom.LoginPage;
import Pom.TrackOrder;
import Pom.logOut;

public class TestCase5 extends Baase_Test
{
	@Test
	public void Login() throws InterruptedException 
	{
		LoginPage p = new LoginPage(driver);
		 
		 String us = Excel.ExcelSheet(PATH,"Sheet1",1, 0);
		 String pw = Excel.ExcelSheet(PATH,"Sheet1",2, 0);
		 p.loginclk();
		 
		 p.loginclick();
		 
		 p.Username(us);
		 
		  p.Password(pw);
		
		 p.LoginBtn();
	 	
	 //clicking on track order
	 TrackOrder t = new TrackOrder(driver);
			 t.track();
	//clicking on Logout
	 Thread.sleep(2000);
	 logOut l = new logOut(driver);
	 l.SignOut();
	}

}
