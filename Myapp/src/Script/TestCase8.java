package Script;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Generic.Baase_Test;
import Generic.Excel;
import Pom.LoginPage;
import Pom.SearchBox;
import Pom.logOut;

public class TestCase8 extends Baase_Test
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
	//input in searchox
		 Thread.sleep(2000);
	 SearchBox sb = new SearchBox(driver);
	 sb.searching("Jeans");
	 
	 sb.selecting();
	 
	 //Log out
	 logOut l = new logOut(driver);
	 l.SignOut();

	}
}
