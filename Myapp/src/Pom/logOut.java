package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logOut 
{
		@FindBy(xpath="//span[@class='myntraweb-sprite desktop-iconUser sprites-user']")
		private WebElement signIn;
		@FindBy(xpath="//div[.=' Logout ']")
		private WebElement logout;
		
		public logOut(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
	public void SignOut() throws InterruptedException
	{
		signIn.click();
		Thread.sleep(3000);
		logout.click();
	}
}
