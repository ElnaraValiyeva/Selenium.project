package com.cydeo.tests.day02_locators_getText_getAtribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.swing.interop.SwingInterOpUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_getText_getAttribute {
    public static void main(String[] args) {

        //TC #5: getText() and getAttribute() method practice

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/registration_form");


       // 3- Verify header text is as expected:
        //Expected: Registration form

        WebElement header = driver.findElement(By.tagName("h2"));

        String expectedHeader = "Registration form";
        String actualHeader = header.getText();

        if(expectedHeader.equals(actualHeader)){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Fail");
        }
       // 4- Locate “First name” input box

         WebElement firstname = driver.findElement(By.className("form-control"));

        //5- Verify placeholder attribute’s value is as expected:
        String expectedPlaceHolder ="first name";
        String actualPlaceHolder = firstname.getAttribute("placeholder");

        System.out.println("actualPlaceHolder =" + actualPlaceHolder);

        if(expectedPlaceHolder.equals(actualPlaceHolder)){
            System.out.println("Test Passed!");
        }else{
            System.out.println("Test Fail!");
        }




    }
}
