package university;

import java.io.IOException;

import org.testng.annotations.Test;

public class Runner extends Base_class{
	@Test
	public void sample() throws IOException
	{
		
	
	Pom p =new Pom(driver);
	
	p.click();
	p.switchTab();
	p.Year();
	p.month();
	p.excel();
	
	
	
	
	}
}
