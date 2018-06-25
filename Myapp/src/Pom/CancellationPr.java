package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancellationPr
{
	@FindBy(xpath="//a[@href='/faqs#cancel']")
	private WebElement cancel;
	
	public CancellationPr(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	public void cancel()
	{
		cancel.click();
	}
}
