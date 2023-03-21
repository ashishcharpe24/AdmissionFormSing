package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoParallel {
	WebDriver driver;
	@Parameters("browser")
	@Test
	
	public void parallelExecution(String browser) throws InterruptedException
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			ChromeOptions opt = new ChromeOptions();
			opt.setAcceptInsecureCerts(true);
			driver = new ChromeDriver(opt);
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.chromedriver().setup();
			ChromeOptions opt = new ChromeOptions();
			opt.setAcceptInsecureCerts(true);
			driver = new ChromeDriver(opt);
			
//			WebDriverManager.edgedriver().setup();
//			EdgeOptions optE=new EdgeOptions();
//			optE.setAcceptInsecureCerts(true);
//			driver = new EdgeDriver(optE );
		}
		
		driver.get("https://10.200.102.52/Adm/AdmissionForm/");
		Thread.sleep(5000);
//		WebElement country = driver.findElement(By.xpath("//select[@name='Country']"));
//		Select conSel = new Select(country);
//		//conSel.selectByVisibleText("Singapore");
//		conSel.selectByVisibleText("Singapore");
//		Thread.sleep(2000);
//		
//		WebElement campus = driver.findElement(By.xpath("//select[@name='Campus']"));
//		Select camSel = new Select(campus);
//		//camSel.selectByVisibleText("East Coast");
//		camSel.selectByVisibleText("Nanyang");
//		Thread.sleep(2000);
		
		WebElement AdmissionFor = driver.findElement(By.xpath("//select[@name='AdmissionFor']"));
		Select admSel = new Select(AdmissionFor);
		admSel.selectByVisibleText("2023-2024");
		Thread.sleep(2000);
		
		WebElement firstName = driver.findElement(By.xpath("//input[@name='FatherFirstName1']"));
		firstName.sendKeys("TestDummyAutoTwo");
		Thread.sleep(2000);
		
		WebElement lastName = driver.findElement(By.xpath("//input[@name='FatherLastName']"));
		lastName.sendKeys("Mother");
		Thread.sleep(2000);
		
		WebElement eMail = driver.findElement(By.xpath("//input[@name='FatherEmailAddress']"));
		eMail.sendKeys("ashish.charpe@giftechnologies.com");
		Thread.sleep(2000);
		
		WebElement mobNum = driver.findElement(By.xpath("//input[@name='FatherhMobileNumber']"));
		mobNum.sendKeys("12345432");
		Thread.sleep(2000);
		
		WebElement relation = driver.findElement(By.xpath("//select[@name='RelationWithStudent']"));
		Select relSel = new Select(relation);
		relSel.selectByVisibleText("Mother");
		Thread.sleep(2000);
		
		String parent="Mother";
		Thread.sleep(2000);
		if(parent.equalsIgnoreCase("Father"))
		{
			driver.findElement(By.xpath("//input[@value='Father']")).click();
			
		}
		else if(parent.equalsIgnoreCase("Mother"))
		{
			driver.findElement(By.xpath("//input[@value='Mother']")).click();
			
		}
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='SaveAndContinueButtonPageOne']")).click();
		Thread.sleep(10000);
	}
}
