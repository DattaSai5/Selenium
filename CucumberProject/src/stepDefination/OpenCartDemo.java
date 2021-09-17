package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCartDemo {
	public static void main(String [] args) {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "D:\\seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://demo.opencart.com/");
	driver.manage().window().maximize();
	String actualTitle = driver.getTitle();
	System.out.println(actualTitle);
	Assert.assertEquals("Your Store", actualTitle);
	driver.findElement(By.linkText("Desktops")).click();
	driver.findElement(By.linkText("Mac (1)")).click();
	String MACtitle = driver.getTitle();
	System.out.println(MACtitle);
	Assert.assertEquals("Mac", MACtitle);
	driver.findElement(By.id("input-sort")).click();
	driver.findElement(By.xpath("//select[@class='form-control']/option[@value='https://demo.opencart.com/index.php?route=product/category&path=20_27&sort=pd.name&order=ASC']")).click();
	//driver.findElement(By.linkText("Add to Cart")).click();
	driver.findElement(By.name("search")).sendKeys("Moniters");
	driver.findElement(By.xpath("//*[@class='btn btn-default btn-lg']")).click();
	driver.findElement(By.id("input-search")).clear();
	driver.findElement(By.id("description")).click();
	driver.findElement(By.id("button-search")).click();
	//driver.close();
	}
}
