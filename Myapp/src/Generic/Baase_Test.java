package Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baase_Test implements Constant
{
	public WebDriver driver;
	@BeforeMethod
	public void openPage()
	{	
		System.setProperty(KEY,VALUE);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = Excel.ExcelSheet(PATH, "Sheet1", 0, 0);
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@AfterMethod
	public void closeApp()
	{
		driver.close();
	}
}
