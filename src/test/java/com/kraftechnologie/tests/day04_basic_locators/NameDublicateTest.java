package com.kraftechnologie.tests.day04_basic_locators;

import com.kraftechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NameDublicateTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://demo.aspnetawesome.com/");

        Thread.sleep(2000);
        driver.findElement(By.id("btnCookie")).click();


        System.out.println("driver.findElement(By.name(\"itemParentCat\")).getText() = " + driver.findElement(By.name("itemParentCat")).getText());
        Thread.sleep(2000);

        driver.close();

    }
}
