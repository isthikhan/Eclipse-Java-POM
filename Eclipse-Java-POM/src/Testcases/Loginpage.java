package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObject.LoginObject;

public class Loginpage {

	@Test
	public void login() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\THI1805386\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://dbankdemo.com/login");
		LoginObject.UserName(driver).sendKeys("mohammedirshadkhan@gmail.com");
		LoginObject.Password(driver).sendKeys("Test@123");
		LoginObject.Submit(driver).click();

	}
}
