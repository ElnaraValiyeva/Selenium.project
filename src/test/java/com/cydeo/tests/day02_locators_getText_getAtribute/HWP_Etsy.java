package com.cydeo.tests.day02_locators_getText_getAtribute;

import com.google.common.base.Verify;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWP_Etsy {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.etsy.com");
       // 3. Search for “wooden spoon”

       WebElement searchBox= driver.findElement(By.id("global-enhancements-search-query"));
        searchBox.sendKeys("wooden spoon" +Keys.ENTER);
        //4. Verify title:
       // Expected: “Wooden spoon - Etsy

        String expectedTitle = "Wooden spoon - Etsy";
        String actualTitle = driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("PASSED");
        }else{
            System.out.println("FAIL");
        }
        driver.close();
    }
}
