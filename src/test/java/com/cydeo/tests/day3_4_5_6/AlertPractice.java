package com.cydeo.tests.day3_4_5_6;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilites.BrowserUtils;
import com.cydeo.utilites.ConfigurationReader;
import com.cydeo.utilites.WebDriverFactory;
import com.google.common.base.Verify;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class AlertPractice  extends TestBase {

       // TC #3: Information alert practice

       // 2. Go to website: http://practice.cydeo.com/javascript_alerts
       // 3. Click to “Click for JS Prompt” button
        //4. Send “hello” text to alert
       // 5. Click to OK button from the alert
        //6. Verify “You entered: hello” text is displayed.




        @Test
        public void alertTest() throws InterruptedException {

            driver.get(ConfigurationReader.getProperty("env1"));

           driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();


            Alert alert = driver.switchTo().alert();


            System.out.println("alert.getText() = " + alert.getText());
            BrowserUtils.sleep(3);
            alert.sendKeys("hello");
            alert.accept();

            WebElement resultText = driver.findElement(By.id("result"));

            String expectedText = "You entered: hello";
            String actualText = resultText.getText();


            Assert.assertEquals(actualText,expectedText,"Test verification failed");







        }

    }


