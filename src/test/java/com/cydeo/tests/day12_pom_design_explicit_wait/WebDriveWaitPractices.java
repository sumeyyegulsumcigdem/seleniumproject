package com.cydeo.tests.day12_pom_design_explicit_wait;

import com.cydeo.pages.DynamicLoad1Page;
import com.cydeo.pages.DynamicLoad7Page;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebDriveWaitPractices {

    @Test
    public void dynamic_load_7_test(){

        //Go to website
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/7");

        //Wait until title is "Dynamic title"

        //creating the wait object to be able to create certain condition to wait
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

        //use the "wait" object to create our expected condition
        wait.until(ExpectedConditions.titleIs("Dynamic title"));

        //Create object of DynamicLoad7Page to reach and assert web elements
        DynamicLoad7Page dynamicLoad7Page = new DynamicLoad7Page();

        //Assert: Message "Done" is displayed
        Assert.assertTrue(dynamicLoad7Page.doneMessage.isDisplayed());

        //Assert: Image is displayed
        Assert.assertTrue(dynamicLoad7Page.doneMessage.isDisplayed());

    }

    @Test
    public void dynamic_load_1_test(){
        //Go to website
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/1");

        DynamicLoad1Page dynamicLoad1Page = new DynamicLoad1Page();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

        //Click to start
        dynamicLoad1Page.startButton.click();

        //Wait until loading bar disappears
        wait.until(ExpectedConditions.invisibilityOf(dynamicLoad1Page.loadingBar));

        //Assert
        Assert.assertTrue(dynamicLoad1Page.inputUsername.isDisplayed());

        //Enter username
        dynamicLoad1Page.inputUsername.sendKeys("tomsmith");

        //Enter password
        dynamicLoad1Page.inputPassword.sendKeys("somethingwrong");

        //Click to submit button
        dynamicLoad1Page.submitButton.click();

        //Assert "Your password is invalid!" text is displayed
        Assert.assertTrue(dynamicLoad1Page.errorMessage.isDisplayed());

    }

}
