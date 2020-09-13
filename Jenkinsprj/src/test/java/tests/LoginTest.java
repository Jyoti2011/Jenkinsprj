package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class LoginTest 
{
	@Test 
	 
	public void TestFireFox()
	{
		System.setProperty("webdriver.gecko.driver","F:\\Selenium\\Drivers\\geckodriver-v0.27.0-win64\\geckodriver.exe"); 
		WebDriver driver=new FirefoxDriver(); 
		// driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.quit(); 
		} 
	}

