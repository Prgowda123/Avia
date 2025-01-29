package abc;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.net.URI;
import java.net.URL;

public class AppiumTest {

    @Test
    public void main() throws Exception {
        // Set UiAutomator2Options (Capabilities)
        UiAutomator2Options option = new UiAutomator2Options();

        AppiumDriverLocalService Jspath=new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\pallavi\\AppData\\Roaming\\npm\\node_modules\\appium\\lib\\main.js")).withIPAddress("127.0.0.1")
        		.usingPort(4723).build();
        
        option.setDeviceName("Medium Phone");  // Replace with your device name
        option.setApp("D:/code/sddf/app/ApiDemos-debug.apk");  // Replace with your APK path
        option.setPlatformName("Android");  // Add platform name
        option.setAutomationName("UiAutomator2");  // Add automation name

        // Create the URL
        URI uri = URI.create("http://127.0.0.1:4723");
        URL url = uri.toURL();

        try {
            AndroidDriver driver = new AndroidDriver(url, option);
            System.out.println("AndroidDriver initialized successfully!");
            driver.findElement(AppiumBy.accessibilityId("Preference")).click();
            Thread.sleep(2000);

            driver.findElement(AppiumBy.accessibilityId("3. Preference dependencies")).click();
            Thread.sleep(2000);

            driver.findElement(AppiumBy.id("android:id/checkbox")).click();
            Thread.sleep(2000);

            driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"WiFi settings\"]")).click();
            Thread.sleep(2000);
           String text = driver.findElement(AppiumBy.id("android:id/alertTitle")).getText();
           
           System.out.println(text);


            driver.findElement(AppiumBy.id("android:id/edit")).sendKeys("abcdefg");
            Thread.sleep(2000);
            
            driver.findElement(AppiumBy.id("android:id/button1")).click();
            Thread.sleep(2000);




            // Quit driver after test
            driver.quit();
        } catch (Exception e) {
            System.err.println("Failed to initialize AndroidDriver.");
            e.printStackTrace();
        }

  
        System.out.println("Test execution complete.");
     
        Jspath.stop();
    }
}
