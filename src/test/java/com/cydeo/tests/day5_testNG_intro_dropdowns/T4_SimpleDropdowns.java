package com.cydeo.tests.day5_testNG_intro_dropdowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_SimpleDropdowns {

    WebDriver driver;

    @BeforeMethod

    public void setUpMethod(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        //Maximize the page
        driver.manage().window().maximize();
        //Implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");
    }


    @Test
    public void simpleDropdownTest(){

        //verify "simple dropdown" default selected value is correct
        Select simpleDropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));

        WebElement currentlySelectedOption = simpleDropdown.getFirstSelectedOption();

        String actualSimpleDropdownText = currentlySelectedOption.getText();
        String expectedSimpleDropdownText = "Please select an option";

        Assert.assertEquals(actualSimpleDropdownText, expectedSimpleDropdownText);

        System.out.println(actualSimpleDropdownText);

        //Verify "State selection" default selected value is correct
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        //Expected: "Select a State"
        String expectedStateDropdownText = "Select a state";

        String actualStateDropdownText = stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualStateDropdownText, expectedStateDropdownText);
    //  Assert.assertEquals(stateDropdown.getFirstSelectedOption().getText(), "Select a state");





    }
}
