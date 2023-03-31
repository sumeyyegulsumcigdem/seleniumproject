package com.cydeo.tests.day11_actions_jsexecutor_practice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionPractice {

    @Test
    public void task4_task5_test(){

        //Go to website
        Driver.getDriver().get("https://practice.cydeo.com/");

        //Scroll down to "Powered by Cydeo"
        //Create object of actions and pass our "driver" instance
        Actions actions = new Actions(Driver.getDriver());

        //Locating cydeo link to be able to pass in the actions method
        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));

        //Scroll using Actions class "moveTo(element)" method
        actions.moveToElement(cydeoLink).pause(2).perform();

        //Scroll back up to "Home" link using PageUP button
        actions.sendKeys(Keys.PAGE_UP).perform();

        Driver.closeDriver();

    }

}
