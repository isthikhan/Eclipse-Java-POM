package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewSavingsObject {

	@FindBy(xpath="//*[@id=\"new-savings-menu-option\"]")
	public static WebElement newsavings;
	
	@FindBy(id="Savings")
	public static WebElement SavAcctype;
	@FindBy(id="Individual")
	public static WebElement SavAccIndi;
	@FindBy(id="name")
	public static WebElement savingsname;
	@FindBy(id="openingBalance")
	public static WebElement savopeningbalance;
	@FindBy(id="newSavingsSubmit")
	public static WebElement savingssubmit;
	
	}

