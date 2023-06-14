package com.kraftechnologie.tests.day06_css;

import com.kraftechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Css_ParentToChild {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/login");
        Thread.sleep(2000);

        WebElement email =driver.findElement(By.cssSelector(".col-12:nth-of-type(1)>label"));
        System.out.println(email.getText());

        WebElement loginButton =driver.findElement(By.cssSelector(".row.g-3.needs-validation button"));
        System.out.println(loginButton.getText());

        driver.quit();
    }
}
