package com.cydeo.tests.shorts;

import com.cydeo.tests.pages.PracticePageLogin;
import com.cydeo.utilites.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class POM_PracticePageLoginTest {

    @Test
    public void practicePageLoginTestWithPOM(){

        Driver.getDriver().get("https://practice.cydeo.com/login");

        PracticePageLogin practicePageLogin = new PracticePageLogin();

        practicePageLogin.username.sendKeys("tomsmith");
        practicePageLogin.password.sendKeys("SuperSecretPassword");
        practicePageLogin.loginBtn.click();

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle ="Secure Area";

        Assert.assertEquals(actualTitle,expectedTitle,"Secure Area title is not working");


    }


}
