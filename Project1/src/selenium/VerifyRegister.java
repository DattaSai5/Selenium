package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyRegister {
	public static void main(String [] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Likith");
		driver.findElement(By.id("LastName")).sendKeys("Mallela");
		driver.findElement(By.id("Email")).sendKeys("likith.m@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("likith");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("likith");
		driver.findElement(By.id("register-button")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
	}
}
