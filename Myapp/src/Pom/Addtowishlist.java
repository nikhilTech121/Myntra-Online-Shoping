package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.Baase_Test;

public class Addtowishlist 
{
	@FindBy(xpath="//span[@class='myntraweb-sprite desktop-iconBag sprites-bag']")
	private WebElement cartclick;
	
	@FindBy(xpath="(//span[.='MOVE TO WISHLIST'])[1]")
	private WebElement movtowish;
	
	@FindBy(xpath="//span[@class='myntra-logo']")
	private WebElement myntra;
	
	public Addtowishlist(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Cartclick()
	{
		cartclick.click();
	}
	public void movtowish()
	{
		movtowish.click();
	}
	public void myntralogo()
	{
		myntra.click();
	}
	
	
}
