package com.kraftechnologie.tests.day03_webelement_intro;

import com.kraftechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyUrlChanged {
    public static void main(String[] args) throws InterruptedException {
        /** Class Task 2
         * open chrome browser
         * go to https://www.krafttechexlab.com/login  page
         * enter email as
         * enter password as
         * click login button
         * verify that url has changed
         */

        String email = "eywas@kraft.com";
        String password = "Tanatuzu0";


        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.krafttechexlab.com/login");
        //enter email -> sendKeys()
        WebElement emailInputBox = driver.findElement(By.id("email"));
        emailInputBox.sendKeys(email);
        //enter password -> sendKeys()
        WebElement passwordInputBox = driver.findElement(By.id("yourPassword"));
        passwordInputBox.sendKeys(password);

        WebElement loginBtn = driver.findElement(By.cssSelector("[type=\"submit\"]"));
        loginBtn.click();

        Thread.sleep(3000);

        String expectedUrl = "https://www.krafttechexlab.com/index";
        String actualUrl = driver.getCurrentUrl();
        System.out.println("expectedUrl = " + expectedUrl);
        System.out.println("actualUrl = " + actualUrl);

        if (expectedUrl.equals(actualUrl)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        Thread.sleep(3000);
        driver.close();

    }

}
