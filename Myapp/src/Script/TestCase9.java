package Script;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Generic.Baase_Test;
import Generic.Excel;
import Pom.LoginPage;
import Pom.RemoveItem;

public class TestCase9 extends Baase_Test{
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
	 Thread.sleep(2000);
	 RemoveItem r = new RemoveItem(driver);
	 r.Bag();
	 Thread.sleep(2000);
	 r.removeclk();
	 Thread.sleep(2000);
	 r.removefin();
	 Thread.sleep(2000);
	 
	}
}
