package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebTableUtils {

    //Method 1 info:
    //Name: returnOrderDate ()
    //Return Type: String
    //Arg1: WebDriver driver
    //Arg2: String customerName
    //This method should accept a customerName and
    //return the customer order date as a String

    public static String returnOrderDate(WebDriver driver, String customerName){

       String locator = "//td[.='"+customerName+"']/following-sibling::td[3]";

        WebElement customerDateCell = driver.findElement(By.xpath(locator));

        return customerDateCell.getText();

    }

    /*
    Method 2 info:
    Name: orderVerify()
    Return Type: void
    Arg1: WebDriver driver
    Arg2: String customerName
    Arg3: String expectedOrderDate
    This method should accept above-mentioned arguments and
    internallly assert expectedOrderDate matching actualOrderDate
     */

    public static void orderVerify(WebDriver driver,String customerName, String expectedOrderDate){
        String locator = "//td[.='"+customerName+"']/following-sibling::td[3]";

        WebElement customerDateCell = driver.findElement(By.xpath(locator));

        String actualOrderDate= customerDateCell.getText();
        Assert.assertEquals(actualOrderDate, expectedOrderDate);
    }

}
