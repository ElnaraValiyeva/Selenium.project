package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilites.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_locators_getText {
    public static void main(String[] args) {

        //TC #1: NextBaseCRM, locators and getText() practice
       // 1- Open a chrome browser
        //WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://login1.nextbasecrm.com/");
       // 3- Enter incorrect username: “incorrect”
        WebElement userName = driver.findElement(By.name("USER_LOGIN"));
        userName.sendKeys("incorrect");
       // 4- Enter incorrect password: “incorrect”
        WebElement password = driver.findElement(By.className("login-inp"));
        password.sendKeys("incorrect");

        //5- Click to login button.
        WebElement loginButton = driver.findElement(By.className("login-btn"));
        loginButton.click();

       // 6- Verify error message text is as expected:
       // Expected: Incorrect login or password

       // WebElement errorMessage = driver.findElement(By.className("errortext"));

        String expectedMessage = "Incorrect login or password";
        String actualMessage = driver.findElement(By.className("errortext")).getText();

        if(actualMessage.equals(expectedMessage)){
            System.out.println("Passed!");
        }else{
            System.out.println("Fail!");
        }


    }
}
