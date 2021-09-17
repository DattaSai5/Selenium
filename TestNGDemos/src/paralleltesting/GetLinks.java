package paralleltesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetLinks {
	@Test
	public void getLink()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		
		 List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		 System.out.println(allLinks.size());
		 for(WebElement link:allLinks)
		 {
			 System.out.println(link.getText());
		 }
		 driver.close();
	}
}
