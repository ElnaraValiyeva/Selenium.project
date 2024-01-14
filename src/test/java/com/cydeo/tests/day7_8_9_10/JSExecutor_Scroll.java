package com.cydeo.tests.day7_8_9_10;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JSExecutor_Scroll extends TestBase {


    @Test
    public void jsexecutor_scroll_test(){

        driver.get("https://www.etsy.com");

       // JavascriptExecutor js = (JavascriptExecutor) driver;
        // js.executeScript("argments[1]")

        WebElement email = driver.findElement(By.id("email-list-signup-email-input"));


    }


}
