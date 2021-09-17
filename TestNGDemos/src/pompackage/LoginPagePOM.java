package pompackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPagePOM {
	WebDriver driver;
	By email = By.id("Email");
	By password = By.name("Password");
	By signin = By.xpath("//*[@value='Log in']");
	
	public LoginPagePOM(WebDriver driver)
	{
		this.driver = driver;
	}
	public void enterEmail(String EM)
	{
		driver.findElement(email).sendKeys(EM);
	}
	public void enterPassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	public void clickSignin()
	{
		driver.findElement(signin).click();
	}
}
