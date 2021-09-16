package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogin 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		String expectedtitle = "Demo Web Shop. Login";
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		if(expectedtitle.equals(actualtitle))
		{
			System.out.println("You are on Right Page");
			driver.findElement(By.id("Email")).sendKeys("narasimhasai974@gmail.com");
			driver.findElement(By.name("Password")).sendKeys("Dattasai98@m");
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
			//driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
			driver.findElement(By.linkText("Log out")).click();
			driver.close();
		}
		else
		{
			System.out.println("You are on Wrong Page");
			driver.close();
		}
	}
}
