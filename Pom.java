package university;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.SelectableChannel;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pom extends utilities {
	 WebDriver driver;
	    WebDriverWait wait;
	    
	    @FindBy(xpath = "//a//div[@class='homePage_iconPart text-center']")
	private WebElement apikey;
	
	    public void switchTab() {
	        Set<String> windowHandles = driver.getWindowHandles(); // Now, no NullPointerException
	        List<String> tabs = new ArrayList<>(windowHandles);
	        driver.switchTo().window(tabs.get(1));
	    }
	@FindBy(id="Year")
	private WebElement year;
	
	@FindBy(id="session")
	private WebElement month;
	
	public Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void click()
	{
		apikey.click();
	}
	
	public void Year()
	{
		Select s=new Select(year);
		s.selectByIndex(2);
	}
	
	public void month()
	{
		Select s1=new Select(month);
		s1.selectByIndex(1);
	}
	public void excel() throws IOException {
		
		FileInputStream fis1 = new FileInputStream("D://Automation_data//SVU_Admission_20250401_4.xlsx");//"D:\steno\TestDataAPC.xlsx"
		XSSFWorkbook workbook = new XSSFWorkbook(fis1);
		Sheet sheet = workbook.getSheetAt(0);

		// Select select = null;
		int rowCount = sheet.getPhysicalNumberOfRows();
	for (int i = 1; i <=100; i++) { 
		 FileInputStream fis = null;// Start from row 1 to skip header
		Row row = sheet.getRow(i);
		
		if (row == null) {
			System.out.println("Skipping empty row: " + i);
			continue;
		}
        try {
		if (row != null) {
			String Applicant_id = getCellValue(row.getCell(0));
			//		String  Applicant_IdentityCard = getCellValue(row.getCell(2));
					
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
					
					
					WebElement Applicant_FullName1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='search']")));
					Applicant_FullName1.click();
					Applicant_FullName1.sendKeys(Applicant_id);
					
		}
        }	catch (Exception e) {
			System.out.println(i + " Failed due to an error in username or password");
			 
		}
}}}

