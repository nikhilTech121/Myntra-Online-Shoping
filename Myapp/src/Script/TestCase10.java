package Script;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Generic.Baase_Test;
import Generic.Excel;
import Pom.Addtowishlist;
import Pom.LoginPage;
import Pom.ProdutSelect;
import Pom.placeorders;

public class TestCase10 extends Baase_Test
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
	
	 p.LoginBtn();
	 Thread.sleep(2000);
	 ProdutSelect s = new ProdutSelect(driver);
	 s.Product(driver);
	 Thread.sleep(2000);
	 Addtowishlist add = new Addtowishlist(driver);
		add.Cartclick();
		Thread.sleep(2000);
		placeorders pla = new placeorders(driver);
		pla.porder();
		Thread.sleep(2000);
		pla.pinc("210306");
		Thread.sleep(2000);
		pla.loc("Greaternoida", "sriom");
		Thread.sleep(2000);
		pla.address("Rsd hostel,kw-3,greater noida", "7895412278");
		Thread.sleep(2000);
		pla.checks();
		
	}
}
