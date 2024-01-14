package com.cydeo.tests.day3_4_5_6;

import com.cydeo.utilites.WebDriverFactory;
import jdk.swing.interop.SwingInterOpUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticePageLoginTest {
    public static void main(String[] args) {
        // TC#1: Practice page Login test

        // 1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        // 2. Go to https://practice.cydeo.com/login
        driver.get("https://practice.cydeo.com/login");
        // 3. Enter username: "tomsmith"
        WebElement username1 =driver.findElement(By.xpath("//*[@type='text']"));
        WebElement username2= driver.findElement(By.name("username"));
        WebElement username3 = driver.findElement(By.cssSelector("input[type='text']"));
        username2.sendKeys("tomsmith");
        // 4. Enter password: "SuperSecretPassword"
        WebElement password = driver.findElement(By.cssSelector("input[type='password']"));
        password.sendKeys("SuperSecretPassword");
        // 5. Click to Login button
        WebElement clickLoginButton =driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        clickLoginButton.click();
        // 6. Verify text displayed on page contains
        //    Expected: "You logged into a secure area!"

        WebElement resultText = driver.findElement(By.cssSelector(".flash.success"));

        String expectedText ="You logged into a secure area!";
        String actualText = resultText.getText();

        System.out.println("resultText.getText() = " + resultText.getText());

        if(actualText.contains(expectedText)){
            System.out.println("Text verification passed");
        }else{
            System.out.println("Text verification failed!");
        }

        driver.quit();



    }
}
