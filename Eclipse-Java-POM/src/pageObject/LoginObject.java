package pageObject;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginObject {

	@FindBy(id="username")
	public static WebElement UserName;
	@FindBy(id="password")
	public static WebElement Password;
	@FindBy(id="submit")
	public static WebElement Submit;
}
