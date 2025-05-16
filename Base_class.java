package university;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Base_class {
	public ChromeDriver driver;
	@BeforeClass
	public void start()
	{
		 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://deb.ugc.ac.in/College/StudentDEBId/Index");
	}
	
	@AfterClass
	public void sample() throws IOException
	{
		driver.quit();
	}
	
	@BeforeMethod
	public void startM() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement Applicant_FullName = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("InstituteID")));
		Applicant_FullName.sendKeys("HEI-U-0037");
		
		WebElement password = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("txtPassword")));
		password.sendKeys("INF@123");
		Thread.sleep(6000);
		
		WebElement signin = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("btnLogin")));
		signin.click();
		Thread.sleep(600);
		
	}
	
	@AfterMethod
	public void endM()
	{
		
	}
}
