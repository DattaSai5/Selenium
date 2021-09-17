package learntestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PriorityDemo {
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
	@Test(priority = 1,description="Test Case2 to Login Application")
	public void loginApp()
	{
		System.out.println("login Application");
		driver.findElement(By.id("Email")).sendKeys("narasimhasai974@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("Dattasai98@m");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	@Test(priority = 2,description="Test Case3 to SignOff Application")
	public void signOff()
	{
		System.out.println("SignOff Application");
		driver.findElement(By.linkText("Log out")).click();
		driver.close();
	}
}
