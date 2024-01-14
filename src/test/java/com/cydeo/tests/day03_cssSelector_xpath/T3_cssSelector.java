package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_cssSelector {

    public static void main(String[] args) {
       // TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");
       // 3- Verify “Log in” button text is as expected:
       // Expected: Log In

        String expectedLogin ="Log In";
         //tagname=[attribute='value'];
        WebElement loginButton = driver.findElement(By.cssSelector("input[type='submit']"));

        String actualLoginText = loginButton.getAttribute("value");

        if(actualLoginText.equals(expectedLogin)){
            System.out.println("Log In button text verification PASSED!");
        }else{
            System.out.println("Log In button text verification FAILED!");
        }




    }
}
