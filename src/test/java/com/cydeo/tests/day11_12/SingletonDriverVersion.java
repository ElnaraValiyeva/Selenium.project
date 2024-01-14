package com.cydeo.tests.day11_12;
import com.cydeo.utilites.Driver;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.time.Duration;


public class SingletonDriverVersion {


    @Test (priority = 1)
    public void googleTitle(){
        Driver.getDriver().get("https://google.com");
        System.out.println("google test driver = " + ((RemoteWebDriver) Driver.getDriver()).getSessionId());
        //Driver.closeDriver();
    }

    @Test (priority = 2)
    public void yahooTitle(){
        Driver.getDriver().get("https://yahoo.com");
        System.out.println("yahoo test driver = " + ((RemoteWebDriver) Driver.getDriver()).getSessionId());
        //Driver.closeDriver();
    }


    @Test (priority = 3)
    public void etsyTitle(){
        Driver.getDriver().get("https://etsy.com");
        System.out.println("etsy test driver = " + ((RemoteWebDriver) Driver.getDriver()).getSessionId());
        // Driver.closeDriver();
    }


}

