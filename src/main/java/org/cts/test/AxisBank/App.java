package org.cts.test.AxisBank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class App 
{
    public static void main(String[] args) {
    
        System.setProperty("webdriver.gecko.driver","E:\\Selenium\\gowtham01\\AxisBank\\Drive\\geckodriver.exe" );
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
    }
}
