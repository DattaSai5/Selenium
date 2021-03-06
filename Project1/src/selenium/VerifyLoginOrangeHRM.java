package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerifyLoginOrangeHRM {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.id("welcome")).click();
	    
	    //Explicit Wait
	    WebDriverWait Mywait = new WebDriverWait(driver,10);
	    Mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/index.php/auth/logout']")));
	    
	    driver.findElement(By.xpath("//a[@href='/index.php/auth/logout']")).click();
	    //driver.findElement(By.linkText("Logout")).click();
	    driver.close();
	}

}
