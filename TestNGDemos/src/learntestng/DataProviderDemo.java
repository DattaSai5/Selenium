package learntestng;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class DataProviderDemo {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String email, String password) {
	  driver.get("http://demowebshop.tricentis.com/login");
	  driver.manage().window().maximize();
	  driver.findElement(By.id("Email")).sendKeys(email);
	  driver.findElement(By.name("Password")).sendKeys(password);
	  driver.findElement(By.xpath("//input[@value='Log in']")).click();
	  driver.findElement(By.linkText("Log out")).click();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] {"narasimhasai974@gmail.com", "Dattasai98@m"},
      new Object[] { "dattasai98.m@gmail.com","Dattasai98@m"},
    };
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
