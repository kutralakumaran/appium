package appium.appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiumBasics {

	@Test
	public void AppiumTest() throws MalformedURLException, InterruptedException {
		AppiumDriverLocalService sevice=new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\Kumaran's\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		sevice.start();
		UiAutomator2Options optionss=new UiAutomator2Options();
		optionss.getPlatformName();
		optionss.setDeviceName("kkphone");
		optionss.setApp("C:\\Users\\Kumaran's\\git\\repository\\appium\\src\\test\\java\\resources\\ApiDemos-debug.apk");
		
		
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"), optionss);
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")).click();
		driver.findElement(AppiumBy.id("android:id/checkbox")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("(//android.widget.RelativeLayout)[2]")).click();
		String name = driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(name,"WiFi settings");
		driver.findElement(AppiumBy.id("android:id/edit")).sendKeys("kumaran");
		driver.findElement(AppiumBy.id("android:id/button1")).click();
		
		
		driver.quit();
		sevice.stop();				
	}

}
