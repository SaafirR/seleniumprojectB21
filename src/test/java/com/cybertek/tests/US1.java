package com.cybertek.tests;

import com.cybertek.utilities.Driver;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US1 {


   @Test
    public void test(){

      WebDriver driver = WebDriverFactory.getDriver("chrome");
      driver.manage().window().maximize();

      Driver.getDriver().get("http://qa.trycloud.net/index.php/login");

      WebElement enterUserName = driver.findElement (By.xpath("//input[@id='user']"));
      enterUserName.click();

      Select select = new Select(enterUserName);

      WebElement currentlySelectedUserName = select.getFirstSelectedOption();

      String expectedResult = "Username selected";
      String actualResult = currentlySelectedUserName.getText();

       WebElement enterPassWord = (WebElement) By.xpath("//input[@id='password']");
       enterPassWord.click();

      Assert.assertEquals(actualResult, expectedResult);



   }


}


