package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		//Alert with Ok
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Alert alert = driver.switchTo().alert();
		String alertmessage=driver.switchTo().alert().getText();
		System.out.println(alertmessage);
		alert.accept();
		
		//Alert With Ok and Cancel
		driver.findElement(By.xpath("//*[@href='#CancelTab']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Alert alert2 = driver.switchTo().alert();
		String alertmessage2=driver.switchTo().alert().getText();
		System.out.println(alertmessage2);
		alert2.dismiss();
		
		//Alert With TextBox
		driver.findElement(By.xpath("//*[@href='#Textbox']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Alert alert3 = driver.switchTo().alert();
		String alertmessage3=driver.switchTo().alert().getText();
		System.out.println(alertmessage3);
		alert3.sendKeys(alertmessage3);
		alert3.accept();
		
	}

}
