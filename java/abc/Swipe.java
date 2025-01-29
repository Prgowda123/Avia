package abc;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Swipe {
@Test
public void sample() throws MalformedURLException
{
	UiAutomator2Options option = new UiAutomator2Options();
	
	AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\pallavi\\AppData\\Roaming\\npm\\node_modules\\appium\\lib\\main.js")).usingPort(4723).build();
	option.setDeviceName("Medium Phone");
	option.setApp("D:/code/sddf/app/ApiDemos-debug.apk");
	option.setPlatformName("Android");
	option.setAutomationName("UiAutomator2");
	
	URI uri = URI.create("http://127.0.0.1:4723");
	URL url = uri.toURL();
	
	AndroidDriver driver = new AndroidDriver(url, option);
	driver.findElement(AppiumBy.accessibilityId("Views")).click();
	driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
	driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
	WebElement swipe = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[1]"));
	JavascriptExecutor jss = (JavascriptExecutor) driver;
	 jss.executeScript("mobile: longClickGesture", ImmutableMap.of( "elementId", ((RemoteWebElement) swipe).getId(),
			    "direction", "left",
			    "percent", 0.75
			));
	
	service.stop();
	driver.quit();
	
	
}
}
