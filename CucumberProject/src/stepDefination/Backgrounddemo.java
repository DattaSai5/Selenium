package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Backgrounddemo {
	WebDriver driver;
	@Given("^I am on the home page demowebshop$")
	public void i_am_on_the_home_page_demowebshop() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.manage().window().maximize();
	}

	@Then("^I should see the title contains \"([^\"]*)\"$")
	public void i_should_see_the_title_contains(String arg1) throws Throwable {
	    assert driver.getTitle().contains("Shop");
	    driver.close();
	}

	@Then("^I should see the source contains \"([^\"]*)\"$")
	public void i_should_see_the_source_contains(String arg1) throws Throwable {
	    assert driver.getPageSource().contains("Shop");
	    driver.close();
	}
}
