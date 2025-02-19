package pom;

import java.awt.AWTException;
import java.text.ParseException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(pom.ListerImplementation.class)
public class Runner extends Base_class{
@Test
public void sample() throws InterruptedException, ParseException, AWTException
{
	Pom_class pom=new Pom_class(driver);
	pom.newapp();
	pom.switc();
	pom.scr();
	pom.agree();
	pom.switc();
	pom.excel();
}		
}
