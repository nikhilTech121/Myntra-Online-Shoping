package Script;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Generic.Baase_Test;
import Generic.Excel;
import Pom.LoginPage;
import Pom.ProdutSelect;
import Pom.logOut;

public class TestCase2 extends Baase_Test
{
	@Test
	public void login2() throws InterruptedException
	{
		LoginPage p = new LoginPage(driver);
		
		 String us = Excel.ExcelSheet(PATH,"Sheet1",1, 0);
		 String pw = Excel.ExcelSheet(PATH,"Sheet1",2, 0);
		 p.loginclk();
		 
		 p.loginclick();
		 
		 p.Username(us);
		 
		  p.Password(pw);
		
		 p.LoginBtn();
		 
		 //selecting the item
		ProdutSelect s = new ProdutSelect(driver);
		 s.Product(driver);
		 Thread.sleep(2000);
		 //log out
		 logOut l = new logOut(driver);
		 l.SignOut();
	}
	
}
