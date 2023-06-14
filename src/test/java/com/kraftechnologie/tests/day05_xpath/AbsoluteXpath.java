package com.kraftechnologie.tests.day05_xpath;

import com.kraftechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AbsoluteXpath {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/");

        Thread.sleep(2000);

        WebElement homeButton = driver.findElement(By.xpath("html/body/main/div/nav/ol/li/a"));
        System.out.println(homeButton.getText());

        WebElement dashbordButton = driver.findElement(By.xpath("html/body/main/div/nav/ol/li[2]"));
        System.out.println(dashbordButton.getText());

        driver.quit();
    }
}
