package com.cydeo.tests.day02_locators_getText_getAtribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://practice.cydeo.com");

        String expectedInUrl = "cydeo";
        String actualUrl= driver.getCurrentUrl();

        if(actualUrl.contains(expectedInUrl)){
            System.out.println("URL verification Passed");
        }else{
            System.out.println("URL verification Failied");
        }

        //Verify title:
        if(driver.getTitle().equals("Practice")){
            System.out.println("Passed");
        }

        //close the browser
        //driver.close();
    }
}
