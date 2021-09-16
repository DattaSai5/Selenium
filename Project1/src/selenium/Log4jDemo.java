package selenium;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4jDemo {
	public static void main(String [] args) {
		Logger log = Logger.getLogger(Log4jDemo.class);
		PropertyConfigurator.configure("log4j.properties");
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		log.info("Opened Application");
		String expectedtitle = "Demo Web Shop. Login";
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals(expectedtitle))
		{
			System.out.println("Titles Match");
			log.info("Correct Title");
			driver.findElement(By.id("Email")).sendKeys("narasimhasai974@gmail.com");
			driver.findElement(By.name("Password")).sendKeys("Dattasai98@m");
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
			driver.findElement(By.linkText("Log out"));
			driver.close();
		}
	}
}
	
