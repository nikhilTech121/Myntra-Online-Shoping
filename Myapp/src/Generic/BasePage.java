package Generic;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BasePage extends Baase_Test 
{	
	public void Element(WebElement element)
	{
		try {
		WebDriverWait w = new WebDriverWait(driver,10);
		w.until(ExpectedConditions.visibilityOf(element));
		Reporter.log("Element is present",true);
		}
		catch(Exception e)
		{
			Reporter.log("Element not found",true);
			Assert.fail();
		}
		}
	public void TitleVerify(String title)
	{
		try
		{
		WebDriverWait w = new WebDriverWait(driver,10);
		w.until(ExpectedConditions.titleIs(title));
		Reporter.log("Title is present",true);
	}
	catch(Exception e)
	{
	Reporter.log("title to match", true);
	Assert.fail();
	}
	}

}

