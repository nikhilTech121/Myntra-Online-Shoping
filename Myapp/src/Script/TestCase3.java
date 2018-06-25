package Script;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Generic.Baase_Test;
import Generic.Excel;
import Pom.Addtowishlist;
import Pom.LoginPage;
import Pom.ProdutSelect;
import Pom.logOut;


public class TestCase3 extends Baase_Test
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
		 //Selecting a product
		 ProdutSelect s = new ProdutSelect(driver);
		 s.Product(driver);
		 Thread.sleep(2000);
		 
		 //click to cart
		Addtowishlist add = new Addtowishlist(driver);
		add.Cartclick();
		Thread.sleep(2000);
		add.movtowish();
		Thread.sleep(2000);
		add.myntralogo();
		Thread.sleep(2000);
		 //Log out
		 logOut l = new logOut(driver);
		 l.SignOut();
		 
	}
	
	

}
