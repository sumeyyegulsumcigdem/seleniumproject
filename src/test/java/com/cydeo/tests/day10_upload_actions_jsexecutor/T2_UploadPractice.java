package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_UploadPractice {

    @Test
    public void upload_test(){

        //Go to site
        Driver.getDriver().get("https://practice.cydeo.com/upload");

        //Find some small file from your  computer and get the path of it
        String path = "C:\\Users\\SÜMEYYE\\Downloads\\WhatsApp Image 2023-01-17 at 10.15.46.jpeg";

        //Upload the file
        WebElement fileUpload = Driver.getDriver().findElement(By.id("file-upload"));

        BrowserUtils.sleep(2);
        fileUpload.sendKeys(path);

        WebElement uploadButton = Driver.getDriver().findElement(By.id("file-submit"));
        uploadButton.click();

        WebElement fileUploadedHeader = Driver.getDriver().findElement(By.tagName("h3"));

        //Assert
        //File uploaded text is displayed on the page

        Assert.assertTrue(fileUploadedHeader.isDisplayed());



    }

}
