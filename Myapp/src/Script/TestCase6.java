package Script;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Generic.Baase_Test;
import Generic.Excel;
import Pom.CancellationPr;
import Pom.LoginPage;
import Pom.logOut;

public class TestCase6 extends Baase_Test
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
//click on useful link cancel
	 CancellationPr c = new CancellationPr(driver);
	 c.cancel();
	 
	 //click on logout
	 logOut l = new logOut(driver);
	 l.SignOut();
	}}
