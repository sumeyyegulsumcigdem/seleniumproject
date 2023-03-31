package com.cydeo.tests.day8_properties_config_reader;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readingProperties {

    @Test
    public void reading_from_properties_test() throws IOException {
        //Create the object of Properties class
        Properties properties = new Properties();

        //We need to open the file in Java memory
        FileInputStream file = new FileInputStream("configuration.properties");

        //Load the properties object using FileInputStream object
        properties.load(file);

        //Use "properties" object to read value
        System.out.println("properties.getProperty(\"browser\") = "
                + properties.getProperty("browser"));
        System.out.println("properties.getProperty(\"env\") = "
                + properties.getProperty("env"));
        System.out.println("properties.getProperty(\"username\") = "
                + properties.getProperty("username"));


    }

}
