package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckingObject {
	
	
	@FindBy(xpath="//*[@id=\"main-menu\"]/ul/li[2]/a")
	public static WebElement checking;
	
	@FindBy(xpath="//*[@id=\"main-menu\"]/ul/li[2]/ul/li[1]/a")
	public static WebElement Viewchecking;
	
	@FindBy(xpath="//*[@id=\"main-menu\"]/ul/li[2]/ul/li[2]/a")
	public static WebElement Newchecking;

	

}
