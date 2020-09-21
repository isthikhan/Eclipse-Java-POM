package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObject.CheckingObject;
import pageObject.LoginObject;

public class ViewChecking {

	@Test
	public void VieChecking() {
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
	CheckingObject.Viewchecking.click();
	driver.quit();
}
}
