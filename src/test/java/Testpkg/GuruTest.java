package Testpkg;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.Test;

import Basepkg.Baseclass;
import Pagepkg.GuruPage;
import Utilities.Excelutilities;

public class GuruTest extends Baseclass {
	
	@Test
	public void test1() //title verification
	{
		String actual=driver.getTitle();
		String expect="Guru99 Bank Home Page";
		Assert.assertEquals(actual, expect,"title failed");
		
	}
	
	@Test
	public void testlogo()  //logo verification
	{
		WebElement logo=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/a/img"));
		Boolean logodisplay=logo.isDisplayed();
		if(logodisplay)
		{
			System.out.println("Logo is displayed");
		}
		else
		{
			System.out.println("failed");
		}
	}
	@Test
	public void testlogin() throws Exception
	{
		
		GuruPage g1=new GuruPage(driver);
	    String xl="C:\\Users\\Emily\\Documents\\RHSBook.xlsx";
	    String Sheet="Sheet4";
	    int rowCount=Excelutilities.getRowCount(xl, Sheet);
	    
	    for(int i=1;i<=rowCount;i++)
	    	
	    {

		String Username=Excelutilities.getCellValues(xl, Sheet, i, 0);
		System.out.println("username----"+Username);
		driver.navigate().refresh();
		String Password=Excelutilities.getCellValues(xl, Sheet, i, 1);
		System.out.println("password----"+Password);
		//driver.navigate().refresh();		
		g1.setvalues(Username, Password);
//		driver.navigate().refresh();
//		driver.navigate().back();
		g1.newcustomerdetails("Sanjana","06/10/2000","choonappuzhayil","idukki","kerala","685509","8670970006","sanjanasanjuz@gmail.com","sanjana@123");
//		TakesScreenshot screenshot = (TakesScreenshot) driver;
//        File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
//
//        // Define the destination path for the screenshot
//        File destinationFile = new File("./screenshotreg/customers.png");
//
//        // Copy the file to the desired location
//        FileHandler.copy(sourceFile, destinationFile);
//
//        // Print message on successful capture
//        System.out.println("Screenshot captured successfully!");
	 	g1.newaccountdetails("32986","10000");
		g1.withdrawal("32986","5000","savings");
		g1.logout();
		
		
		
	
	    }
	}
	

}
