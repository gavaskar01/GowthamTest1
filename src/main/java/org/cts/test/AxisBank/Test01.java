package org.cts.test.AxisBank;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test01 {
	 public static void main(String[] args) {
		    
	        System.setProperty("webdriver.gecko.driver","E:\\Selenium\\gowtham01\\AxisBank\\Drive\\geckodriver.exe" );
	        WebDriver driver=new FirefoxDriver();
	        driver.get("https://www.facebook.com/");
	        WebElement f = driver.findElement(By.id("loginbutton"));
	        f.click();
	        Alert a=driver.switchTo().alert();
	        a.accept();
	        
	 } 
}
