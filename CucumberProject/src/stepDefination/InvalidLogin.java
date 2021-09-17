package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class InvalidLogin {
	WebDriver driver;
	@Given("^user on demowenshop login page$")
	public void user_on_demowenshop_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
	}

	@When("^user enter invalid credentials$")
	public void user_enter_invalid_credentials() throws Throwable {
		driver.findElement(By.id("Email")).sendKeys("narasimhasai974@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("Dattasai98");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

	@Then("^user should see message \"([^\"]*)\"$")
	public void user_should_see_message(String arg1) throws Throwable {
	    String meesage = driver.findElement(By.xpath("//*[contains(text(),'Login was unsuccessful. Please correct the errors and try again.')]")).getText();
	    Assert.assertEquals("Invalid Credentials", meesage);
	    driver.close();
	}
}
