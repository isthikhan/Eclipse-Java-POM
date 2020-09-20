package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginObject {

	public static WebElement UserName(WebDriver driver) {
		return driver.findElement(By.id("Username"));	
	}

	public static WebElement Password(WebDriver driver) {
		return driver.findElement(By.id("password"));
	}

	public static WebElement Submit(WebDriver driver) {
		return driver.findElement(By.id("submit"));
	}
}
