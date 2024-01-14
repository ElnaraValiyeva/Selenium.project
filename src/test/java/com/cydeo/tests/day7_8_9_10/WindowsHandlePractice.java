package com.cydeo.tests.day7_8_9_10;

import com.cydeo.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class WindowsHandlePractice {

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void window_handle_test(){
        driver.get("https://demoqa.com/browser-windows");
        driver.findElement(By.id("tabButton")).click();

        driver.findElement(By.id("windowButton")).click();

        driver.findElement(By.id("messageWindowButton")).click();

        String parentWindowHandle = driver.getWindowHandle();
        System.out.println("parentWindowHandle = " + parentWindowHandle);

        Set<String> allWindowHandles = driver.getWindowHandles();

          for  (String eachWindow : allWindowHandles){ //Print each window

          System.out.println("eachWindow = " + eachWindow);

          driver.switchTo().window(eachWindow);

          System.out.println("driver.getTitle() = " + driver.getTitle());
          System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());


          }


    }



}
