package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T3_CRM_LOGIN extends TestBase {



    @Test
    public void crm_login_test(){

        //Go to link
        driver.get("https://login1.nextbasecrm.com/");

        //Enter valid username
        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUsername.sendKeys("helpdesk1@cybertekschool.com");

        //helpdesk1@cybertekschool.com  UserUser
        //Helpdesk2@cybertekschool.com  UserUser

        //Enter valid password
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys("UserUser");

        //Click to login button
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();

        //Verify title is as expected
        //Expected: Portal

        BrowserUtils.verifyTitle(driver, "My tasks");


    }

    public void crm_login_test2(){

        //Go to link
        driver.get("https://login1.nextbasecrm.com/");

        //Calling my utility method to login helpdesk1
        CRM_Utilities.crm_login(driver);

        //Verify title is as expected
        //Expected: Portal
        BrowserUtils.verifyTitle(driver, "My tasks");


    }

    public void crm_login_test3(){

        //Go to link
        driver.get("https://login1.nextbasecrm.com/");

        //Calling my utility method to login helpdesk1
        CRM_Utilities.crm_login(driver,"helpdesk2@cybertekschool.com", "UserUser");

        //Verify title is as expected
        //Expected: Portal
        BrowserUtils.verifyTitle(driver, "My tasks");


    }

}
