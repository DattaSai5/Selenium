package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeActivity {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://demowebshop.tricentis.com/");
	    driver.manage().window().maximize();
	    String expectedtitle = "Demo Web Shop";
	    String title=driver.getTitle();
		System.out.println(title);
		int titlelength = driver.getTitle().length();
		System.out.println(titlelength);
		String expectedurl = "http://demowebshop.tricentis.com/";
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if(url.equals(expectedurl))
		{
			System.out.println("Correct page is opened");
		}
		else
		{
			System.out.println("Wrong page is opened");
		}
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
		int pagesourcelength = driver.getPageSource().length();
		System.out.println(pagesourcelength);
		driver.close();
	}

}
