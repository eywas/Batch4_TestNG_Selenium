package com.kraftechnologie.tests.day06_css;

import com.kraftechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Css_Index {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/login");
        Thread.sleep(2000);

        WebElement emailAsWhole =driver.findElement(By.cssSelector(".col-12:nth-of-type(1)"));

        WebElement passwordAsWhole =driver.findElement(By.cssSelector(".col-12:nth-of-type(2)"));

        WebElement loginAsWhole =driver.findElement(By.cssSelector(".col-12:nth-of-type(4)"));

        driver.quit();



    }
}
