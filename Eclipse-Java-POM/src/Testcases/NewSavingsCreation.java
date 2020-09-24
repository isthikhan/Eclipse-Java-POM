package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObject.LoginObject;
import pageObject.NewSavingsObject;
import pageObject.SavingsObject;

public class NewSavingsCreation {

	
@Test
	
	public void createsavingsacc()
	{
	System.setProperty("webdriver.gecko.driver", "E:\\Automation\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://dbankdemo.com/login");

	PageFactory.initElements(driver, LoginObject.class);
	LoginObject.UserName.sendKeys("mohammedirshadkhan@gmail.com");
	LoginObject.Password.sendKeys("Test@123");
	LoginObject.Submit.click();
	
	PageFactory.initElements(driver, SavingsObject.class);
	SavingsObject.savings.click();
	
	PageFactory.initElements(driver, NewSavingsObject.class);
	NewSavingsObject.newsavings.click();
	NewSavingsObject.SavAcctype.click();
	NewSavingsObject.SavAccIndi.click();
	NewSavingsObject.savingsname.sendKeys("myones");
	NewSavingsObject.savopeningbalance.sendKeys("100");
	NewSavingsObject.savingssubmit.submit();
	
	SavingsObject.savingstext.isDisplayed();
	driver.quit();
	
	}


		
}	
