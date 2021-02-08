package com.cybertek.tests.day2_locators_getText;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P5_SmartBearLoginVerification {

    public static void main(String[] args) {

        //TC #5: Basic login authentication
        //1- Open a chrome browser
        //setup
        WebDriverManager.chromedriver().setup();

        //open browser
        WebDriver driver = new ChromeDriver();

        //maximize
        driver.manage().window().maximize();

        //2- Go to:
        //http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        //3- Verify title equals:
        //Expected: Web Orders Login

        String expectedTitle = "Web Orders Login";

        //when you use a method, you can press alt + enter to introduce local variable
        //it will automatically create variable and guess name for it
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Landing page title verification PASSED!");
        }else {
            System.err.println("Landing page title verification FAILED!!!");
            System.out.println("expectedTitle = " + expectedTitle);
            System.out.println("actualTitle = " + actualTitle);
        }


        //4- Enter username: Tester
        //5- Enter password: test
        //6- Click “Sign In” button
        //7- Verify title equals:
        //Expected: Web Orders


    }
}
