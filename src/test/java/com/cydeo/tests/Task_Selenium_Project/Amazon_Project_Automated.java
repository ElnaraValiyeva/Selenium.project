package com.cydeo.tests.Task_Selenium_Project;

import com.cydeo.utilites.WebDriverFactory;
import com.google.common.base.Verify;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Amazon_Project_Automated {

    WebDriver driver;

    @BeforeMethod
    public void setup(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("www.amazon.ca");

    }


   @Test
    public void launchBrowser(){
        //driver.findElement()



   }



       // 1. Launch any browser and go to (https://www.amazon.ca/);
       // 2. Sign into Amazon (You can use your own credentials or signup using any
        //credentials as a precondition)
        //3.Search for the following book “100+ Solutions in Java"
        //4.4. Select the book as shown in screenshot
        //5. Select Quantity to 2
        //6. Click “Add to cart”

        //Expected Results:
        //1. Verify the account after login.
        //2. Verify user lands to home page after login
        //3. Navigate to cart and validate the Product, Quantity and Amount is correct


    }


