package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObject.LoginObject;

public class Loginpage {

	@Test
	public void login() {

		System.setProperty("webdriver.gecko.driver",
				"E:\\Automation\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://dbankdemo.com/login");
		PageFactory.initElements(driver, LoginObject.class);
		LoginObject.UserName.sendKeys("mohammedirshadkhan@gmail.com");
		LoginObject.Password.sendKeys("Test@123");
		LoginObject.Submit.click();
	driver.quit();
				
				
	}
}
