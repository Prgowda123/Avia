package ksp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class sample {
@Test
public void apc() throws MalformedURLException, AWTException, InterruptedException
{
	 UiAutomator2Options option = new UiAutomator2Options();

     AppiumDriverLocalService Jspath = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\pallavi\\AppData\\Roaming\\npm\\node_modules\\appium\\lib\\main.js")).withIPAddress("127.0.0.1")
    		.usingPort(4723).build();
    
    option.setDeviceName("Medium Phone");  // Replace with your device name
    
    option.setPlatformName("Android");  // Add platform name
    option.setAutomationName("UiAutomator2");  // Add automation name

    // Create the URL
    URI uri = URI.create("http://127.0.0.1:4723");
    URL url = uri.toURL();
    AndroidDriver driver = new AndroidDriver(url, option);
    
    driver.findElement(AppiumBy.accessibilityId("Chrome")).click();
    Thread.sleep(2000);
    WebElement c = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"com.android.chrome:id/search_box_text\"]"));
    Thread.sleep(2000);
    c.click();
    Thread.sleep(2000);
    WebElement d = driver.findElement(AppiumBy.id("com.android.chrome:id/url_bar"));
    d.sendKeys("ksp");
    Robot r=new Robot();
    r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_ENTER);
    Thread.sleep(4000);
    driver.findElement(AppiumBy.xpath("//android.view.View[@text=\"ksp-recruitment.in\"]")).click();
    Thread.sleep(4000);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

try {
	
    wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.androidUIAutomator(
    	    "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(\"CLICK HERE TO GO TO RECRUITMENT - 2022\"));")));
}
catch(Exception e) {
	
}
Thread.sleep(4000);
driver.findElement(AppiumBy.xpath("//android.widget.Button[@text=\"CLICK HERE TO GO TO RECRUITMENT - 2022\"]")).click();
Thread.sleep(4000);
DeviceRotation ro = new DeviceRotation(0, 0, 90);
driver.rotate(ro);
Thread.sleep(4000);
try {

    driver.findElement(AppiumBy.androidUIAutomator(
    	    "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Apply Online\"]\"));"));
}
catch(Exception e) {
	
}
Thread.sleep(4000);

try {
	wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.androidUIAutomator(
    	    "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(\"(//android.widget.TextView[@text=\"Apply Now\"])[1]\"));")));

}
catch(Exception e) {
	
}
//WebElement abc = driver.findElement(AppiumBy.xpath("//android.view.View[@text=\"Police Constable (Civil) (Men & Women) & (Transgender Men & Women) & Inservice & Backlog\"]"));
//
//JavascriptExecutor jss = (JavascriptExecutor) driver;
//jss.executeScript("mobile: longClickGesture", ImmutableMap.of( "elementId", ((RemoteWebElement) abc).getId(),
//		    "direction", "left",
//		    "percent", 0.75
//		));


}
}
