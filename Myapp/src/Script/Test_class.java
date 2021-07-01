package Script;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import Generic.Baase_Test;
import Generic.Excel;
import Pom.LoginPage;
import Pom.logOut;

public class Test_class extends Baase_Test
{	
	@Test
	public void Login() throws InterruptedException 
	{
	 LoginPage p = new LoginPage(driver);
	 
	 String us = Excel.ExcelSheet(PATH,"Sheet1",1, 0);
	 String pw = Excel.ExcelSheet(PATH,"Sheet1",2, 0);
	String name= "Nikhil";
	System.out.println("Name is"+name);
	 p.loginclk();
	 
	 p.loginclick();
	 
	 p.Username(us);
	 
	  p.Password(pw);
	
	 p.LoginBtn();
	 Thread.sleep(2000);
	 logOut l = new logOut(driver);
	 l.SignOut();
	 
			
	}

}
