package com.cydeo.tests.day3_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_locators_getText {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");

        //!  driver.findElement(By.className("login-inp")).sendKeys("incorrect");
        //enter incorrect user name :"incorrect"
        WebElement inputUserName = driver.findElement(By.className("login-inp"));
        inputUserName.sendKeys("incorrect");

        //Enter incorrect password: "incorrect"
        WebElement inputPassword = driver.findElement(By.name("USER_PASSWORD"));
        inputPassword.sendKeys("incorrect");

        //Click to login button
        WebElement loginButton = driver.findElement(By.className("login-btn"));
        loginButton.click();

        //Verify error message text is as expected: incorrect login or password

        WebElement errortext = driver.findElement(By.className("errortext"));

        String expectedErrorMessage = "Incorrect login or password";
        String actualErrorMessage = errortext.getText();

        if (expectedErrorMessage.equals(actualErrorMessage)){
            System.out.println("Error message verification PASSED");
        }else{
            System.out.println("Error message verification FAILED");
        }
    }
}
