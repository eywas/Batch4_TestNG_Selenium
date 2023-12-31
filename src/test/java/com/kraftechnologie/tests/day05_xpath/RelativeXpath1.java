package com.kraftechnologie.tests.day05_xpath;

import com.kraftechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RelativeXpath1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com.tr/");
        driver.manage().window().maximize();

        WebElement acceptCookies = driver.findElement(By.xpath("//input[@id='sp-cc-accept']"));
        acceptCookies.click();

        Thread.sleep(2000);

        WebElement searchBar = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

        WebElement searchButton = driver.findElement(By.xpath("//input[@value='Git']"));

        searchBar.sendKeys("Selenium");
        Thread.sleep(2000);

        searchButton.click();

        Thread.sleep(2000);

        WebElement seleniumElement = driver.findElement(By.xpath("//span[text()='\"Selenium\"']"));
        System.out.println(seleniumElement.getText());

        WebElement seleniumElement1 = driver.findElement(By.xpath("//span[.='\"Selenium\"']"));
        System.out.println(seleniumElement1.getText());

        driver.quit();


    }
}
