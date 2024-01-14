package com.cydeo.tests.day02_locators_getText_getAtribute;

import com.google.common.base.Verify;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWP_ZeroBank {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://zero.webappsecurity.com/login.html");
        WebElement header = driver.findElement(By.tagName("h3"));

        String expectedHeader = "Log in to ZeroBank";
        String actualheader = header.getText();

        if(expectedHeader.equals(actualheader)){
            System.out.println("Passed");
        }else{
            System.out.println("Fail");
        }





    }
}
