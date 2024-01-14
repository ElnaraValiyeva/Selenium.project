package com.cydeo.tests.day7_8_9_10;

import com.cydeo.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class WebTablePractice {

    WebDriver driver;

    @BeforeMethod
        public void setup(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }





    @Test
    public void webtable_test(){
        driver.get("https://practice.cydeo.com/tables");

        WebElement table1 = driver.findElement(By.xpath("//table[@id='table1']"));
        System.out.println("table1.getText() = " + table1.getText());

        Assert.assertTrue(table1.getText().contains("tconway@earthlink.net"),"Tconway@earthlink.net is not in table");
         //Print all column names in single line
        WebElement allColNames = driver.findElement(By.xpath("//table[@id='table1']/thead/tr"));
        System.out.println("allColNames.getText() = " + allColNames.getText());

        //Print each column name is separate lines using a loop
        List<WebElement> colNamesList = driver.findElements(By.xpath("//table[@id='table1']//th"));
        for(WebElement eachColName : colNamesList){
            System.out.println("eachColName.getText() = " + eachColName.getText());
        }


    }



}
