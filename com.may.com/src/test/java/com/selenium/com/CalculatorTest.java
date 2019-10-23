package com.selenium.com;

/*import java.io.IOException;
import java.net.MalformedURLException;*/
import java.net.URL;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CalculatorTest {

	static AppiumDriver<MobileElement> driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			openCalcultor();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//System.out.println(e.getCause());
			System.out.println(e.getMessage());
		}

		
	}
	public static void openCalcultor() throws Exception {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Redmi");
		cap.setCapability("udid", "dd098af");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "8.1.0");
		cap.setCapability("automationName", "Uiautomator2");
		
		//Desired caps for application 
		cap.setCapability("appPackage", "com.miui.calculator");
		cap.setCapability("appActivity", "com.miui.calculator.cal.CalculatorTabActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url,cap);
		
		System.out.println("Application started...");
		
		MobileElement agree = driver.findElement(By.id("android:id/button1"));
		agree.click();
		System.out.println("Clicked on Agree option");
		MobileElement two = driver.findElement(By.id("com.miui.calculator:id/btn_2_s"));
		two.click();
		System.out.println("Clicked on number selected");
		MobileElement operation = driver.findElement(By.id("com.miui.calculator:id/btn_mul_s"));
		operation.click();
		MobileElement nine = driver.findElement(By.id("com.miui.calculator:id/btn_9_s"));
		nine.click();
		System.out.println("Clicked on number selected");
		MobileElement result = driver.findElement(By.id("com.miui.calculator:id/btn_equal_s"));
		result.click();
		System.out.println("Result is computed");
		/*MobileElement answer = driver.findElement(By.id("com.miui.calculator:id/cvv_cal_vertical_view"));
		answer.getText();
		System.out.println(answer.getText().toString());*/
		
		String e1 = driver.findElementByClassName("android.widget.LinearLayout").getCssValue("text");
		System.out.println(e1.toString());
		
	}

}
