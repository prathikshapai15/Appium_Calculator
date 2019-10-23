package com.selenium.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
	
	public void Impwait() throws InterruptedException {
	WebDriver driver;
	System.setProperty ("webdriver.chrome.driver","C:\\Users\\prathiksha\\Documents\\Automation\\Drivers\\chromedriver.exe" );
	driver = new ChromeDriver(); 
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	System.out.println("Amazon web page is maximised & openend");
	}
	public void Expwait() throws InterruptedException {
	WebDriver driver1;
	System.setProperty ("webdriver.chrome.driver","C:\\Users\\prathiksha\\Documents\\Automation\\Drivers\\chromedriver.exe" );
	driver1 = new ChromeDriver(); 
	WebDriverWait wait=new WebDriverWait(driver1, 20);
	System.out.println("added explicit wait");
		
	}
}
