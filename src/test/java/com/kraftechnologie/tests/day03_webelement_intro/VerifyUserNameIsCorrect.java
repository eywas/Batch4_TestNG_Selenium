package com.kraftechnologie.tests.day03_webelement_intro;

import com.kraftechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyUserNameIsCorrect {
    public static void main(String[] args) throws InterruptedException {

        /** Class Task 3
         * open chrome browser
         * go to https://www.krafttechexlab.com/login  page
         * enter email as
         * enter password as
         * click login button
         * verify that username is "eywas"
         */

        String email = "eywas@kraft.com";
        String password = "Tanatuzu0";
        String expectedProfileUsername = "eywas";


        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.krafttechexlab.com/login");

        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("yourPassword")).sendKeys(password);
        driver.findElement(By.cssSelector("[type=\"submit\"]")).click();

        WebElement profileUsername = driver.findElement(By.cssSelector("[class=\"d-none d-md-block dropdown-toggle ps-2\"]"));
        String actualProfileUsername = profileUsername.getText();
        System.out.println("actualProfileUsername = " + actualProfileUsername);

        if (expectedProfileUsername.equals(actualProfileUsername)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
        Thread.sleep(3000);
        driver.close();


    }
}
