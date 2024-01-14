package com.cydeo.tests.day7_8_9_10;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilites.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Guru99UploadPtactice extends TestBase {

    @Test
    public void guru99_upload_test(){

        driver.get("https://demo.guru99.com/test/upload");

        WebElement chooseFile = driver.findElement(By.id("uploadfile_0"));
        chooseFile.sendKeys("/Users/ella/Downloads/class note (3).txt");

        driver.findElement(By.cssSelector("#terms")).click();

        driver.findElement(By.id("submitbutton")).click();

        BrowserUtils.sleep(3);

        WebElement resultMsg = driver.findElement(By.xpath("//center[.='1 file has been successfully uploaded.']"));
        String actualMsg = resultMsg.getText();
        String expectedMsg = "1 file\nhas been successfully uploaded.";
        Assert.assertEquals(actualMsg,expectedMsg,"Result message verification failed!");
    }
}








