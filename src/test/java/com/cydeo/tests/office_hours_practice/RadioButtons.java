package com.cydeo.tests.office_hours_practice;

import com.cydeo.utilites.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class RadioButtons {

    WebDriver driver;

    @BeforeMethod
    public void setup(){
         driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    
    @Test
    public void radio_button_test(){
        driver.get("https://practice.cydeo.com/");



    }
}
