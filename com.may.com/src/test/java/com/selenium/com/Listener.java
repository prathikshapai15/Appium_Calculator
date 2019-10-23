package com.selenium.com;		

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.Assert;
import org.testng.TestListenerAdapter;
import org.testng.annotations.Listeners;		
import org.testng.annotations.Test;             		

@Listeners(com.selenium.com.Listener.class)			

public abstract class Listener extends TestListenerAdapter implements WebDriverEventListener {				
					

//Test to pass as to verify listeners.		
@Test		
public static void main(String[]args) throws InterruptedException				
{	
	System. setProperty("webdriver.chrome.driver", "D:/Demo/lib/Jars/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.get("http://demo.guru99.com/V4/");	
    driver.manage().window().maximize();
    Thread.sleep(5000);
    WebElement UID = driver.findElement(By.xpath("//input[@name='uid']"));	
    WebElement pswd = driver.findElement(By.xpath("//input[@name='btnLogin']"));
    Actions builder = new Actions(driver);
    Actions seriesOfActions = builder.moveToElement(UID).click().sendKeys("prathi34926");
    Thread.sleep(5000);  
    Actions seriesOfActions1 = builder.moveToElement(pswd).click().sendKeys("prathi34926");
    seriesOfActions.perform();
    seriesOfActions1.perform();
  				
}		

//Forcefully failed this test as verify listener.		
@Test		
public void TestToFail()				
{		
    System.out.println("This method to test fail");					
    Assert.assertTrue(false);			
}		
}		