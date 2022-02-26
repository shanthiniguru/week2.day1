package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	public static void main(String[] args) {

		 //Open Browser
		 WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 
		 //Enter User name
		 WebElement elementUsername = driver.findElement(By.id("username"));
		 elementUsername.sendKeys("Demosalesmanager");
		 
		 //Enter Password
		 WebElement elementPassword = driver.findElement(By.id("password"));
		 elementPassword.sendKeys("crmsfa");
		 
		 //Click on Login Button
		 WebElement elementLoginButton = driver.findElement(By.className("decorativeSubmit"));
		 elementLoginButton.click();
		 
		 //Click on CRMSFA
		 WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
		 elementCRMSFA.click();
		 
		 //Click on Leads
		 WebElement elementLeads = driver.findElement(By.linkText("Leads"));
		 elementLeads.click();
		 
		 //Click on Create Lead Tab
		 WebElement elementCreateLead = driver.findElement(By.linkText("Create Lead"));
		 elementCreateLead.click();
		 
		 //Enter Company Name
		 WebElement elementCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		 elementCompanyName.sendKeys("L&T INFOTECH");
		 
		 //Enter First Name
		 WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		 elementFirstName.sendKeys("NISHA");
		 
		 //Enter Last Name
		 WebElement elementLastName = driver.findElement(By.id("createLeadForm_lastName"));
		 elementLastName.sendKeys("GURU");
		 
		 //Enter Last Name(Local)
		 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Prakash");
		 
		 //Enter Department Field
		 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		 
		 //Enter Description Field
		 driver.findElement(By.id("createLeadForm_description")).sendKeys("Create Lead Assignment1");
		 
		 //Enter your email in the E-mail address Field
		 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("shanthiniguru9@gmail.com");
		 
		 //Select State/Province as NewYork
		 WebElement elementDropDown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		 Select dd = new Select(elementDropDown);
		 dd.selectByValue("NY");
		 
		 
		 //Click on Create Lead Button
		 WebElement elementCreateLeadButton = driver.findElement(By.className("smallSubmit"));
		 elementCreateLeadButton.click();
		 
		 //Get the Title of Resulting Page
		 System.out.println(driver.getTitle());
		 

	}
	
}
