package com.cydeo.tests.day11_12;

import com.cydeo.tests.pages.LibraryLoginPage;
import com.cydeo.utilites.ConfigurationReader;
import com.cydeo.utilites.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LibraryLoginTest {

    @Test
    public void required_field_error_message_test(){



        Driver.getDriver().get(ConfigurationReader.getProperty("library.url"));
        LibraryLoginPage libraryLoginPage = new LibraryLoginPage();
        libraryLoginPage.signInButton.click();

        Assert.assertTrue(libraryLoginPage.fieldRequiredErrorMessage.isDisplayed());




    }
}
