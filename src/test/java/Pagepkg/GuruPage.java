package Pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GuruPage {
	
	WebDriver driver;
	@FindBy(xpath="/html/body/form/table/tbody/tr[1]/td[2]/input")
	WebElement userid;
	@FindBy(xpath="/html/body/form/table/tbody/tr[2]/td[2]/input")
	WebElement password;
	@FindBy(xpath="/html/body/form/table/tbody/tr[3]/td[2]/input[1]")
	WebElement login;
	@FindBy(xpath="/html/body/div[3]/div/ul/li[2]/a")
	WebElement newcustomer;
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")
	WebElement customername;
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]")
	WebElement customergender;
	@FindBy(xpath="//*[@id=\"dob\"]")
	WebElement customerdob;
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/textarea")
	WebElement customeraddress;
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input")
	WebElement customercity;
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[9]/td[2]/input")
	WebElement customerstate;
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[10]/td[2]/input")
	WebElement customerpin;
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input")
	WebElement customernumber;
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[12]/td[2]/input")
	WebElement customeremail;
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[13]/td[2]/input")
	WebElement customerpassword;
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[14]/td[2]/input[1]")
	WebElement customersubmit;
	@FindBy(xpath="/html/body/div[3]/div/ul/li[5]/a")
	WebElement newaccount;
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[2]/td[2]/input")
	WebElement customerid;
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")
	WebElement accountdeposit;
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]")
	WebElement accountsubmit;
	@FindBy(xpath="/html/body/div[3]/div/ul/li[9]/a")
	WebElement withdrawal;
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input")
	WebElement withdrawalaccno;
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/input")
	WebElement withdrawalamount;
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input")
	WebElement withdrawaldescription;
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[12]/td[2]/input[1]")
	WebElement withdrawalsubmit;
	@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
	WebElement logout;
	
	
	
	
	
	
	
	
	
	

//	WebElement customername;
	
	
	
	public GuruPage(WebDriver driver)
	{
		 this.driver=driver;
		    PageFactory.initElements(driver, this);
	}
	
	 public void setvalues(String Email,String Password)
	 {
		userid.sendKeys(Email); 
		password.sendKeys(Password);
		login.click();
	 }
	 
	 public void newcustomerdetails(String name,String dob,String address,String city,String state,String pin,String num,String email,String password )
	 {
		 newcustomer.click();
		 customername.sendKeys(name);
		 customergender.click();
		 customerdob.sendKeys(dob);
		 customeraddress.sendKeys(address);
		 customercity.sendKeys(city);
		 customerstate.sendKeys(state);
		 customerpin.sendKeys(pin);
		 customernumber.sendKeys(num);
		 customeremail.sendKeys(email);
		 customerpassword.sendKeys(password);
		 customersubmit.click();
	 }
	 public void newaccountdetails(String id,String deposit)
	 {
		 newaccount.click();
		 customerid.sendKeys(id);
		 accountdeposit.sendKeys(deposit);
		 accountsubmit.click();
	 }
	 public void withdrawal(String accno,String amount,String descrip)
	 {
		 withdrawal.click();
		 withdrawalaccno.sendKeys(accno);
		 withdrawalamount.sendKeys(amount);
		 withdrawaldescription.sendKeys(descrip);
		 withdrawalsubmit.click();
	 }
	public void logout()
	{
		logout.click();
	}

}
