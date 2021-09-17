package learntestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependenciesDemo {
	WebDriver driver;
	@Test(description="Test Case to Open Application")
	public void startApp()
	{
		System.out.println("Start Application");
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
	}
	@Test(dependsOnMethods = "startApp")
	public void loginApp()
	{
		System.out.println("login Application");
		driver.findElement(By.id("Email")).sendKeys("narasimhasai974@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("Dattasai98@");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	@Test(dependsOnMethods = "loginApp")
	public void signOff()
	{
		System.out.println("SignOff Application");
		driver.findElement(By.linkText("Log out")).click();
		driver.close();
	}
	@Test(dependsOnMethods = "signOff",alwaysRun = true)
	public void closeBrowser()
	{
		driver.close();
	}
}
