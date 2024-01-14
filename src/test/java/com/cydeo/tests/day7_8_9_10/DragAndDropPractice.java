package com.cydeo.tests.day7_8_9_10;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropPractice  extends TestBase {

    @Test
    public void guru99_drag_and_drop_test(){

        driver.get("https://demo.guru99.com/test/drag_drop.html");

        Actions actions =new Actions(driver);

        WebElement BANK = driver.findElement(By.linkText("BANK"));

        WebElement accountType = driver.findElement(By.id("bank"));

        actions.dragAndDrop(BANK,accountType).perform();



    }
}
