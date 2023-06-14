package com.kraftechnologie.tests.day03_webelement_intro;

import com.kraftechnologie.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyUrlIsNotChanged {
    public static void main(String[] args) throws InterruptedException {
        /** Class Task
         * open the chrome browser
         * go to  https://www.krafttechexlab.com/login  page
         * click on login button
         * verify that url is not changed
         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/login");

        String expectedUrl = driver.getCurrentUrl();
        System.out.println("expectedUrl = " + expectedUrl);

        WebElement loginBtn = driver.findElement(By.cssSelector("[type=\"submit\"]"));
        loginBtn.click();

        String actualUrl = driver.getCurrentUrl();
        System.out.println("actualUrl = " + actualUrl);

        if (expectedUrl.equals(actualUrl)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }

        Thread.sleep(5000);
        driver.close();

        
    }
}
