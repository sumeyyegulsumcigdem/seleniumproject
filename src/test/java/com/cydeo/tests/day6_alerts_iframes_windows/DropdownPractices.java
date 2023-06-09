package com.cydeo.tests.day6_alerts_iframes_windows;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPractices {

    WebDriver driver;


    @BeforeMethod
    public void setUpMethod() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cybertekschool.com/dropdown");

    }


    @Test
    public void dropdown_task5() throws InterruptedException {

        //We located the dropdown and it is ready to use
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        //Select Illionis
        Thread.sleep(1000);
        stateDropdown.selectByVisibleText("Illinois");

        //Select Virginia
        Thread.sleep(1000);
        stateDropdown.selectByValue("VA");

        //Select California
        Thread.sleep(1000);
        stateDropdown.selectByIndex(5);

        //Verify final selected option is California
        String expectedOptionText = "California";
        String actualOptionText = stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualOptionText, expectedOptionText);
    }


    @Test
    public void dropdown_task6() {
        //Select December1, 1923 and verify it is selected
        Select yearDropdown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select dayDropdown = new Select(driver.findElement(By.xpath("//select[@id='day']")));

        //Select year using: visible text
        yearDropdown.selectByVisibleText("1924");

        //Select month using: value attribute
        monthDropdown.selectByValue("11");

        //Select day using: index number
        dayDropdown.selectByIndex(0);

        //creating expected values
        String expectedYear = "1924";
        String expectedMonth = "December";
        String expectedDay = "1";

        //getting actual values from browser
        String actualYear = yearDropdown.getFirstSelectedOption().getText();
        String actualMonth = monthDropdown.getFirstSelectedOption().getText();
        String actualDay = dayDropdown.getFirstSelectedOption().getText();

        //Create assertions
        Assert.assertTrue(actualYear.equals(expectedYear));
        Assert.assertEquals(actualMonth, expectedMonth);
        Assert.assertEquals(actualDay, expectedDay);


    }

    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }

}
