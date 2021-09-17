package demowenshoptest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pompackage.LoginPagePOM;

public class ValidateLogin {
	@Test
	public void checkLogin()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		
		LoginPagePOM login = new LoginPagePOM(driver);
		login.enterEmail("narasimhasai974@gmail.com");
		login.enterPassword("Dattasai98@m");
		login.clickSignin();
	}
}
