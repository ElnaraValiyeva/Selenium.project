package com.cydeo.tests.day02_locators_getText_getAtribute;

import com.sun.jna.Library;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_Library {
    public static void main(String[] args) {

         // TC #4: Library verifications
        // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2. Go to http://library2.cybertekschool.com/login.html
        driver.get("http://library2.cybertekschool.com/login.html");
        // 3. Enter username: “incorrect@email.com”
        WebElement usernameInput = driver.findElement(By.className("form-control"));
        usernameInput.sendKeys("incorrect@email.com");
        //4. Enter password: “incorrect password”
        WebElement passwordInput = driver.findElement(By.id("inputPassword"));
        passwordInput.sendKeys("incorrect password");

        //5. Verify: visually “Sorry, Wrong Email or Password”

        WebElement signInButton = driver.findElement(By.tagName("button"));
        signInButton.click();

       // displayed
        WebElement displayWord = driver.findElement(By.linkText("Sorry, Wrong Email or Password"));
        System.out.println("displayWord.isDisplayed() = " + displayWord.isDisplayed());


    }
}
