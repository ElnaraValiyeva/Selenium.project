package com.cydeo.tests.day02_locators_getText_getAtribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {
    public static void main(String[] args) {

       // TC#3: Google search
       //Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //Go to: https://google.com
        driver.get("https://google.com");
        //Write “apple” in search box
        WebElement searchBox = driver.findElement(By.name("q"));

        searchBox.sendKeys("apple" + Keys.ENTER);
       //Press ENTER to search
       //Verify title:
        String expectedTitle="apple";
        String actualTitle = driver.getTitle();
       //Expected: Title should start with “apple” word

        if(expectedTitle.startsWith(actualTitle)){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Fail");
        }

    }

}
