package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T6_getText_getAttribute {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/registration_form");

        //Verify header text is as expected
        WebElement headerText = driver.findElement(By.tagName("h2"));

        //Expected: Registration form
        String expectedHeaderText = "Registration form";
        String actualHeaderText = headerText.getText();

        if (actualHeaderText.equals(expectedHeaderText)){
            System.out.println("Header text verification PASSED");
        }else{
            System.out.println("Header text verification FAILED");
        }

        //Locate "First name" input box
        //We are locating the web element using "name" locator
        //name attribute has"firstname" value
        WebElement firstNameInput = driver.findElement(By.name("firstname"));

        //Verify placeholder attribute's value is as expected:
        //Expected: first name

        String expectedPlaceHolder = "first name";
        String actualPlaceHolder = firstNameInput.getAttribute("placeholder");

        //Verification
        if (expectedPlaceHolder.equals(actualPlaceHolder)){
            System.out.println("Placeholder Text Verification PASSED");
        }else{
            System.out.println("Placeholder Text Verification FAILED");
        }

        driver.close();



    }
}
