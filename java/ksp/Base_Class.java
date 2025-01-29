package ksp;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Base_Class {
public AppiumDriverLocalService Jspath;

public  AndroidDriver driver;
@BeforeTest
public void beforetest() throws MalformedURLException
{
	  UiAutomator2Options option = new UiAutomator2Options();

       Jspath=new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\pallavi\\AppData\\Roaming\\npm\\node_modules\\appium\\lib\\main.js")).withIPAddress("127.0.0.1")
      		.usingPort(4723).build();
      
      option.setDeviceName("Medium Phone");  // Replace with your device name
      option.setApp("D:/code/sddf/app/ApiDemos-debug.apk");  // Replace with your APK path
      option.setPlatformName("Android");  // Add platform name
      option.setAutomationName("UiAutomator2");  // Add automation name

      // Create the URL
      URI uri = URI.create("http://127.0.0.1:4723");
      URL url = uri.toURL();
      driver = new AndroidDriver(url, option);
}

@AfterTest
public void after()
{
	Jspath.stop();
	driver.quit();
}
}
