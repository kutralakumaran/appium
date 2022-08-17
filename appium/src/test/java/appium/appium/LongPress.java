package appium.appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class LongPress {
	public void Press() throws MalformedURLException, InterruptedException {
		AppiumDriverLocalService sevice=new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\Kumaran's\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		sevice.start();
		UiAutomator2Options optionss=new UiAutomator2Options();
		optionss.getPlatformName();
		optionss.setDeviceName("kkphone");
		optionss.setApp("C:\\Users\\Kumaran's\\git\\repository\\appium\\src\\test\\java\\resources\\ApiDemos-debug.apk");
		
		
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"), optionss);
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
		driver.findElement(By.xpath("//android.widget.TextView[text()='People Names']"));
		driver.executeScript("m", null)
		
		driver.quit();
		sevice.stop();				
	}
}
