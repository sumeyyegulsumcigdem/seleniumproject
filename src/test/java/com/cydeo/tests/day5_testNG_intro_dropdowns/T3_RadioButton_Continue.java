package com.cydeo.tests.day5_testNG_intro_dropdowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class T3_RadioButton_Continue {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/radio_buttons");

        //Locate name 'sports' radio buttons and store them in a list of web element
      //  List<WebElement> sportRadioButtons = driver.findElements(By.name("sport"));

        clickAndVerifyRadioButton(driver, "sport", "hockey");
        clickAndVerifyRadioButton(driver, "sport", "football");
        clickAndVerifyRadioButton(driver, "color", "yellow");

    }

    private static void clickAndVerifyRadioButton(WebDriver driver, String nameAttribute, String idValue) {
        List<WebElement> sportRadioButtons = driver.findElements(By.name(nameAttribute));
        //Loop through the list of web element and select matching result "hockey"

        for (WebElement each : sportRadioButtons) {
            String eachID = each.getAttribute("id");


            if (eachID.equals(idValue)) {
                each.click();

                System.out.println(eachID + " is selected: " + each.isSelected());
                break;
            }
        }

    }
}

