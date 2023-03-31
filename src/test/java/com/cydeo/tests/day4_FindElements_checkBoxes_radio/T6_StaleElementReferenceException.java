package com.cydeo.tests.day4_FindElements_checkBoxes_radio;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T6_StaleElementReferenceException {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/abtest");

        //Locate "CYDEO" link, verify it is displayed
        WebElement cydeoLink = driver.findElement(By.xpath("//a[text()='CYDEO']"));
        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());

        //Refresh the page
        driver.navigate().refresh();

        //We are refreshing the web element reference by re-assigning(re-locating) the web element
         cydeoLink = driver.findElement(By.xpath("//a[text()='CYDEO']"));


        //Verify it is displayed, again.
        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());

    }
}
