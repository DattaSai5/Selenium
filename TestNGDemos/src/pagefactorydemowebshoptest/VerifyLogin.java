package pagefactorydemowebshoptest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagefactorydemo.LoginPOM;

public class VerifyLogin {
	@Test
	public void validateLogin()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		
		LoginPOM loginPage = PageFactory.initElements(driver, LoginPOM.class);
		loginPage.sendEmail("narasimhasai974@gmail.com");
		loginPage.sendPassword("Dattasai98@m");
		loginPage.clickLogin();
		driver.close();
	}
}
