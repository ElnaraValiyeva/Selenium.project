package com.cydeo.tests.day3_4_5_6;

import com.cydeo.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class RegistrationFormPageTest {

    WebDriver driver;

    @BeforeMethod
    public void setup(){
         driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://practice.cydeo.com/registration_form");
    }



     @Test(priority = 1)
    public void registrationFormPageTitle() {

         String actualTitle = driver.getTitle();
         String expectedTitle = "Registration Form";


         Assert.assertTrue(actualTitle.equals(expectedTitle),"Title verification failed!");


    }

    @Test(priority = 2)
    public void registrationFormPageTitleFiling(){


        // 1. Open Chrome browser
//        WebDriver driver = WebDriverFactory.getDriver("chrome");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//        // 2. Go to https://practice.cydeo.com/registration_form
//        driver.get("https://practice.cydeo.com/registration_form");

        // 3. Enter First name: "John"
        // We can use cssSelector("input.form-control") for firstname because it is first matching
        // but when we use other input web elements it is not going to find them
        WebElement firstname = driver.findElement(By.cssSelector("input.form-control"));
        firstname.sendKeys("John");

        // 4. Enter Last name: "Smith"
        driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("Smith");

        // 5. Enter Username: "johnsmith123"
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("johnsmith123");

        // 6. Enter Email address: "john.smith@email.com"
        driver.findElement(By.cssSelector("input[placeholder='email@email.com']")).sendKeys("john.smith@email.com");

        // 7. Enter password: "John1234"
        driver.findElement(By.name("password")).sendKeys("John1234");

        // 8. Enter Phone number: "123-456-7890"
        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("123-456-7890");

        // 9. Click to "Male" from Gender
        WebElement maleBtn = driver.findElement(By.xpath("//input[@value='male']"));
        maleBtn.click();
        Assert.assertTrue(maleBtn.isSelected(),"Male button is not selected!");

        // 10. Enter Date of birth "01/28/1990"
        driver.findElement(By.cssSelector("input[name='birthday']")).sendKeys("01/28/1990");

        // 11. Select "Department of Engineering" from Department/Office dropdown
        Select selectDepartment = new Select(driver.findElement(By.name("department")));
        //selectDepartment.selectByIndex(1);
        //selectDepartment.selectByValue("DE");
        selectDepartment.selectByIndex(4);

        System.out.println("selectDepartment.getFirstSelectedOption() = " + selectDepartment.getFirstSelectedOption().getText());

        // 12. Select "SDET" from Job title dropdown
        Select selectJobTitle = new Select(driver.findElement(By.name("job_title")));
        selectJobTitle.selectByVisibleText("SDET");

        System.out.println("selectJobTitle.getFirstSelectedOption().getText() = " + selectJobTitle.getFirstSelectedOption().getText());

        // 13. Click to "Java" from languages
        WebElement javaBtn = driver.findElement(By.id("inlineCheckbox2"));
        javaBtn.click();
        Assert.assertTrue(javaBtn.isSelected(),"Java button is not selected!");

        // 14. Click to "Sign up" button
        // 15. Verify text displayed on page
        //     Expected: "Well done!"
    }

    @AfterMethod
    public void teardown(){
        //driver.quit();
    }
}
