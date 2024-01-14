package com.cydeo.tests.pages;

import com.cydeo.utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticePageLogin {
    public  PracticePageLogin(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name="username")
    public WebElement username;

    @FindBy(name="password")
    public WebElement password;

    @FindBy(id="wooden_spoon")
    public WebElement loginBtn;


}
