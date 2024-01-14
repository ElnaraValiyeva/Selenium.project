package com.cydeo.tests.day3_4_5_6;

import com.cydeo.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.w3c.dom.Text;

import java.time.Duration;

public class IframeClasses {


    WebDriver driver;

    @BeforeMethod
    public void setup(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://login1.nextbasecrm.com");

    }

    @Test
    public void iframeTest(){

        driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));



    }



}
