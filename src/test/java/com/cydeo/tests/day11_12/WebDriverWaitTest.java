package com.cydeo.tests.day11_12;

import com.cydeo.tests.pages.WebDriverWaitPage;
import com.cydeo.utilites.ConfigurationReader;
import com.cydeo.utilites.Driver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class WebDriverWaitTest {

    @Test
    public void webdriverwait_test(){
        Driver.getDriver().get(ConfigurationReader.getProperty("dynamic.loading.url"));

        WebDriverWaitPage webDriverWaitPage = new WebDriverWaitPage();
        webDriverWaitPage.startBtn.click();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(webDriverWaitPage.loadingBar));

        Assert.assertTrue(webDriverWaitPage.username.isDisplayed());

        webDriverWaitPage.username.sendKeys("tomsmith");

        webDriverWaitPage.password.sendKeys("incorrectpassword");

        webDriverWaitPage.submitBtn.click();

        Assert.assertTrue(webDriverWaitPage.errorMsg.isDisplayed());




    }
}
