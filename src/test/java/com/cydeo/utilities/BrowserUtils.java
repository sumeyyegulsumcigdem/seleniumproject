package com.cydeo.utilities;

/*
In this class only general utility methods
that are NOT related to some specific page
 */

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils {

   /*
   this method will accept int(in seconds)
   and execute Thread.sleep for given duration
    */

    public static void sleep(int second){
        second *=1000;

        try{
            Thread.sleep(second);
        } catch (InterruptedException e) {

        }

    }

/*
This method accepts 3 arguments.
Arg1: webdriver
Arg2: expectedInUrl: for verify if the url contains given String
- If condition matches, will break loop
Arg3: expectedInTitle to be compared against actualTitle
 */
    public static void switchWindowAndVerify(WebDriver driver, String expectedInURL, String expectedInTitle){

        //Create a logic to switch to  the tab where Etsy.com is open
        Set<String> allWindowsHandles = driver.getWindowHandles();

        for (String each : allWindowsHandles) {

            driver.switchTo().window(each);
            System.out.println("Current URL: " + driver.getCurrentUrl());

            if (driver.getCurrentUrl().contains(expectedInURL)){
                break;
            }
        }

        //Assert: Title contains "expectedInTitle"
        String actualTitle = driver.getTitle();

        Assert.assertTrue(actualTitle.contains(expectedInTitle));

    }


  //This method accepts a String "expectedTitle" and Asserts if it is true
    public static void verifyTitle(WebDriver driver, String expectedTitle){
        Assert.assertEquals(driver.getTitle(), expectedTitle);
    }
}
