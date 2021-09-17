package pagefactorydemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPOM {
	WebDriver driver;
	@FindBy(name="Gender")
	WebElement gender;
	
	@FindBy(id="FirstName")
	WebElement firstname;
	
	@FindBy(id="LastName")
	WebElement lastname;
	
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(id="ConfirmPassword")
	WebElement confirm;
	
	@FindBy(id="register-button")
	WebElement register;
	
	@FindBy(xpath="//a[@class='ico-logout']")
	WebElement logoutbtn;
	
	@FindBy(xpath="//a[@class='ico-login']")
	WebElement loginbtn;
	
	@FindBy(name="Email")
	WebElement loginemail;
	
	@FindBy(id="Password")
	WebElement loginpassword;
	
	@FindBy(xpath ="//*[@value='Log in']")
	WebElement login2btn;
	
	
	public RegisterPOM(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickGender()
	{
		gender.click();
	}
	
	public void sendFirstName(String fn)
	{
		firstname.sendKeys(fn);
	}
	
	public void sendLastName(String ln)
	{
		lastname.sendKeys(ln);
	}
	
	public void sendEmail(String eml)
	{
		email.sendKeys(eml);
	}
	
	public void sendPassword(String ps)
	{
		password.sendKeys(ps);
	}
	
	public void sendConfirmPassword(String cp)
	{
		confirm.sendKeys(cp);
	}
	
	public void clickRegister()
	{
		register.click();
	}
	
	public void clickLogOut()
	{
		logoutbtn.click();
	}
	
	public void clickLogIn()
	{
		loginbtn.click();
	}
}
