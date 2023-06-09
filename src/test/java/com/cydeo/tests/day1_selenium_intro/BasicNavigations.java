package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        //1- set up the browser driver
        WebDriverManager.chromedriver().setup();

        //2- Create instance of the Selenium WebDriver
        //This is the line opening an empty browser
        WebDriver driver = new ChromeDriver();

        //3- Go to "https://www.tesla.com"
        driver.get("https://www.tesla.com");

        System.out.println("driver.getTitle() = " + driver.getTitle());

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate back
        driver.navigate().back();

        Thread.sleep(3000);

        driver.navigate().forward();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate refresh
        driver.navigate().refresh();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        //use navigate().to() method
        driver.navigate().to("https://www.google.com");

        //get the title of the page
        driver.getTitle();
        System.out.println("driver.getTitle() = " + driver.getTitle());

        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);

        //this will close the currently opened window
        driver.close();

        //this will close all of the opened windows
        driver.quit();

    }

}
