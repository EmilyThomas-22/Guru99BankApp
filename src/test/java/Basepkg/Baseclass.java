package Basepkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Baseclass {
public WebDriver driver;
	
	@BeforeClass
	public void precondition()
	{
		driver= new ChromeDriver();
		driver.get("https://www.demo.guru99.com/V4");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
	}
//	@AfterClass
//	public void postCondition()
//	{
//		driver.quit();
//	}


}
