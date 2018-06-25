package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUs 
{	
	@FindBy(xpath="(//a[@class='desktop-preHeaderLinks'])[3]")
	private WebElement cont;
	
	public ContactUs(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void contact()
	{
		cont.click();
	}
}
