package com.cydeo.tests.day4_FindElements_checkBoxes_radio;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_checkboxes {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/checkboxes");

        //We have to locate checkboxes
        WebElement checkbox1 = driver.findElement(By.xpath("//input[@name='checkbox1']"));
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@name='checkbox2']"));

        //Confirm checkbox#1 is NOT selected by default
        System.out.println("checkbox1.isSelected(), expecting false = " + checkbox1.isSelected());

        //Confirm checkbox#2 is SELECTED by default
        System.out.println("checkbox2.isSelected(), expecting true = " + checkbox2.isSelected());

        //Click checkbox#1 to select it
        checkbox1.click();

        //Click checkbox#2 to deselect it
        Thread.sleep(2000);
        checkbox2.click();

        //Confirm checkbox#1 is SELECTED
        System.out.println("checkbox1.isSelected(), expecting true = " + checkbox1.isSelected());

        //Confirm checkbox#2 is NOT selected
        System.out.println("checkbox2.isSelected(), expecting false = " + checkbox2.isSelected());
    }
}
