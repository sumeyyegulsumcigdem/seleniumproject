package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttribute_cssSelector {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");

        //Verify log in button text is as expected
        // Expected: Log in



//LOCATING THE SAME WEB ELEMENT USING DIFFERENT ATTRIBUTE VALUES.
                            //    tagName[attribute='value']
                            //    input[class='login-btn']
       //LOCATED USING CLASS ATTRIBUTE
        //  WebElement signInButton = driver.findElement(By.className("login-btn"));
    //LOCATED USING TYPE ATTRIBUE
     //   WebElement signInButton = driver.findElement(By.cssSelector("input[class='login-btn']"));
    //LOCATED USING VALUE ATTRIBUTE
       // WebElement signInButton = driver.findElement(By.cssSelector("input[type='submit']"));
        WebElement signInButton = driver.findElement(By.cssSelector("input[value='Log In']"));

        String expectedButtonText = "Log In";

        //Getting the value of the attribute "value"
        String actualButtonText = signInButton.getAttribute("value");

        System.out.println("actualButtonText = " + actualButtonText);

        if (actualButtonText.equals(expectedButtonText)){
            System.out.println("Log In button text verification PASSED");
        }else{
            System.out.println("Log In button text verification FAILED");

        }







    }
}
