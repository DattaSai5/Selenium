package paralleltesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTestingDemo {
	WebDriver driver;
	@Test
	public void Test1()
	{
		System.out.println("Test1   " + Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		//driver.manage().window().maximize();
	}
	@Test
	public void Test2()
	{
		System.out.println("Test2   " + + Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		//driver.manage().window().maximize();
	}
}
