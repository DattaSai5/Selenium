package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Signin {
	WebDriver driver;
	@Given("^User is on login page$")
	public void user_is_on_login_page() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
	}

	@When("^user enters email and password and click on login button$")
	public void user_enters_email_and_password_and_click_on_login_button() throws Throwable {
		driver.findElement(By.id("Email")).sendKeys("narasimhasai974@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("Dattasai98@m");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

	@Then("^user should see logout link$")
	public void user_should_see_logout_link() throws Throwable {
		boolean view = driver.findElement(By.linkText("Log out")).isDisplayed();
		Assert.assertTrue(view);
		driver.findElement(By.linkText("Log out")).click();
		driver.close();
	}
}
