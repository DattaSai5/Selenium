package pagefactorydemowebshoptest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagefactorydemo.LoginPOM;
import pagefactorydemo.RegisterPOM;

public class VerifyRegister {
	@Test
	public void validateRegister()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		RegisterPOM registerPage = PageFactory.initElements(driver, RegisterPOM.class);
		registerPage.clickGender();
		registerPage.sendFirstName("Datta");
		registerPage.sendLastName("Sai");
		registerPage.sendEmail("dattasai.m@gmail.com");
		registerPage.sendPassword("Dattasai98");
		registerPage.sendConfirmPassword("Dattasai98");
		registerPage.clickRegister();
		registerPage.clickLogOut();
		registerPage.clickLogIn();
		
		LoginPOM loginPage = PageFactory.initElements(driver, LoginPOM.class);
		loginPage.sendEmail("dattasai000.m@gmail.com");
		loginPage.sendPassword("Dattasai98");
		loginPage.clickLogin();
		driver.close();
	}
}
