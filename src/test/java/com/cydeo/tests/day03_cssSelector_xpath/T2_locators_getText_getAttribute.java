package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_locators_getText_getAttribute {

    public static void main(String[] args) {
       // TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");
        //3- Verify “remember me” label text is as expected:
        //Expected: Remember me on this computer
        String expLabelText ="Remember me on this computer";
        String actualLabelText =driver.findElement(By.className("login-item-checkbox-label")).getText();

        if(expLabelText.equals(actualLabelText)){
            System.out.println("Passed!");
        }else{
            System.out.println("Fail!");
        }
        //4- Verify “forgot password” link text is as expected:
        //Expected: Forgot your password?

        String expectedForgotPassword="Forgot your password?";
        WebElement forgotPasswordLink = driver.findElement(By.className("login-link-forgot-pass"));
        String actualForgotPassword=forgotPasswordLink.getText();

        if(expectedForgotPassword.contains(expectedForgotPassword)){
            System.out.println("FPT verification is Passed!");
        }else{
            System.out.println("FPT verification is Fail!");
        }
       // /5- Verify “forgot password” href attribute’s value contains expected:
        //Expected: forgot_password=yes

        String expectedHrefAttribute = "forgot_password=yes";
        String actualHrefValue = forgotPasswordLink.getAttribute("href");

        if(actualHrefValue.contains(expectedHrefAttribute)){
            System.out.println("HREF is Passed!");
        }else{
            System.out.println("HREF is Fail!");
        }

       // PS: Inspect and decide which locator you should be using to locate web
       // elements.

    }
}
