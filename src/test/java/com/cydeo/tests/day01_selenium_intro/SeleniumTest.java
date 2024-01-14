package com.cydeo.tests.day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        if(driver.getTitle().equals("Google")){
            System.out.println("Title of page correct");
        }else{
            System.out.println("Title of page not");
        }

        driver.quit();


    }


}
