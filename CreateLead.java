package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Demosalesmanager");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		WebElement link = driver.findElement(By.linkText("CRM/SFA"));
		link.click();
		WebElement leads = driver.findElement(By.linkText("Leads"));
		leads.click();
		WebElement createlead = driver.findElement(By.linkText("Create Lead"));
		createlead.click();
		WebElement company = driver.findElement(By.id("createLeadForm_companyName"));
		company.sendKeys("Simplesolve");
		WebElement firstname = driver.findElement(By.id("createLeadForm_firstName"));
		firstname.sendKeys("Dinesh");
		WebElement lastname = driver.findElement(By.id("createLeadForm_lastName"));
		lastname.sendKeys("Balakrishnan");
		WebElement locale = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		locale.sendKeys("Raj");
		WebElement dept = driver.findElement(By.name("departmentName"));
		dept.sendKeys("QA");
		WebElement Desc = driver.findElement(By.id("createLeadForm_description"));
		Desc.sendKeys("Test"); 
		WebElement email = driver.findElement(By.id("createLeadForm_primaryEmail"));
		email.sendKeys("Test@gmail.com"); 	
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")); 
		Select d = new Select(state); d.selectByVisibleText("New York");
		WebElement createbutton = driver.findElement(By.className("smallSubmit"));
		createbutton.click();
		String t = driver.getTitle();
		System.out.println(t);
	}

}
