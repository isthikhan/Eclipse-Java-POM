package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObject.CheckingObject;
import pageObject.LoginObject;
import pageObject.NewCheckingObject;

public class InterestChecking {

	@Test
	public void InterestCheckingCreation() {

		System.setProperty("webdriver.gecko.driver", "E:\\Automation\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://dbankdemo.com/login");

		PageFactory.initElements(driver, LoginObject.class);
		LoginObject.UserName.sendKeys("mohammedirshadkhan@gmail.com");
		LoginObject.Password.sendKeys("Test@123");
		LoginObject.Submit.click();

		PageFactory.initElements(driver, CheckingObject.class);
		CheckingObject.checking.click();
		CheckingObject.Newchecking.click();

		PageFactory.initElements(driver, NewCheckingObject.class);
		NewCheckingObject.interestchecking.click();
		NewCheckingObject.Individual.click();
		NewCheckingObject.name.sendKeys("Interestone");
		NewCheckingObject.openingBalance.sendKeys("55");
		NewCheckingObject.newchekingsubmit.submit();
		driver.quit();
	}
}
