package com.cybertek.tests.day5;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class j {


    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.google.com");


    }



}
