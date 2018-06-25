package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProdutSelect
{
	@FindBy(xpath="//a[@data-index='0']")
	private WebElement menlink;
	
	@FindBy(xpath="(//a[.='T-Shirts'])[1]")
	private WebElement shirt;
	
	@FindBy(xpath=("(//span[@class='product-strike'])[1]"))
	private WebElement selItem;
	
	@FindBy(xpath="(//button[@class='size-buttons-size-button size-buttons-size-button-default'])[4]")
	private WebElement size;
	
	@FindBy(xpath="//div[@class='myntraweb-sprite pdp-whiteBag sprites-whiteBag pdp-flex pdp-center']")
	private WebElement addcart;
	
	//intilization
	public ProdutSelect(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Utilization
	public void Product(WebDriver driver) throws InterruptedException
	{
		//menlink.click();
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		a.moveToElement(menlink).perform();
		Thread.sleep(2000);
		shirt.click();
		Thread.sleep(2000);
		selItem.click();
		Thread.sleep(2000);
		size.click();
		Thread.sleep(2000);
		addcart.click();
	}
	
	
	
}
